package fr.ensma.realtimescheduling.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import fr.ensma.realtimescheduling.analysis.ModelInterface;

/**
 * Handler for the improved end to end analysis that considers the serialization
 * effect
 * 
 * @author Gustavo
 */
public class ImprovedETEAHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		HandlerUtils.holisticAnalysis(
				ModelInterface.improvedEndToEndAnalysis(), event);
		return null;
	}


}
