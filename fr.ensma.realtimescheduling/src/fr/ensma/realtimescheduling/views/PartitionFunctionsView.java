package fr.ensma.realtimescheduling.views;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;
import analysis.ModelInterface;
import fr.ensma.realtimescheduling.Partition;

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
		Label functionName = new Label(selectors, SWT.NONE);
		functionName.setText("Function");
		functionCombo = new Combo(selectors, SWT.READ_ONLY);
		Label partitionName = new Label(selectors, SWT.NONE);
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
		partitionCombo = new Combo(selectors, SWT.READ_ONLY);
		partitionCombo.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				currentPartition = partitionCombo.getText();
			}
		});


		Label periods = new Label(selectors, SWT.NONE);
		periods.setText("Periods to draw");
		periodSpinner = new Spinner(selectors, SWT.NONE);
		periodSpinner.setMinimum(1);
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