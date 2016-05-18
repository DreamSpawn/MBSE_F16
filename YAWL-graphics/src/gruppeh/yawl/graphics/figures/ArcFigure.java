package gruppeh.yawl.graphics.figures;

import org.eclipse.swt.SWT;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;

import yawl_net.ArcType;
import yawl_net.ArcTypes;

/**
 * @author Mikkel
 * @author Sandie
 **/
public class ArcFigure extends org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure {

	public ArcFigure(Arc arc) {
		super(arc);
		this.update();
	}

	@Override
	public void update(){
		if (arc instanceof yawl_net.Arc){
			yawl_net.Arc yawl_arc = (yawl_net.Arc) arc;
			ArcType type = yawl_arc.getType();
			if (type == null || type.getText().equals(ArcTypes.NORMAL)){
				this.setLineStyle(SWT.LINE_SOLID);
			} else if (type.getText().equals(ArcTypes.RESET)){
				this.setLineStyle(SWT.LINE_DASH);
			}
		} else {
			this.setLineStyle(SWT.LINE_SOLID);
		}
	}
}
