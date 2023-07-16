import java.util.Scanner;

public class DifferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two numbers ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			int res = num2 - num1;
			System.out.println(res);
		}
		else {
			int res = num1 -num2;
			System.out.println(res);
		}
		
		scan.close();
	}

}
