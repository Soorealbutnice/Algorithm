package java_algo;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] sorting = {1, 5, 4, 7, 10, 3, 6, 3, 7, 8};
		
		int minimum;
		int minimumInt;
		
		for (int i = 0; i < sorting.length; i++) {
			minimum = sorting[i];
			minimumInt = i;
			for (int j = i; j < sorting.length; j++) {
				if (sorting[j] < minimum) {
					minimum = sorting[j];
					minimumInt = j;
				}
			}
			sorting[minimumInt] = sorting[i];
			sorting[i] = minimum; 
		}
		
		System.out.println(Arrays.toString(sorting));
	}
}
