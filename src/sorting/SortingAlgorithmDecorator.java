package sorting;

public class SortingAlgorithmDecorator implements SortingAlgorithm {
	SortingAlgorithm sortingAlgorithm;
	
	SortingAlgorithmDecorator(SortingAlgorithm sortingAlgorithm) {
		this.sortingAlgorithm = sortingAlgorithm;
	}
	
	@Override
	public void sort(int[] arr) {
		long duration = System.currentTimeMillis();
		sortingAlgorithm.sort(arr);
		duration = System.currentTimeMillis() - duration;
		
		System.out.println("\n\nExecution time: " + duration + " ms.");
	}

}
