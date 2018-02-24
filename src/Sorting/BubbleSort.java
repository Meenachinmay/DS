package Sorting;

public class BubbleSort {
	
	public static void BSort(int[] array) {
		//TO OPTIMIZE THE LOOP WE ARE DECREASING 
		// THE NO OF ITERATIONS OF THE LOOP
		//SO IT WILL NOT CHECK UNNECESSARY ITERATIONS
		int lastUnsorted = array.length-1;
		 boolean sorted = false;
		 while (!sorted) {
			 sorted = true;
			 for (int i = 0; i < lastUnsorted; i ++) {
				 if (array[i] > array[i + 1]) {
					 swap(array, i, i+1);
					 sorted = false;
				 }
			 }
			 lastUnsorted--;
		 }
	}
	//MATHOD TO SWAP TWO ELEMENTS
	public static void swap(int[] array, int x ,int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
}
