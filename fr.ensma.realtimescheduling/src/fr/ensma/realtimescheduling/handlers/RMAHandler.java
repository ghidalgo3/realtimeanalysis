package fr.ensma.realtimescheduling.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import analysis.ModelInterface;

/**
 * This class delegates Handling of the RMA command to the ModelInterface
 * class and displays information to the user about the results.
 * @author Gustavo Hidalgo
 * @version 1.0
 */
public class RMAHandler extends AbstractHandler {

	
	/**
	 * Receive a Command from the UI and respond to it
	 * The event is only used to find the active workbench,
	 * of some other related UI component. 
	 * we could ignore it if we wanted to and we do.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		HandlerUtils.holisticAnalysis(ModelInterface.allByRateMonotonic(), event);
		return null;
	}
	
	

}
