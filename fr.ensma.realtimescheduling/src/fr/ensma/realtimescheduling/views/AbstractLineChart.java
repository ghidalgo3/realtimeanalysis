package fr.ensma.realtimescheduling.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.experimental.chart.swt.ChartComposite;

/**
 * Abstract class for all line charts.
 * Sets up the eclipse view to have a chart on the
 * left side and a control component on the right.
 * Subclasses define the data sources and any extra controls.
 * @author Gustavo
 *
 */
public abstract class AbstractLineChart extends ViewPart {

	ChartComposite mainChart;
	/**
	 * This is the meat of how this class creates its view.
	 * The Composite parameter is the View that we will be children
	 * of, Eclipse passes this in. Any widgets or whatever that we want to display
	 * has to directly or indirectly be parented to that Composite parent.
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite chart = setUpChart(parent);
		Composite selectors = setUpSelectors(parent);
		RowLayout r = new RowLayout();
		r.justify = true;
		r.fill = true;
		r.type = SWT.VERTICAL;
		selectors.setLayout(r);
		//here, make it so the chart takes up as much space as possible
		FormLayout parentLayout = new FormLayout();
		parentLayout.marginWidth = 5;
		parentLayout.marginHeight = 5;
		
		FormData chartData = new FormData();
		chartData.left = new FormAttachment(0,10);
		chartData.bottom = new FormAttachment(100,0);
		chartData.top = new FormAttachment(0,10);
		chart.setLayoutData(chartData);
		
		FormData selectorData = new FormData();
		selectorData.right = new FormAttachment(100,0);
		selectorData.top = new FormAttachment(0,10);
		selectorData.width = 200;
		chartData.right = new FormAttachment(selectors, 0, SWT.LEFT);
		selectors.setLayoutData(selectorData);
		Button query = new Button(selectors, SWT.PUSH);
		query.setText("Query");
		query.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseUp(MouseEvent e) {
				queryModel();
			}
		});
		Button refresh = new Button(selectors, SWT.PUSH);
		refresh.setText("Draw");
		refresh.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseUp(MouseEvent e) {
				mainChart.setChart(generateChart());
				mainChart.redraw();
			}
		});
		parent.setLayout(parentLayout);
		mainChart.setChart(generateChart());
		parent.redraw();
	}
	
	/**
	 * ChartComposite is a class provided by JFreeChart to allow 
	 * a JFreeChart object to exist within Eclipse.
	 * 
	 * Even though the chart is a composite, I don't think it
	 * is a good idea to make anything a child of the chart.
	 * @param parent
	 * @return Composite of the chart itself
	 */
	Composite setUpChart(Composite parent) {
		return mainChart = new ChartComposite(parent, SWT.NONE, null, true);
	}
	
	/**
	 * Subclasses create the chart in this method.
	 * @return a JFreeChart
	 */
	abstract JFreeChart generateChart();

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}
	
	/**
	 * Subclasses create any control widgets they want and parent
	 * them to the parameter of this method. This method should 
	 * return a single composite that is the parent of the controls.
	 * NOTE: The parameter returned should not be the parameter passed in,
	 * though the parameter returned should be a child of the parameter passed in.
	 * @param parent
	 * @return
	 */
	abstract Composite setUpSelectors(Composite parent);

	/**
	 * Creates the dataset used for plotting.
	 * @return
	 */
	abstract XYDataset createDataset();
	
	/**
	 * Used by a 'query' button that asks to update the UI based
	 * on the state of the system.
	 */
	abstract void queryModel();
}
