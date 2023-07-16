package com.kodnest.training.arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		String emp[] = new String[scan.nextInt()];
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter Employee First Name");
			emp[i] = scan.next();
			System.out.println();
		}
		System.out.println("The Employee Name are...");
		for(int i=0;i<emp.length;i++) {
			System.out.println(i+1+" "+emp[i]);
		}
	}

}
