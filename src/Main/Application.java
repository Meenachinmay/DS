package Main;

import java.util.Scanner;
import Sorting.*;
import Searching.*;

public class Application {
	private static int size;
	private static int[] array;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		array = new int[size];
		
		for (int i = 0; i < size; i ++) {
			array[i] = in.nextInt();
		}
		
		long startTime = System.currentTimeMillis();
		//GIVE INPUT
		new HeapImplementation(array);
		HeapImplementation.HSort();
		
		long endTime = System.currentTimeMillis();
		//PrintArray(array);
		
		double timeTaken = (double)(endTime - startTime) / 1000;
		System.out.println("Time Taken " + timeTaken + " Seconds");
	}
	
	public static void PrintArray(int[] array) {
		for (int i = 0; i < array.length; i ++) {
			System.out.println(array[i]);
		}
	}
}
