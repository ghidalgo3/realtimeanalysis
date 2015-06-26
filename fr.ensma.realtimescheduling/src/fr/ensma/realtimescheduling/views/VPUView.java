package fr.ensma.realtimescheduling.views;

import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import fr.ensma.realtimescheduling.analysis.ModelInterface;

/**
 * Displays Virtual Processor Utilization as a barchart
 * 
 * @author Gustavo
 */
public class VPUView extends AbstractVerticalBarChart {

	public VPUView() {
		super("Virtual Processor Utilization", "Partition", "Utilization");
	}

	@Override
	CategoryDataset createDataset() {
		final DefaultCategoryDataset result = new DefaultCategoryDataset();
		if (ModelInterface.isValidSystem()) {
			ModelInterface.allPartitions.stream().forEach(
					partition -> {
						result.addValue(
								partition.getVirtualProcessorUtilization(),
								"Partition", "" + partition.getId());
					});
		}
		return result;
	}

}
