package classWork;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks");
		
		int marks = scan.nextInt();
		
		if(marks<50) {
			System.out.println("D - grade");
			System.out.println("Congratulations");
		}
		
		else if(marks>=50 && marks<60) {
			System.out.println("C - grade");
			System.out.println("Congratulations");
		}
		else if(marks>=60 && marks<70) {
			System.out.println("B - grade");
			System.out.println("Congratulations");
		}
		else if(marks>=70 && marks<80) {
			System.out.println("A - grade");
			System.out.println("Congratulations");
		}
		else {
			System.out.println("A+ - grade");
			System.out.println("Congratulations");9
		}
		scan.close();
	}

}
