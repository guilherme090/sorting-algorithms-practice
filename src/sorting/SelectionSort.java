package sorting;

public class SelectionSort implements SortingAlgorithm {
	public void sort (int[] arr) {
		int n = arr.length;
		
		for (int i=0; i < n-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// troca o elemento encontrado com o elemento atual
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
}
