package fr.ensma.realtimescheduling.views;

import java.awt.BasicStroke;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;
import analysis.ModelInterface;
import fr.ensma.realtimescheduling.Module;

/**
 * Displays chronological displays of partitions
 * @author Gustavo
 *
 */
public class PartititionUtilizationView extends AbstractLineChart {

	List modules;
	java.util.List<Module> modelModules;
	java.util.List<Module> selectedModules = new ArrayList<>();

	@Override
	JFreeChart generateChart() {
		XYDataset dataset = createDataset(); 
		JFreeChart chart = ChartFactory.createXYStepChart("Partitions",
				"Time", //x axis name
				"", //y axis name
				dataset, //data
				PlotOrientation.VERTICAL, //orientation
				true, 
				true,
				false);
		//change the axis some
		((XYPlot) chart.getPlot()).setDomainAxis(new NumberAxis());
		((XYPlot) chart.getPlot()).getRangeAxis().setVisible(false);
		((XYPlot) chart.getPlot()).getRenderer().setBaseStroke(new BasicStroke(20.0f)); //does nothing lol
		return chart;
	}
	
	/**
	 * Sets up a list view and a label.
	 */
	@Override
	Composite setUpSelectors(Composite parent) {
		Composite holder = new Composite(parent, SWT.BORDER);
		Label l = new Label(holder, SWT.BORDER);
		l.setText("Module");
		modules = new List(holder, SWT.BORDER);
		modules.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				java.util.List<String> selections = Arrays.asList(modules.getSelection());
				selectedModules = modelModules
						.stream()
						.filter(module -> selections.contains(module.getId()))
						.collect(Collectors.toList());
			}
		});
		return holder;
	}

	
	double offset;
	@Override
	XYDataset createDataset() {
		DefaultXYDataset data = new DefaultXYDataset();
		offset = 0;
		if(selectedModules != null) {
			selectedModules.stream().forEach(module -> {
				module.getPartition().stream().forEach(partition -> {
					data.addSeries(partition.getId(), GraphingFunctions.getIntervalStepData(partition, offset));
					offset += 1.75; //worst hack of all time
				});
			});
		}
		return data;
	}

	@Override
	void queryModel() {
		if(ModelInterface.validSystem()) {
			modelModules = ModelInterface.system.getUses().getScheduledOn().stream().collect(Collectors.toList());
			modules.setItems(modelModules.stream().map(Module::getId).collect(Collectors.toList()).toArray(new String[0]));
		} 
		
	}
	
}
