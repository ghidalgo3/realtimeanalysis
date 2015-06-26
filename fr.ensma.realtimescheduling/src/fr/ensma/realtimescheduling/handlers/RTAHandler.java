package fr.ensma.realtimescheduling.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import analysis.ModelInterface;

/**
 * Handles the case where the user wants the analysis to occur based on each
 * partition's selection of scheduling algorithm As of 02/06/2015, the other
 * classes in this package are not used but they may or may not become useful in
 * the future.
 * 
 * @author Gustavo
 */
public class RTAHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		HandlerUtils.holisticAnalysis(
				ModelInterface.perPartitionSchedulingAnalysis(), event);
		return null;
	}

}
