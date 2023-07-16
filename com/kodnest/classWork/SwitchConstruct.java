package classWork;

import java.util.Scanner;

public class SwitchConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter + or - or * or /");
		
		char opt = sc.next().charAt(0);
		sc.close();
		
		switch (opt) {
		case '+': 
			System.out.println("Additional Operator");
			break;
			
		case '-':
			System.out.println("Subtraction Operator");
			break;
			
		case '*':
			System.out.println("Multiplication Operator");
			break;
			
		case '/':
			System.out.println("Division Operator");
			break;
			
		default:
//			throw new IllegalArgumentException("Unexpected value: " + opt);
			System.out.println("Idiot see the values to be entered");
		}
	}

}
