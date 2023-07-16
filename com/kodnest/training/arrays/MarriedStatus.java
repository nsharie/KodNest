package com.kodnest.training.arrays;

import java.util.Scanner;

public class MarriedStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Peoples to store the marriage status");
		boolean marr[] = new boolean[sc.nextInt()];
		
		for(int i=0;i<marr.length;i++) {
			System.out.println("Enter the marriage status of Person "+(i+1));
			marr[i] = sc.nextBoolean();
		}
		
		for(int i=0;i<marr.length;i++) {
			System.out.println("Person"+marr[i]);
		}
	}

}
