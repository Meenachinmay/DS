//CREATED BY : MEENACHINMAY : (23-FEB-2018)
//IMPLEMENTATION OF MIN HEAP 
// ROOT INDEX = (SIZE - 1) / 2;
// LEFT CHILD INDEX = SIZE * 2 + 1;
// RIGHT CHILD INDEX = SIZE * 2 + 2;
//ROOT WILL ALWAYS HAVE THE MINIMUM VALUE IN THE HEAP
// USED IN MANY ALGORITHM TO MAKE THEM MUCH EFFICIENT
//LIKE A* PATH FINDER ALGORITHM AND MANY GAME PROGRAMMING ALGORITHM

package Sorting;

import java.util.Arrays;

public class HeapImplementation {
	
	//CAPACITY AND THE SIZE OF THE HEAP
	private static int capacity = 10;
	private static int size = 0;
	
	public static int[] items = new int[capacity];
	
	public HeapImplementation(int[] data) {
		for (int i = 0; i < data.length; i ++) {
			add(data[i]);
		}
	}
	
	//TO GET INDEX OF ALL THE ELEMENTS IN HEAP WEATHER IT IS PARENT OR CHILDERN IN THE HEAP
	private static int getLeftChildIndex(int parentIndex) {
		int res = parentIndex * 2 + 1;
		return res;
	}
	
	private static int getRightChildIndex(int parentIndex) {
		int res = parentIndex * 2 + 2;
		return res;
	}
	
	private static int getParentIndex(int childIndex) {
		int res = (childIndex - 1) / 2;
		return res;
	}
	
	//TO MAKE A CHECK THAT IS HEAP IS HAVING A LEFT CHILD OR A RIGHT CHILD OR A PARENT CHILD 
	private static boolean hasLeftChild (int index) {
		return getLeftChildIndex(index) < size;
	}
	
	private static boolean hasRightChild(int index) {
		return getRightChildIndex(index) < size;
	}
	
	private static boolean hasParent(int index) {
		return getParentIndex(index) >= 0;
	}
	
	//TO GET THE ACTUAL VALUE FROM THE HEAP OF THE PARENT OR OF THE LEFT CHILD OR OF THE RIGHT CHILD
	private static int leftChild(int index) {
		return items[getLeftChildIndex(index)];
	}
	
	private static int rightChild(int index) {
		return items[getRightChildIndex(index)];
	}
	
	private static int parent(int index) {
		return items[getParentIndex(index)];
	}
	
	//MAIN CODE START FROM HERE
	private static void swap(int index1, int index2) {
		int temp = items[index1];
		items[index1] = items[index2];
		items[index2] = temp;
	}
	
	// CHECKING THE EXTRA SAPCE IS AVALAIBLE IN THE HEAP OR NOT
	private static void CheckExtraSpace() {
		if (size == capacity) {
			items = Arrays.copyOf(items, capacity * 2);
			capacity += 2;
		}
	}
	//GETTING THE VALUE OF VERY FIRST INDEX OF THE HEAP
	public static int peek() {
		if (size == 0) throw new IllegalStateException();
		return items[0];
	}
	//WHEN WE ADD A ELEMENT IN THE HEAP WE NEED TO CALL HEAPIFYUP METHOD TO REARRANGING THE HEAP
	//WHEN WE REMOVE A ELEMENT FROM THE HEAP WE NEED TO CALL HEAPIFYDOWN METHOD TO SORT HEAP FORM DOWN TO UP
	public static int poll () {
		if (size == 0) throw new IllegalStateException();
		int item = items[0];
		items[0] = items[size - 1];
		items[size - 1] = item;
		//SHRINKING THE SIZE OF THE HEAP AND GETTING THE ELEMENT FROM THE HEAP
		size--;
		HeapifyDown();
		return item;
	}
	
	//HEAPIFY DOWN top to down
	private static void HeapifyDown() {
		int index = 0;
		while (hasLeftChild(index)) {
			int smallerChildIndex = getLeftChildIndex(index);
			if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
				smallerChildIndex = getRightChildIndex(index);
			}
			
			if (items[index] < items[smallerChildIndex]) {
				break;
			}else {
				swap(index, smallerChildIndex);
			}
			
			index = smallerChildIndex;
		}
	}
	
	//HEAPIFY UP bottm to up
	private static void HeapifyUp() {
		int index = size - 1;
		while (hasParent(index) && parent(index) > items[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}
	
	//ADDING NEW ELEMENT IN THE HEAP
	public static void add(int item) {
		CheckExtraSpace();
		items[size] = item;
		size++;
		HeapifyUp();
		HeapifyDown();
	}
	
	public static int getSize() {
		return size;
	}
	
	public static void HSort() {
		while (size >= 0) {
			if (size == 0) {
				break;
			}
			System.out.println(poll());
		}
	}
}
