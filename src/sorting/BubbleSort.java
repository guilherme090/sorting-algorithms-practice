package sorting;

public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		
		for (int i = 0; i < n; i++) {
			swapped = false;
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped) break;
		}
	}

}
