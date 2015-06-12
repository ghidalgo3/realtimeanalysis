package fr.ensma.realtimescheduling.views;

import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import analysis.ModelInterface;

/**
 * A BarChart that displays worst case response times from the model's
 * Tasks
 * @author Gustavo
 *
 */
public class WCRTView extends AbstractVerticalBarChart {
	

	public WCRTView() {
		super("Worst Case Response Time", "Tasks", "Time");
	}
	
	/**
	 * Creates the dataset for this chart by querying the model
	 * and categorizing the partitions and tasks within the model.
	 */
	@Override
	CategoryDataset createDataset() {
		  final DefaultCategoryDataset result = new DefaultCategoryDataset();
		  if(ModelInterface.allPartitions != null) {
			  ModelInterface.allPartitions
			  	.stream()
			  	.forEach(partition -> {
			  		partition.getTasks()
			  			.stream()
			  			.forEach(task -> {
			  				result.addValue(task.getResponseTime(), "Partition "+partition.getId(), task.getName());
			  			});
			  	});
		  }
		  return result;
	}
	
	
	

}
