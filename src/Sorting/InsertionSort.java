package Sorting;
//O(N) IN BEST CASE AND IN WROST CASE IT IS O(N^2)
//SO IT IS NOT GOOD ENOUGH BUT IT IS BETTER THAN SELECTION SORT AND BUBBLE SORT
public class InsertionSort {
	public static void Isort(int[] array, int size) {
		for (int i = 1; i < size; i ++) {
			int valueToinsert = array[i];
			int index = i;
			//CONSIDER THE FIRST ELEMENT AS SORTED PART OF ARRAY AND THEN START FOROM THE 1 INDEX
			// NOW CHECK THE VALUE WE HAVE JUST CHOSE, THAT IS IT GREATER THAN THE VALUE IN THE SORTED PART OF ARRAY
			//IF YES THAN SHIFT ALL THE VALUES IN SORTED PART OF THE ARRAY TO ONE RIGHT SHIFT
			//AND THEN INSERT THIS LESSER VLAUE IN THE FIRST POSITION
			while (index > 0 && array[index-1] > valueToinsert) {
				array[index] = array[index - 1];
				index--;
			}
			array[index] = valueToinsert;
		}
	}
}
