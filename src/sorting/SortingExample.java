package sorting;

public class SortingExample {
	public static void main(String[] args) {
		int[] array = {
				107, 5639, 8241, 6483, 2928, 795, 6214, 384, 2597, 5781, 7282, 9091, 7861, 261, 6753, 9865, 4721, 9020, 4897, 3324, 7000, 8552, 1103, 2735, 1246, 9343, 885, 9343, 4214, 3789, 1616, 8856, 7939, 2970, 7797, 1869, 6719, 1054, 478, 5760, 3206, 8220, 286, 1281, 9542, 676, 5863, 9725, 2203, 951, 1812, 9316, 7605, 7841, 9081, 2137, 3915, 2221, 3084, 6354, 5644, 4910, 7431, 9242, 1266, 4971, 4850, 6603, 3651, 7640, 5169, 3017, 2280, 3509, 2174, 3425, 3611, 811, 675, 1255, 6144, 5409, 3325, 8657, 3812, 8130, 9489, 1763, 8857, 6077, 9441, 8224, 6114, 258, 992, 3220, 6235, 9527, 7290, 3247, 9463, 9745, 9699, 282, 2439, 2660, 4557, 7237, 3209, 9263, 9323, 5901, 2839, 7507, 4119, 940, 7271, 2734, 2300, 4525, 2046, 9871, 5811, 7190, 2387, 1443, 1036, 1321, 2305, 9566, 7325, 5466, 6921, 883, 3037, 5733, 6314, 170, 7080, 9971, 7681, 9105, 7251, 3923, 2622, 2161, 1999, 9381, 2764, 6601, 4524, 3166, 1577, 2126, 7264, 8796, 1337, 9921, 4646, 2639, 7602, 3835, 1461, 7022, 5869, 8731, 9307, 5730, 4462, 473, 4374, 6455, 9330, 6750, 925, 1100, 8437, 9076, 6072, 1486, 6997, 

			};
		
		SortingAlgorithm selection = new SelectionSort();
		SortingAlgorithmDecorator selectionDec = new SortingAlgorithmDecorator(selection);
		SortingAlgorithmDecorator bubbleDec = new SortingAlgorithmDecorator(selection);
	
		System.out.println("\nInitial array:");
		printArray(array);
		
		bubbleDec.sort(array);
		selectionDec.sort(array);
		
		System.out.println("\nResults:");
		printArray(array);
	}

public static void printArray(int[] array) {
	for(int i=0; i < array.length; i++) {
		System.out.print(array[i] + " * ");
		if(i%5 == 0 && i != 0 && i!= array.length - 1) {
			System.out.println();
		}
	}
}
	
}


