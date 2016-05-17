package yawl_simulator.application;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.swt.graphics.Color;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IPresentationHandler;
import org.pnml.tools.epnk.applications.ui.figures.PolylineOverlay;

import yawl_annotations.SelectArc;

/**
* @Mikkel & @Sandie
**/

public class YAWLPresentationHandler implements IPresentationHandler {

	@Override
	public IFigure handle(ObjectAnnotation annotation, AbstractGraphicalEditPart editPart) {
		if (annotation instanceof SelectArc){
			SelectArc arc = (SelectArc) annotation;
			ConnectionNodeEditPart graphicalEditPart = (ConnectionNodeEditPart) editPart;
			PolylineOverlay overlay = new PolylineOverlay(graphicalEditPart);
			Color color;
			if (arc.isSelected()){
				color = ColorConstants.green;
			} else {
				color = ColorConstants.red;
			}
			overlay.setForegroundColor(color);
			overlay.setBackgroundColor(color);
			return overlay;
		}

		return null;
	}

}
