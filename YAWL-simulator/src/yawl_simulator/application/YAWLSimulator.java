package yawl_simulator.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.applications.ui.ApplicationUIManager;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
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

/**
* @Mikkel
**/

public class YAWLSimulator extends ApplicationWithUIManager {

	public YAWLSimulator(PetriNet petrinet) {
		super(petrinet);
		getNetAnnotations().setName("YAWLnet simulator");
		ApplicationUIManager manager = this.getPresentationManager();
		manager.addActionHandler(new FireTransitionHandler(this));
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

	public void setSelectArcs(NetAnnotation annotation, Set<Place> placeMarking) {
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
					markPlace(yawlPlace, 1, flatNet, annotation);
				}
			}
		}
		return markingMap;
	}
	
	public void markPlace(Place place, int value, FlatAccess flatNet, NetAnnotation annotation) {
		Marking marking = YAWLAnnotationsFactory.eINSTANCE.createMarking();
		marking.setValue(value);
		marking.setObject(place);
		annotation.getObjectAnnotations().add(marking);
		for (PlaceNode ref : flatNet.getRefPlaces(place)) {
			Marking markingRef = YAWLAnnotationsFactory.eINSTANCE.createMarking();
			markingRef.setValue(value);
			markingRef.setObject(ref);
			annotation.getObjectAnnotations().add(markingRef);
		}
	}
	

	public Map<Place, Integer> computeMarking() {
		Map<Place, Integer> marking = new HashMap<Place, Integer>();
		for (ObjectAnnotation annotation : this.getNetAnnotations().getCurrent().getObjectAnnotations()) {
			if (annotation instanceof Marking) {
				Marking markingAnnotation = (Marking) annotation;
				Object object = markingAnnotation.getObject();
				if (object instanceof Place && markingAnnotation.getValue() > 0) {
					Place ptPlace = (Place) object;
					marking.put(ptPlace, markingAnnotation.getValue());
				}
			}
		}
		return marking;
	}

	public void setEnabledTrasitions(NetAnnotation annotation, FlatAccess flatNet, Set<Place> placeMarkings) {
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
						EnabledTrasition enabledTransitionRef = YAWLAnnotationsFactory.eINSTANCE
								.createEnabledTrasition();
						enabledTransitionRef.setObject(ref);
						annotation.getObjectAnnotations().add(enabledTransitionRef);
					}
				}
			}
		}
	}

	public void fireTransition(Map<Place, Integer> placeMarkings, EnabledTrasition transitionAnnotation) {
		if (transitionAnnotation.getObject() instanceof Transition) {
			Transition transition = (Transition) transitionAnnotation.getObject();
			
			// check join and remove tokens
			if (transition.getJoin() == null 
					|| transition.getJoin().getText() == TransitionTypes.AND
					|| transition.getJoin().getText() == TransitionTypes.OR) {
				for(org.pnml.tools.epnk.pnmlcoremodel.Arc arc: transition.getIn()){
					Node node = arc.getSource();
					if (!(node instanceof Place))
						continue;
					
					Place place = (Place) node;
					int value = placeMarkings.get(place) == null ? 0 : placeMarkings.get(place) -1;
					if (arc instanceof Arc){
						Arc yawl_arc = (Arc) arc;
						if (yawl_arc.getType() != null && yawl_arc.getType().getText() == ArcTypes.RESET)
							value = 0;
					}
					placeMarkings.put(place, value);
				}
			} else {
				// Join type == XOR
				for(SelectArc sArc: transitionAnnotation.getInArcs()){
					if (sArc.isSelected()){
						if (!(sArc.getObject() instanceof Arc))
							break;
						
						Arc arc = (Arc) sArc.getObject();
						if (!(arc.getSource() instanceof Place))
							break;
						
						Place place = (Place) arc.getSource();
						int value = placeMarkings.get(place) == null ? 0 : placeMarkings.get(place) -1;
						if (arc instanceof Arc){
							Arc yawl_arc = (Arc) arc;
							if (yawl_arc.getType() != null && yawl_arc.getType().getText() == ArcTypes.RESET)
								value = 0;
						}
						placeMarkings.put(place, value );
						break;
					}
				}
			}
			
			//check split and add tokens
			if (transition.getSplit() == null || transition.getSplit().getText() == TransitionTypes.AND){
				for (org.pnml.tools.epnk.pnmlcoremodel.Arc arc: transition.getOut()){
					if(!(arc.getTarget() instanceof Place))
						continue;
					
					Place place = (Place) arc.getTarget();
					int value = placeMarkings.get(place) == null ? 1 : placeMarkings.get(place) +1;
					placeMarkings.put(place, value );
				}
			} else {
				// split = OR / XOR
				for (SelectArc sArc: transitionAnnotation.getOutArcs()){
					if(!sArc.isSelected())
						continue;
					
					if(!(sArc.getObject() instanceof Arc))
						continue;
					Arc arc = (Arc) sArc.getObject();
					
					if(!(arc.getTarget() instanceof Place))
						continue;
					
					Place place = (Place) arc.getTarget();
					int value = placeMarkings.get(place) == null ? 1 : placeMarkings.get(place) +1;
					placeMarkings.put(place, value );
				}
			}
		}
	}
}
