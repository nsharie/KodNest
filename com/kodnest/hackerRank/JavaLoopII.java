package hackerRank;
import java.util.Scanner;
import java.lang.Math;

public class JavaLoopII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for(int i=0;i<q;i++) {
			int[] arr = new int[3];
			for(int j=0;j<arr.length;j++) {
				arr[j] = scan.nextInt();
			}
			
			int res = 0;
			int sum = arr[0];
			for(int k=0;k<arr[2];k++) {
				int power = (int)Math.pow(2, k);
				res = power*arr[1];
				sum = sum+res;
				System.out.print(" "+sum);
			}
			System.out.println();
		}

	}

}
