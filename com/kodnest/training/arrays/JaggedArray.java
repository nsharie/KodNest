package com.kodnest.training.arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [][] bankCustomers = new String[6][];
		for(int i=0;i<bankCustomers.length;i++) {
			System.out.println("Enter the number of employees in bank "+(i+1));
			bankCustomers[i] = new String[sc.nextInt()];
		}
		
		for(int i=0;i<bankCustomers.length;i++) {
			for(int j=0;j<bankCustomers[i].length;j++) {
				System.out.println("Enter the name of customer in bank "+(i+1)+"Positon "+(j+1));
				bankCustomers[i][j] = sc.next();
			}
		}
		
		System.out.println("Array Name are...");
		
		for(int i=0;i<bankCustomers.length;i++) {
			for(int j=0;j<bankCustomers[i].length;j++){
//				System.out.println("The name of Customer in bank "+(i+1)+"Position "+(j+1));
				System.out.print(bankCustomers[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
