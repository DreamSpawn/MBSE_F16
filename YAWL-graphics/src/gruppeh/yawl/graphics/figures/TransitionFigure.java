package gruppeh.yawl.graphics.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import yawl_net.TransitionType;
import yawl_net.TransitionTypes;

/**
 * @author Mikkel
 * @author Sandie
 **/
public class TransitionFigure extends org.pnml.tools.epnk.gmf.extensions.graphics.figures.TransitionFigure {

	public TransitionFigure(Transition transition) {
		super(transition);
	}

	@Override
	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);
		if (transition instanceof yawl_net.Transition) {
			yawl_net.Transition yawl_transition = (yawl_net.Transition) transition;
			TransitionType join = yawl_transition.getJoin();
			TransitionType split = yawl_transition.getSplit();

			graphics.pushState();
			graphics.setLineWidth(1);

			Rectangle rectangle = this.getClientArea();
			int ty = rectangle.y;
			int h = rectangle.height;
			int by = ty + h;
			int cy = ty + h / 2;

			int lx = rectangle.x;
			int w = rectangle.width;
			int rx = lx + w;
			int cx = lx + w / 2;

			graphics.drawLine(cx, ty, cx, by);
			int[] points = null;
			
			//draw the join
			if (join == null || join.getText() == TransitionTypes.AND) {
				points = new int[] { lx, ty, cx, cy, lx, by };
			} else if (join.getText() == TransitionTypes.OR) {
				points = new int[] { lx, cy, lx + w / 4, ty, cx, cy, lx + w / 4, by };
			} else if (join.getText() == TransitionTypes.XOR) {
				points = new int[] { cx, ty, lx, cy, cx, by };
			}
			graphics.drawPolygon(points);

			//draw the split
			if (split == null || split.getText() == TransitionTypes.AND) {
				points = new int[] { rx, ty, cx, cy, rx, by };
			} else if (split.getText() == TransitionTypes.OR) {
				points = new int[] { rx, cy, rx - w / 4, ty, cx, cy, rx - w / 4, by };
			} else if (split.getText() == TransitionTypes.XOR) {
				points = new int[] { cx, ty, rx, cy, cx, by };
			}
			graphics.drawPolygon(points);

			graphics.popState();
		}
	}

	@Override
	public void update() {
		this.repaint();
	}

}
