package gruppeh.yawl.graphics.figures;

import org.eclipse.swt.SWT;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;

import YAWL_net.ArcType;
import YAWL_net.ArcTypes;


public class ArcFigure extends org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure {

	Arc arc;
	
	public ArcFigure(Arc arc) {
		super(arc);
		this.arc = arc;
		this.update();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(){
		if (arc instanceof YAWL_net.Arc){
			YAWL_net.Arc yawl_arc = (YAWL_net.Arc) arc;
			ArcType type = yawl_arc.getType();
			if (type.getText().equals(ArcTypes.NORMAL)){
				this.setLineStyle(SWT.LINE_SOLID);
			} else if (type.getText().equals(ArcTypes.RESET)){
				this.setLineStyle(SWT.LINE_DASH);
			}
		} else {
			this.setLineStyle(SWT.LINE_SOLID);
		}
	}
}
