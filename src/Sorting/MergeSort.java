package Sorting;
//MERGE SORT ALGORITHM O(nlogn)
//BEST ALGORITHM FOR SORTING
//ACTUALLY SORTING IS DONE IN MERGESORT FUNCTION
//MSORT METHOD IS ONLY DOING THE RECURSION PART AND DIVIDING PART
public class MergeSort {
	public static void Merge(int[] array, int[] left, int right[]) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		int lenOfLeftArray = left.length;
		int lenOfRightArray = right.length;
		
		while(i < lenOfLeftArray && j < lenOfRightArray) {
			if (left[i] <= right[j]) {
				array[k] = left[i];
				k++;
				i++;
			}else {
				array[k] = right[j];
				k++;
				j++;
			}
		}
		
		while (i < lenOfLeftArray) {
			array[k] = left[i];
			i++;
			k++;
		}
		
		while (j < lenOfRightArray) {
			array[k] = right[j];
			k++;
			j++;
		}
	}
	
	public static void MSort(int[] array) {
		int size = array.length;
		if (size < 2) {
			return;
		}
		int middle = size/2;
		int[] left = new int[middle];
		int[] right = new int[size - middle];
		
		for (int i = 0; i < middle; i ++) {
			left[i] = array[i];
		}
		
		for (int i = middle; i < size; i ++) {
			right[i - middle] = array[i];
		}
		
		MSort(left);
		MSort(right);
		Merge(array, left, right);
	}
}
