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
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.experimental.chart.swt.ChartComposite;

/**
 * This class handles most of the functions of displaying a BarChart from
 * a CategoryDataset
 * @author Gustavo
 *
 */
public abstract class AbstractBarChart extends ViewPart {

	private ChartComposite cp;
	private String title;
	private String domainName;
	private String rangeName;
	
	/**
	 * Create a BarChart with a title, x axis name, and y axis name.
	 * @param title
	 * @param domainName
	 * @param rangeName
	 */
	public AbstractBarChart(String title, String domainName, String rangeName) {
		this.title = title;
		this.domainName = domainName;
		this.rangeName = rangeName;
	}
	
	/**
	 * Concrete subclasses must be able to create a dataset for displaying
	 * on this barchart
	 * @return
	 */
	abstract CategoryDataset createDataset();
	
	/**
	 * This method is called by eclipse to set up the layout
	 * for this partview. In this case, it uses a form layout to
	 * put the chart on the left and the controls on the right 
	 * of the base composite.
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite chart = setUpChart(parent);
		Composite controls = setUpControls(parent);
		
		FormLayout parentLayout = new FormLayout();
		parentLayout.marginWidth = 5;
		parentLayout.marginHeight = 5;
		
		FormData chartData = new FormData();
		chartData.left = new FormAttachment(0,10);
		chartData.top = new FormAttachment(0,10);
		chartData.bottom = new FormAttachment(100,-10);
		chartData.right = new FormAttachment(controls, 0, SWT.LEFT);
		chart.setLayoutData(chartData);
		
		FormData controlData = new FormData();
		controlData.right = new FormAttachment(100,0);
		//controlData.bottom = new FormAttachment(100,0);
		controlData.top = new FormAttachment(0,10);
		controlData.width = 100; // doesn't do anything
		controls.setLayoutData(controlData);
		parent.setLayout(parentLayout);
		generateGraph();
		parent.redraw();
	}
	
	/**
	 * By default it creates a Composite ('controls') parented
	 * to the input parameter with a single button that tells this 
	 * object to regenerate the graph. Subclasses can override and
	 * make super calls to this method to add more controls to a bar chart.
	 * 
	 * @param parent Parent of the controls.
	 * @return Composite holding the controls, parented to the top level composite
	 */
	private Composite setUpControls(Composite parent) {
		Composite controls = new Composite(parent, SWT.BORDER);
		RowLayout rl = new RowLayout();
		rl.justify = true;
		rl.pack = false;
		rl.type = SWT.VERTICAL;
		controls.setLayout(rl);
		Button button = new Button(controls, SWT.PUSH);
		button.setText("Draw");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				generateGraph();
			}
		});
		return controls;
	}
	
	/**
	 * Creates a chart parented to the input parameter
	 * @param parent Parent of the chart created within
	 * @return the chart that was created
	 */
	private Composite setUpChart(Composite parent) {
		return cp = new ChartComposite(parent, SWT.NONE, null, true);
	}
	
	/**
	 * Creates a JFreeChart object based on the abstract dataset
	 * method and re-renders the graph.
	 */
	private void generateGraph() {
		final CategoryDataset dataset = createDataset(); 
		final JFreeChart chart = ChartFactory.createBarChart(
	            title,         // chart title
	            domainName,               // domain axis label
	            rangeName,                  // range axis label
	            dataset,                  // data
	            PlotOrientation.VERTICAL, // orientation
	            true,                     // include legend
	            true,                     // tooltips?
	            false                     // URLs?
	        );
		BarRenderer renderer = (BarRenderer) chart.getCategoryPlot().getRenderer();
		//hack to make the bars wider
	    renderer.setItemMargin(dataset.getColumnCount() == 0 ? 1 : -10/dataset.getColumnCount());
		cp.setChart(chart);
		cp.redraw();
	}

	/**
	 * Doesn't do anything by default.
	 */
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}
	
	

}
