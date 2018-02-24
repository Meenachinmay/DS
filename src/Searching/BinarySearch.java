package Searching;

public class BinarySearch {
	
	public static boolean search (int[] array, int element, int size) {
		int start = 0;
		int end = size - 1;
		
		while (start <= end) {
			int mid = (start + end)/2;
			if (element == array[mid]) {
				return true;
			}else if (element < array[mid]) {
				end = mid - 1;
			}else if (element > array[mid]) {
				start = mid + 1;
			}
		}
		return false;
	}
}
