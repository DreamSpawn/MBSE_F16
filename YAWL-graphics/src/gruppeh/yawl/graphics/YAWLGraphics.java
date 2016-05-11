package gruppeh.yawl.graphics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IArcFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import gruppeh.yawl.graphics.figures.ArcFigure;
import gruppeh.yawl.graphics.figures.PlaceFigure;
import gruppeh.yawl.graphics.figures.TransitionFigure;
import yawl_net.YAWL_netPackage;

public class YAWLGraphics extends GraphicalExtension {
	
	@Override
	public List<EClass> getExtendedNetTypes() {
		ArrayList<EClass> list = new ArrayList<EClass>();
		list.add(YAWL_netPackage.eINSTANCE.getYAWL_NetType());
		return list;
	}
	
	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		ArrayList<EClass> list = new ArrayList<EClass>();
		if (netType.equals(YAWL_netPackage.eINSTANCE.getYAWL_NetType())) {
			list.add(YAWL_netPackage.eINSTANCE.getArc());
			list.add(YAWL_netPackage.eINSTANCE.getPlace());
			list.add(YAWL_netPackage.eINSTANCE.getTransition());
		}
		return list;
	}
	
	@Override
	public IArcFigure createArcFigure(Arc arc) {
		return new ArcFigure(arc);
	}
	
	@Override
	public IUpdateableFigure createPlaceFigure(Place place) {
		return new PlaceFigure(place);
	}

	@Override
	public IUpdateableFigure createTransitionFigure(Transition transition) {
		return new TransitionFigure(transition);
	}

}
