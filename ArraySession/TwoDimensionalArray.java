package com.array;

import java.util.Scanner;

public class TwoDimensionalArray {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] twodimarr = new int[4][3];
		
		int row = 0;
		
		while(row<4) {
			int col = 0;
			while(col<3) {
				System.out.println("Enter The Number: ");
				twodimarr[row][col] = sc.nextInt();
				col++;
			}
			row++;
		}
		for (int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(twodimarr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
