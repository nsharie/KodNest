package com.kodnest.training.arrays;

import java.util.Scanner;

public class HeightOfSevenPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array)");
		float height[] = new float[sc.nextInt()];
		for(int i=0;i<height.length;i++) {
			System.out.println("Enter the height");
			height[i]= sc.nextFloat();
		}
		System.out.println("Height's are....");
		for(int i=0;i<height.length;i++) {
			System.out.println("Height is "+height[i]);
		}	}

}
