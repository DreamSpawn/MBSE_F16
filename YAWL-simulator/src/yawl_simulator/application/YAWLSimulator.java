package yawl_simulator.application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.applications.ui.ApplicationUIManager;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

import yawl_annotations.EnabledTrasition;
import yawl_annotations.Marking;
import yawl_annotations.SelectArc;
import yawl_net.Arc;
import yawl_net.ArcTypes;
import yawl_net.Place;
import yawl_net.PlaceTypes;
import yawl_net.Transition;
import yawl_net.TransitionTypes;
import yawl_annotations.YAWLAnnotationsFactory;

public class YAWLSimulator extends ApplicationWithUIManager {

	public YAWLSimulator(PetriNet petrinet) {
		super(petrinet);
		getNetAnnotations().setName("YAWLnet simulator");
		ApplicationUIManager manager = this.getPresentationManager();
//		manager.addActionHandler(new FireTransitionHandler(this));
		manager.addActionHandler(new SelectArcHandler(this));
		manager.addPresentationHandler(new YAWLPresentationHandler());
	}

	@Override
	protected void initializeContents() {
		FlatAccess flatNet = new FlatAccess(this.getPetrinet());
		NetAnnotation initialAnnotation = NetannotationsFactory.eINSTANCE.createNetAnnotation();

		Set<Place> placeMarkings = setStartPlaceMarking(initialAnnotation, flatNet);
		setEnabledTrasitions(initialAnnotation, flatNet, placeMarkings);
		setSelectArcs(initialAnnotation, placeMarkings);
		initialAnnotation.setNet(this.getPetrinet());

		this.getNetAnnotations().getNetAnnotations().add(initialAnnotation);
		this.getNetAnnotations().setCurrent(initialAnnotation);
	}

	private void setSelectArcs(NetAnnotation annotation, Set<Place> placeMarking) {
		ArrayList<EnabledTrasition> trasitionList = new ArrayList<EnabledTrasition>();
		for (ObjectAnnotation objectAnnotation : annotation.getObjectAnnotations()) {
			if (objectAnnotation instanceof EnabledTrasition)
				trasitionList.add((EnabledTrasition) objectAnnotation);
		}

		for (EnabledTrasition transition : trasitionList) {
			if (transition.getObject() instanceof Transition) {
				Transition yawlTransition = (Transition) transition.getObject();
				if (yawlTransition.getJoin() != null
						&& yawlTransition.getJoin().getText().equals(TransitionTypes.XOR)) {
					boolean first = true;
					for (org.pnml.tools.epnk.pnmlcoremodel.Arc arc : yawlTransition.getIn()) {
						if (placeMarking.contains(arc.getSource())) {
							SelectArc select = YAWLAnnotationsFactory.eINSTANCE.createSelectArc();
							select.setObject(arc);
							select.setTargetTransition(transition);
							transition.getInArcs().add(select);
							if (first) {
								select.setSelected(true);
								first = false;
							}
							annotation.getObjectAnnotations().add(select);
						}
					}
				}
				if (yawlTransition.getSplit() != null && (yawlTransition.getSplit().getText().equals(TransitionTypes.OR)
						|| yawlTransition.getSplit().getText().equals(TransitionTypes.XOR))) {
					boolean first = true;
					for (org.pnml.tools.epnk.pnmlcoremodel.Arc arc : yawlTransition.getOut()) {
						SelectArc select = YAWLAnnotationsFactory.eINSTANCE.createSelectArc();
						select.setObject(arc);
						select.setSourceTransition(transition);
						transition.getOutArcs().add(select);
						if (first) {
							select.setSelected(true);
							if (yawlTransition.getSplit().getText().equals(TransitionTypes.XOR))
								first = false;
						}
						annotation.getObjectAnnotations().add(select);
					}
				}
			}
		}

	}

	private Set<Place> setStartPlaceMarking(NetAnnotation annotation, FlatAccess flatNet) {
		Set<Place> markingMap = new HashSet<Place>();
		for (org.pnml.tools.epnk.pnmlcoremodel.Place place : flatNet.getPlaces()) {
			if (place instanceof Place) {
				Place yawlPlace = (Place) place;
				if (yawlPlace.getType() != null && yawlPlace.getType().getText().equals(PlaceTypes.START)) {
					markingMap.add(yawlPlace);
					Marking marking = YAWLAnnotationsFactory.eINSTANCE.createMarking();
					marking.setValue(1);
					marking.setObject(place);
					annotation.getObjectAnnotations().add(marking);
					for (PlaceNode ref : flatNet.getRefPlaces(place)) {
						Marking markingRef = YAWLAnnotationsFactory.eINSTANCE.createMarking();
						markingRef.setValue(1);
						markingRef.setObject(ref);
						annotation.getObjectAnnotations().add(markingRef);
					}
				}
			}
		}
		return markingMap;
	}

	private void setEnabledTrasitions(NetAnnotation annotation, FlatAccess flatNet, Set<Place> placeMarkings) {
		for (org.pnml.tools.epnk.pnmlcoremodel.Transition transition : flatNet.getTransitions()) {
			if (transition instanceof Transition) {
				Transition yawlTransition = (Transition) transition;
				boolean enabled = true;
				if (yawlTransition.getJoin() == null
						|| yawlTransition.getJoin().getText().equals(TransitionTypes.AND)) {
					// is of type AND or not set
					for (org.pnml.tools.epnk.pnmlcoremodel.Arc arc : yawlTransition.getIn()) {
						if (arc instanceof Arc) {
							Arc yawlArc = (Arc) arc;
							if (yawlArc.getType() == null || yawlArc.getType().getText().equals(ArcTypes.NORMAL)) {
								if (yawlArc.getSource() instanceof Place) {
									Place place = (Place) yawlArc.getSource();
									if (!placeMarkings.contains(place)) {
										enabled = false;
										break;
									}
								}
							}
						}
					}
				} else {
					// is of type XOR or OR
					enabled = false;
					for (org.pnml.tools.epnk.pnmlcoremodel.Arc arc : yawlTransition.getIn()) {
						if (arc instanceof Arc) {
							Arc yawlArc = (Arc) arc;
							if (yawlArc.getType() == null || yawlArc.getType().getText().equals(ArcTypes.NORMAL)) {
								if (yawlArc.getSource() instanceof Place) {
									Place place = (Place) yawlArc.getSource();
									if (placeMarkings.contains(place)) {
										enabled = true;
										break;
									}
								}
							} else {
								enabled = true;
								break;
							}
						}
					}
				}

				if (enabled) {
					EnabledTrasition enabledTransition = YAWLAnnotationsFactory.eINSTANCE.createEnabledTrasition();
					enabledTransition.setObject(yawlTransition);
					annotation.getObjectAnnotations().add(enabledTransition);
					for (TransitionNode ref : flatNet.getRefTransitions(yawlTransition)) {
						EnabledTrasition enabledTransitionRef = YAWLAnnotationsFactory.eINSTANCE.createEnabledTrasition();
						enabledTransitionRef.setObject(ref);
						annotation.getObjectAnnotations().add(enabledTransitionRef);
					}
				}
			}
		}
	}

}
