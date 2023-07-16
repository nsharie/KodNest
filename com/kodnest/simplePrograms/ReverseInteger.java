import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num = sc.nextInt();
		int res = 0;
		sc.close();
		while(num!=0) {
			int singleDigit = num%10;
//			System.out.println(singleDigit);
			res = singleDigit + res*10;
//			System.out.println("res"+res);
			num = num/10;
		}
		System.out.println(res);
	}

}
