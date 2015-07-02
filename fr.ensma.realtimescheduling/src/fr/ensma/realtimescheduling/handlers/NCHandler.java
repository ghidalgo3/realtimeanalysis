package fr.ensma.realtimescheduling.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import analysis.ModelInterface;

/**
 * Handler for the Network Calculus analysis 
 * 
 * @author Reda
 */
public class NCHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		HandlerUtils.holisticAnalysis(
				ModelInterface.networkCalculus(), event);
		return null;
	}


}
