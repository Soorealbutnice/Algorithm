package java_algo;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
	
		int[] sorting = {1, 5, 4, 7, 10, 3, 6, 3, 7, 8};
		boolean swap = true;
		int temp = 0;
		
		do {
			swap = false;
			
			for (int i = 0; i < sorting.length-1; i++) {
				if (sorting[i] > sorting[i+1]) {
					temp = sorting[i];
					sorting[i] = sorting[i + 1];
					sorting[i + 1] = temp;
					swap = true;
				}
			}
	
		} while(swap);
		
		System.out.println(Arrays.toString(sorting));
	}
}
