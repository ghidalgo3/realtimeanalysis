package fr.ensma.realtimescheduling.handlers;

import java.util.List;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;


/**
 * Functions common to all the other handlers in this package
 * @author Gustavo
 */
public class HandlerUtils {

	/**
	 * Helper method displays a dialog box to the user with an 'Ok' button.
	 * @param window The window it belongs to (?)
	 * @param message Contents of the dialog box
	 */
	static void showDialog(IWorkbenchWindow window, String message) {
		MessageDialog.openInformation(
				window.getShell(),
				"Analysis",
				message);
	}
	
	/**
	 * Displays a list of messages to the user or tells them that the 
	 * system hasn't been validated.
	 * @param results Results of some analysis
	 * @param event Used to get some UI information
	 * @throws ExecutionException Eclipse non-sense
	 */
	static void holisticAnalysis(List<String> results, ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		if (results == null) {
			HandlerUtils.showDialog(window, "Please 'Validate' the model first.");
		} else {
			StringBuilder sb = new StringBuilder("Results\n");
			results.stream().forEach(s -> sb.append(s).append("\n"));
			HandlerUtils.showDialog(window, sb.toString());
		}
	}
	
}
