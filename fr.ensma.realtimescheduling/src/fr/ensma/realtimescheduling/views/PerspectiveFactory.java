package fr.ensma.realtimescheduling.views;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * Needed by eclipse in order to define a perspective but the perspective is
 * actually defined in the plugin.xml file as a perspective extension.
 * 
 * @author Gustavo
 */
public class PerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		// TODO Auto-generated method stub

	}

}
