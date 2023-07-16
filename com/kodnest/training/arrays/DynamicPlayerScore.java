package com.kodnest.training.arrays;

import java.util.Scanner;

public class DynamicPlayerScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of games");
		int [][] arr = new int[sc.nextInt()][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the number of players in game "+(i+1));
			arr[i] = new int[sc.nextInt()];
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the score of game "+(i+1)+" Player "+(j+1));
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("ARrray Elements are....");
		for(int i=0;i<arr.length;i++) {
			System.out.println("The score of players in game "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
