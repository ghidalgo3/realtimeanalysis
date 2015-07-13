package fr.ensma.realtimescheduling.views;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;
import fr.ensma.realtimescheduling.Partition;
import fr.ensma.realtimescheduling.analysis.ModelInterface;

/**
 * This class handles the XY line graphing aspects of the plugin.
 * 
 * @author Gustavo
 */
public class PartitionFunctionsView extends AbstractLineChart {

	private Combo partitionCombo;
	private Combo functionCombo;
	private Spinner periodSpinner;
	private FunctionAttributes currentFunction = FunctionAttributes.SUPPLY;
	private String currentPartition;

	/**
	 * This creates the controls for this view which allows the user to specify
	 * which partition and which function to graph, how many periods to graph
	 * over and to re-query the model for new partitions.
	 * 
	 * @param parent
	 *            The composite eclipse gives us
	 * @return A new composite that is a child of the Composite passed in with
	 *         the controls as children.
	 */
	@Override
	Composite setUpSelectors(Composite parent) {
		Composite selectors = new Composite(parent, SWT.BORDER);
		Composite innerSelectors = new Composite(selectors, SWT.DEFAULT);
		
		Label functionName = new Label(innerSelectors, SWT.NONE);
		functionName.setText("Function");
		functionName.setLayoutData(new RowData()); //start here
		functionCombo = new Combo(innerSelectors, SWT.READ_ONLY);
		functionCombo.setLayoutData(new RowData()); //start here
		Label partitionName = new Label(innerSelectors, SWT.NONE);
		partitionName.setLayoutData(new RowData()); //start here
		partitionName.setText("Partition (Validate First)");
		functionCombo.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				currentFunction = Arrays
						.stream(FunctionAttributes.values())
						.filter(fa -> fa.getTitle().equals(
								functionCombo.getText())).findFirst().get();
			}
		});
		functionCombo.setItems(Arrays.stream(FunctionAttributes.values())
				.map(f -> f.getTitle()).collect(Collectors.toList())
				.toArray(new String[0]));
		partitionCombo = new Combo(innerSelectors, SWT.READ_ONLY);
		partitionCombo.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				currentPartition = partitionCombo.getText();
			}
		});
		partitionCombo.setLayoutData(new RowData()); //start here
		Label periods = new Label(innerSelectors, SWT.NONE);
		periods.setText("Periods to draw");
		periods.setLayoutData(new RowData()); //start here
		periodSpinner = new Spinner(innerSelectors, SWT.NONE);
		periodSpinner.setMinimum(1);
		periodSpinner.setLayoutData(new RowData()); //start here
		RowLayout r = new RowLayout();
		r.justify = false;
		r.fill = true;
		r.type = SWT.VERTICAL;
		r.pack = false;
		innerSelectors.setLayout(r);
		RowLayout ver = new RowLayout();
		ver.type = SWT.VERTICAL;
		selectors.setLayout(ver);
		return selectors;
	}


	/**
	 * Asks the model for the list of partitions, gets their names, and sets up
	 * the partition selector combo box.
	 */
	@Override
	void queryModel() {
		try {
			final List<fr.ensma.realtimescheduling.Partition> partitions = ModelInterface.allPartitions;
			partitionCombo.setItems(partitions.stream()
					.map(p -> p.getId() + "").collect(Collectors.toList())
					.toArray(new String[0]));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creates the dataset object and populates it with data. We use the name of
	 * the partition to generate the data
	 * 
	 * @return an XYDataset
	 */
	@Override
	XYDataset createDataset() {
		DefaultXYDataset result = new DefaultXYDataset();
		if (ModelInterface.allPartitions != null) {
			Partition p = ModelInterface.allPartitions.stream()
					.filter(x -> x.getId().equals(currentPartition)) // safe as long
																// as ID is a
																// primitive!
					.findFirst().orElse(null);
			result.addSeries(
					currentPartition,
					currentFunction.generateData(p,
							periodSpinner.getSelection()));
		}
		return result;
	}


	/**
	 * Looks at the currently selected attribute and currently selected
	 * partition and regenerates the graph
	 */
	@Override
	JFreeChart generateChart() {
		XYDataset dataset = createDataset();
		ChartFactory.setChartTheme(StandardChartTheme.createLegacyTheme());
		JFreeChart chart = ChartFactory.createXYLineChart(
				currentFunction.getTitle(), currentFunction.getDomainName(), // x
																				// axis
																				// name
				currentFunction.getRangeName(), // y axis name
				dataset, // data
				PlotOrientation.VERTICAL, // orientation
				false, false, false);
		return chart;
	}

	/**
	 * Every time the focus is set on the Chart, reconstruct the chart. May not
	 * be the best idea. This method is called by eclipse everytime this view is
	 * focused.
	 */
	@Override
	public void setFocus() {
	}

}