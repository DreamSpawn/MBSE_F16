package YAWL_net;

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

/**
 * This is a constraint saying that a YAWL net should have exactly one start place and one
 * end place.
 *
 * @author ekki@dtu.dk
 * @generated NOT
 */
public class StartEndConditions extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();

		if (object instanceof YAWL_NetType) {
			EObject container = object.eContainer();
			if (container instanceof PetriNet) {
				int startCount = 0;
				int endCount = 0;
				Iterator<EObject> iterator = container.eAllContents();
				while (iterator.hasNext()) {
					EObject content = iterator.next();

					if(content instanceof Place){
						Place place = (Place) content;
						if(place.getType().equals(PlaceTypes.START)){ startCount++;	}
						if(place.getType().equals(PlaceTypes.END)){	endCount++;	}	
					}
				}
				if (startCount != 1 || endCount != 1) {
					// if there is not exactly one start place and exactly one
					// end place, return a failure status.
					return ctx.createFailureStatus(new Object[] {container});
					
				}
				
			}

		} 
		// otherwise return a success status
		return ctx.createSuccessStatus();
	}

}
