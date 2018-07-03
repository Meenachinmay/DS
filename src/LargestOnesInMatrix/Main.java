package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[][] mat = new int[5][4];
		Scanner in = new Scanner(System.in);
		Main m = new Main();
		for (int i = 0; i < mat.length; i ++) {
			for (int j = 0; j < mat[0].length; j ++) {
				mat[i][j] = in.nextInt();
			}
		}
		
		System.out.println(m.largestSqaure(mat));
	}
	
	public int largestSqaure(int[][] arr){
		int[][] cache = new int[arr.length][arr[0].length];
		int ans = 0;
		//cache = arr.clone();
		for (int i = 0; i < arr.length; i ++) {
			for (int j = 0; j < arr[i].length; j ++) {
				if (i == 0 || j == 0) {
					
				}else if(arr[i][j] > 0) {
					cache[i][j] = 1 + MinofThree(arr[i][j-1], arr[i-1][j],arr[i-1][j-1]);
				}
				if (cache[i][j] > ans) ans = cache[i][j];
			}
		}
		return ans;
	}
	
	public int MinofThree(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		}else if(b < a && b < c) {
			return b;
		}else {
			return c;
		}
	}
}
