package gruppeh.yawl.graphics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IArcFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;

import YAWL_net.YAWL_netPackage;
import gruppeh.yawl.graphics.figures.ArcFigure;

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
//			list.add(YAWL_netPackage.eINSTANCE.getPlace());
		}
		return list;
	}
	
	@Override
	public IArcFigure createArcFigure(Arc arc) {
		return new ArcFigure(arc);
	}

}