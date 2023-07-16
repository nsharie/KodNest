package classWork;

import java.util.Scanner;

public class FunWithDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number from (1-7)");
		int day = sc.nextInt();
		sc.close();
		
		switch (day) {
		case 1: 
			System.out.println("Super Sunday");
			break;
		case 2:
			System.out.println("Boaring Monday");
			break;
		case 3:
			System.out.println("Casual Tuesday");
			break;
		case 4:
			System.out.println("Satisfying Wednesday");
			break;
		case 5:
			System.out.println("Unlucky Thrusday");
			break;
		case 6:
			System.out.println("Good Friday");
			break;
		case 7:
			System.out.println("WeekEnd Saturday");
			break;
		default:
//			throw new IllegalArgumentException("Unexpected value: " + day);
			System.out.println("I hope you are not under basic IQ, please see the Input information");
		}
	}

}
