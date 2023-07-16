package com.kodnest.training.twodarrays;

import java.util.Scanner;

public class HeightArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of rows and columns where rows are number of games and columns are number of players");
		float [][]arr = new float[sc.nextInt()][sc.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Height of game "+(i+1)+" Player "+(j+1)+" is");
				arr[i][j] = sc.nextFloat();
			}
		}
		
		System.out.println("Array contents are....");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Height of game "+(i+1)+" players is");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
	}
	}
}
