package fr.ensma.realtimescheduling.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import fr.ensma.realtimescheduling.analysis.ModelInterface;

/**
 * End to end analysis handler. No serialization effect.
 * @author Gustavo
 * @date Jul 1, 2015
 */
public class ETEAHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		HandlerUtils.holisticAnalysis(ModelInterface.endToEndAnalysis(), event);
		return null;
	}

}
