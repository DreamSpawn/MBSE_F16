package yawl_simulator.application;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.draw2d.MouseEvent;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;
import org.pnml.tools.epnk.helpers.FlatAccess;

import yawl_annotations.EnabledTrasition;
import yawl_net.Place;

public class FireTransitionHandler implements IActionHandler {

	private YAWLSimulator simulator;

	public FireTransitionHandler(YAWLSimulator simulator) {
		super();
		this.simulator = simulator;
	}
	
	@Override
	public boolean mouseDoubleClicked(MouseEvent arg0, ObjectAnnotation annotation) {
		if (annotation instanceof EnabledTrasition){
			FlatAccess flatNet = new FlatAccess(simulator.getPetrinet());
			NetAnnotation netannotations = NetannotationsFactory.eINSTANCE.createNetAnnotation();

			
			EnabledTrasition transition = (EnabledTrasition) annotation;
			Map<Place,Integer> placeMarkings = simulator.computeMarking();
			simulator.fireTransition(placeMarkings, transition);
			Set<Place> markedPlaces = new HashSet<>();
			for(Place place: placeMarkings.keySet()){
				if (placeMarkings.get(place) > 0) {
					simulator.markPlace(place, placeMarkings.get(place), flatNet, netannotations);
					markedPlaces.add(place);
				}
			}
			simulator.setEnabledTrasitions(netannotations, flatNet, markedPlaces);
			simulator.setSelectArcs(netannotations, markedPlaces);
			simulator.deleteNetAnnotationAfterCurrent();
			simulator.addNetAnnotationAsCurrent(netannotations);
			return true;
		}
		return false;
	}

	@Override
	public boolean mousePressed(MouseEvent arg0, ObjectAnnotation annotation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseReleased(MouseEvent arg0, ObjectAnnotation annotation) {
		// TODO Auto-generated method stub
		return false;
	}

}
