package realtimeanalysis.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

public class AddDestinationToVL implements IExternalJavaAction {

	public AddDestinationToVL() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0,
			Map<String, Object> arg1) {
		EObject vl = (EObject)arg1.get("instance");
		System.out.println(vl);

	}

}
