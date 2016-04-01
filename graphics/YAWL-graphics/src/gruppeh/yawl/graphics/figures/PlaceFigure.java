package gruppeh.yawl.graphics.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.pnml.tools.epnk.pnmlcoremodel.Place;

import YAWL_net.PlaceType;
import YAWL_net.PlaceTypes;

public class PlaceFigure extends org.pnml.tools.epnk.gmf.extensions.graphics.figures.PlaceFigure {

	
	public PlaceFigure(Place place) {
		super(place);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);
		
		if (place instanceof YAWL_net.Place){
			YAWL_net.Place yawl_place = (YAWL_net.Place)place;
			PlaceType type = yawl_place.getType();

			Rectangle rectangle = this.getClientArea();
			int cx = rectangle.x + rectangle.width/2;
			int cy = rectangle.y + rectangle.height/2;

			if (type.getText().equals(PlaceTypes.START)){
				graphics.drawPolygon(new int[]{cx-4,cy-4,cx+4,cy,cx-4,cy+4} );
			} else if (type.getText().equals(PlaceTypes.END)) {
				graphics.drawRectangle(cx-4, cy-4, 8, 8);
			} else if (type.getText().equals(PlaceTypes.NORMAL)){
				
			}
		}
	}
	
	@Override
	public void update() {
		this.repaint();
	}

}