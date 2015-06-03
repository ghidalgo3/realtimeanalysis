package fr.ensma.realtimescheduling.views;


import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.ui.part.ViewPart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.gantt.XYTaskDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.experimental.chart.swt.ChartComposite;
import analysis.ModelInterface;
import fr.ensma.realtimescheduling.Partition;

/**
 * This class handles the graphing aspects of the plugin.
 * 
 * 
 * @author Gustavo
 *
 */
public class ChartView extends ViewPart {
	
	private Combo partitionCombo;
	private Combo functionCombo; 
	private Spinner periodSpinner;
	private ChartComposite functionChart;
	private ChartComposite intervalChart;
	private FunctionAttributes currentFunction = FunctionAttributes.SUPPLY;
	private int currentPartition;
	
	/**
	 * Doesn't really do anything, just used by eclipse to construct this thing.
	 */
	public ChartView() {
		System.out.println("ChartView was constructed!");
	}
	
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
		
//		FormData intervalData = new FormData();
//		intervalData.left = new FormAttachment(0, 0);
//		intervalData.height = 200;
//		intervalData.bottom = new FormAttachment(100,0);
//		intervalData.right = new FormAttachment(100,0);
//		intervalData.top = new FormAttachment(chart, 0, SWT.BOTTOM);
//		intervals.setLayoutData(intervalData);
		
		parent.setLayout(parentLayout);
		generateGraphs();
		parent.redraw();
	}
	
	/**
	 * This needs to hook into generate graph
	 * @param parent
	 * @return
	 */
	private Composite setUpPartitionChart(Composite parent) {
		intervalChart = new ChartComposite(parent, SWT.NONE, null, true);
		intervalChart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				generateGraphs();
			}
		});
		return intervalChart;
	}

	/**
	 * This creates the controls for this view
	 * which allows the user to specify which partition
	 * and which function to graph, how many periods to graph over
	 * and to re-query the model for new partitions.
	 * @param parent The composite eclipse gives us
	 * @return A new composite that is a child of the Composite passed in with the
	 * 			controls as children.
	 */
	private Composite setUpSelectors(Composite parent) {
		Composite selectors = new Composite(parent, SWT.BORDER);
		RowLayout r = new RowLayout();
		r.justify = true;
		r.pack = false;
		r.type = SWT.VERTICAL;
		selectors.setLayout(r);
		Label functionName = new Label(selectors, SWT.NONE);
		functionName.setText("Function");
		functionCombo = new Combo(selectors, SWT.READ_ONLY);
		Label partitionName = new Label(selectors, SWT.NONE);
		partitionName.setText("Partition (Validate First)");
		functionCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				currentFunction = Arrays.stream(FunctionAttributes.values())
					.filter(fa -> fa.getTitle().equals(functionCombo.getText()))
					.findFirst()
					.get();
				//generateGraphs();
			}
		});
		functionCombo.setItems(
				Arrays.stream(FunctionAttributes.values())
				.map(f -> f.getTitle())
				.collect(Collectors.toList())
				.toArray(new String[0]));
		partitionCombo = new Combo(selectors, SWT.READ_ONLY);
		partitionCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				currentPartition = Integer.parseInt(partitionCombo.getText());
			}
		});
		
		Button query = new Button(selectors, SWT.PUSH);
		query.setText("Query partitions");
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
				generateGraphs();
			}
		});
		Label periods = new Label(selectors, SWT.NONE);
		periods.setText("Periods to draw");
		periodSpinner = new Spinner(selectors, SWT.NONE);
		periodSpinner.setMinimum(1);
		return selectors;
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
	private Composite setUpChart(Composite parent) {
		functionChart = new ChartComposite(parent, SWT.NONE, null, true);
//		cp.setLayoutData(new RowData(400,400));
		return functionChart;
	}
	
	/**
	 * Asks the model for the list of partitions,
	 * gets their names, and sets up the
	 * partition selector combo box.
	 */
	private void queryModel() {
		try {
			final List<fr.ensma.realtimescheduling.Partition> partitions = ModelInterface.allPartitions;
			partitionCombo.setItems(partitions.stream().map(p -> p.getId() + "").collect(Collectors.toList()).toArray(new String[0]));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Creates the dataset object and populates it with data.
	 * We use the name of the partition to generate the data
	 * @return an XYDataset
	 */
	private XYDataset createDataset() {  
		  final DefaultXYDataset result = new DefaultXYDataset();
		  if(ModelInterface.allPartitions != null) {
			  Partition p = ModelInterface.allPartitions
					  .stream()
					  .filter(x -> x.getId() == currentPartition) //safe as long as ID is a primitive!
					  .findFirst().orElse(null);
			  result.addSeries(currentPartition, currentFunction.generateData(p, periodSpinner.getSelection()));
		  }
		  return result;
	}

	
	/**
	 * Looks at the currently selected attribute
	 * and currently selected partition
	 * and regenerates the graph
	 */
	private void generateGraphs() {
		//function chart
		final XYDataset dataset = createDataset(); 
		final JFreeChart chart = ChartFactory.createXYLineChart(currentFunction.getTitle(),
				currentFunction.getDomainName(), //x axis name
				currentFunction.getRangeName(), //y axis name
				dataset, //data
				PlotOrientation.VERTICAL, //orientation
				false, 
				false,
				false);
		functionChart.setChart(chart);
		functionChart.redraw();
		//interval chart
//		final XYTaskDataset taskDataset = createTaskDataset();
//		final JFreeChart taskChart = ChartFactory.createXYBarChart("Intervals used",
//				"",
//				true,
//				"time",
//				taskDataset,
//				PlotOrientation.HORIZONTAL,
//				false,
//				false,
//				false);
//		intervalChart.setChart(taskChart);
//		intervalChart.redraw();
	}
	
	/**
	 * Doesn't work as intended right now. Ignore.
	 * @return
	 */
	private XYTaskDataset createTaskDataset() {
		TaskSeries ts = new TaskSeries("Intervals");
		TaskSeriesCollection tsc = new TaskSeriesCollection();
		try {
			ModelInterface.allPartitions
				.stream()
				.flatMap(p -> p.getExecutionIntervals().stream())
				.sorted(ModelInterface::intervalByStart)
				.map(i -> new Task("", new Date((long) i.getStart()), new Date((long) i.getEnd())))
				.forEachOrdered(t -> ts.add(t));
			tsc.add(ts);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new XYTaskDataset(tsc);
	}

	/**
	 * Every time the focus is set on the Chart, reconstruct the chart.
	 * May not be the best idea.
	 * This method is called by eclipse everytime this view is focused.
	 */
	@Override
	public void setFocus() {
//		queryModel();
//		generateGraphs();
	}
	
}