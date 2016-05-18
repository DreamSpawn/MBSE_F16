package yawl_simulator.application;

import java.util.List;

import org.eclipse.draw2d.MouseEvent;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;

import yawl_annotations.EnabledTrasition;
import yawl_annotations.SelectArc;
import yawl_net.Transition;
import yawl_net.TransitionType;
import yawl_net.TransitionTypes;

/**
* @author Mikkel
**/
public class SelectArcHandler implements IActionHandler {

	private YAWLSimulator simulaor;
	
	public SelectArcHandler(YAWLSimulator yawlSimulator) {
		super();
		this.simulaor = yawlSimulator;
	}

	@Override
	public boolean mouseDoubleClicked(MouseEvent arg0, ObjectAnnotation annotation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mousePressed(MouseEvent arg0, ObjectAnnotation annotation) {
		if (annotation instanceof SelectArc){
			SelectArc arc = (SelectArc) annotation;
			EnabledTrasition transition;
			List<SelectArc> arcList;
			TransitionType type;
			if (arc.getSourceTransition() != null){
				transition = arc.getSourceTransition();
				arcList = transition.getOutArcs();
				type = ((Transition)transition.getObject()).getSplit();
			} else if (arc.getSourceTransition() != null) {
				transition = arc.getSourceTransition();
				arcList = transition.getInArcs();
				type = ((Transition)transition.getObject()).getJoin();
			} else {
				// this shouldn't be possible
				return false;
			}
			if (type != null && type.getText() == TransitionTypes.XOR){
				if(arc.isSelected()) {
					return true;
				} else {
					for (SelectArc sArc: arcList){
						sArc.setSelected(false);
					}
					arc.setSelected(true);
				}
			} else {
				// this should only happen for OR split
				if(arc.isSelected()) {
					int count = 0;
					for (SelectArc sArc: arcList){
						count = sArc.isSelected() ? count + 1 : count;
					}
					arc.setSelected(count > 1 ? false : true);
				} else {
					arc.setSelected(true);
				}
			}
			simulaor.update();
			return true;
		}
		return false;
	}

	@Override
	public boolean mouseReleased(MouseEvent arg0, ObjectAnnotation annotation) {
		// TODO Auto-generated method stub
		return false;
	}

}
