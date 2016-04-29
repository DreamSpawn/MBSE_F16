package YAWLSimulator;

import java.util.HashMap;
import java.util.Map;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

import YAWLAnnotations.EnabledTrasition;
import YAWLAnnotations.Marking;
import YAWLAnnotations.YAWLsimFactory;
import YAWL_net.Arc;
import YAWL_net.ArcTypes;
import YAWL_net.Place;
import YAWL_net.PlaceTypes;
import YAWL_net.Transition;
import YAWL_net.TransitionTypes;

public class YAWLSimulator extends ApplicationWithUIManager {

	public YAWLSimulator(PetriNet petrinet) {
		super(petrinet);
		getNetAnnotations().setName("YAWLnet simulator");
	}

	@Override
	protected void initializeContents() {
		FlatAccess flatNet = new FlatAccess(this.getPetrinet());
		NetAnnotation initialAnnotation = NetannotationsFactory.eINSTANCE.createNetAnnotation();

		Map<Place, Integer> placeMarkings = setStartPlaceMarking(initialAnnotation, flatNet);
		setEnabledTrasitions(initialAnnotation, flatNet, placeMarkings);
		setSelctArcs(initialAnnotation);
		initialAnnotation.setNet(this.getPetrinet());

		this.getNetAnnotations().getNetAnnotations().add(initialAnnotation);
		this.getNetAnnotations().setCurrent(initialAnnotation);
	}

	private void setSelctArcs(NetAnnotation annotation) {
		// TODO Auto-generated method stub
		for (ObjectAnnotation objectAnnotation: annotation.getObjectAnnotations()){
			if (objectAnnotation instanceof EnabledTrasition){
				EnabledTrasition transition = (EnabledTrasition) objectAnnotation;
				if (transition.getObject() instanceof Transition){
					Transition yawlTransition = (Transition) transition.getObject();
					if (yawlTransition.getJoin() != null && yawlTransition.getJoin().getText().equals(TransitionTypes.XOR)){
						
					}
					if (yawlTransition.getSplit() != null && 
						(yawlTransition.getSplit().getText().equals(TransitionTypes.OR) ||
						yawlTransition.getSplit().getText().equals(TransitionTypes.XOR))){
						
					}
				}
			}
		}
	}

	private Map<Place, Integer> setStartPlaceMarking(NetAnnotation annotation, FlatAccess flatNet) {
		Map<Place, Integer> markingMap = new HashMap<Place, Integer>();
		for (org.pnml.tools.epnk.pnmlcoremodel.Place place : flatNet.getPlaces()) {
			if (place instanceof Place) {
				Place yawlPlace = (Place) place;
				if (yawlPlace.getType() != null && yawlPlace.getType().getText().equals(PlaceTypes.START)) {
					markingMap.put(yawlPlace, 1);
					Marking marking = YAWLsimFactory.eINSTANCE.createMarking();
					marking.setValue(1);
					marking.setObject(place);
					annotation.getObjectAnnotations().add(marking);
					for (PlaceNode ref : flatNet.getRefPlaces(place)) {
						Marking markingRef = YAWLsimFactory.eINSTANCE.createMarking();
						markingRef.setValue(1);
						markingRef.setObject(ref);
						annotation.getObjectAnnotations().add(markingRef);
					}
				}
			}
		}
		return markingMap;
	}

	private void setEnabledTrasitions(NetAnnotation annotation, FlatAccess flatNet, Map<Place, Integer> placeMarkings) {
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
									if (!placeMarkings.containsKey(place)) {
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
									if (!placeMarkings.containsKey(place)) {
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
					EnabledTrasition enabledTransition = YAWLsimFactory.eINSTANCE.createEnabledTrasition();
					enabledTransition.setObject(yawlTransition);
					annotation.getObjectAnnotations().add(enabledTransition);
					for (TransitionNode ref : flatNet.getRefTransitions(yawlTransition)) {
						EnabledTrasition enabledTransitionRef = YAWLsimFactory.eINSTANCE.createEnabledTrasition();
						enabledTransitionRef.setObject(ref);
						annotation.getObjectAnnotations().add(enabledTransitionRef);
					}
				}
			}
		}
	}

}
