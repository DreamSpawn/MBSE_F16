package YAWLSimulator;

import java.util.HashMap;
import java.util.Map;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;

import YAWLAnnotations.Marking;
import YAWLAnnotations.YAWLsimFactory;
import YAWL_net.Place;
import YAWL_net.PlaceTypes;


public class YAWLSimulator extends ApplicationWithUIManager {

	public YAWLSimulator(PetriNet petrinet) {
		super(petrinet);
		getNetAnnotations().setName("YAWLnet simulator");
	}
	
	@Override
	protected void initializeContents() {
		FlatAccess flatNet = new FlatAccess(this.getPetrinet());
		NetAnnotation initialAnnotation = NetannotationsFactory.eINSTANCE.createNetAnnotation();
		
		setStartPlaceMarking(initialAnnotation, flatNet);
		//TODO create initial transition and arc markings
		initialAnnotation.setNet(this.getPetrinet());
		
		this.getNetAnnotations().getNetAnnotations().add(initialAnnotation);
		this.getNetAnnotations().setCurrent(initialAnnotation);
	}
	
	private void setStartPlaceMarking(NetAnnotation annotation, FlatAccess flatNet){
		for (org.pnml.tools.epnk.pnmlcoremodel.Place place: flatNet.getPlaces()) {
			if (place instanceof Place) {
				Place yawlPlace = (Place) place;
				if ( yawlPlace.getType() != null && yawlPlace.getType().getText().equals(PlaceTypes.START)) {
					Marking marking = YAWLsimFactory.eINSTANCE.createMarking();
					marking.setValue(1);
					marking.setObject(place);
					annotation.getObjectAnnotations().add(marking);
					for (PlaceNode ref: flatNet.getRefPlaces(place)) {
						Marking markingRef = YAWLsimFactory.eINSTANCE.createMarking();
						markingRef.setValue(1);
						markingRef.setObject(place);
						annotation.getObjectAnnotations().add(markingRef);	
					}
				} 
			}
		}
	}

}
