package gruppeh.yawl.graphics.figures;

/**
 * @author Mikkel
 * @author Sandie
 **/
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.pnml.tools.epnk.pnmlcoremodel.Place;

import yawl_net.PlaceType;
import yawl_net.PlaceTypes;

public class PlaceFigure extends org.pnml.tools.epnk.gmf.extensions.graphics.figures.PlaceFigure {

	
	public PlaceFigure(Place place) {
		super(place);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);
		
		if (place instanceof yawl_net.Place){
			yawl_net.Place yawl_place = (yawl_net.Place)place;
			PlaceType type = yawl_place.getType();

			if(type == null){
				return;
			}

			graphics.pushState();

			Rectangle rectangle = this.getClientArea();
			int cx = rectangle.x + rectangle.width/2;
			int cy = rectangle.y + rectangle.height/2;

			graphics.setLineWidth(1);
			
			if (type.getText().equals(PlaceTypes.START)){
				/*
				Display display = Display.getCurrent();
				Color black= display.getSystemColor(SWT.COLOR_BLACK);
				graphics.setForegroundColor(black);
				graphics.setBackgroundColor(black);
				*/
				graphics.drawPolygon(new int[]{cx-4,cy-4,cx+4,cy,cx-4,cy+4} );
			} else if (type.getText().equals(PlaceTypes.END)) {
				graphics.drawRectangle(cx-4, cy-4, 8, 8);
			} else if (type.getText().equals(PlaceTypes.NORMAL)){
				
			}
			graphics.popState();
		}
	}
	
	@Override
	public void update() {
		this.repaint();
	}

}
