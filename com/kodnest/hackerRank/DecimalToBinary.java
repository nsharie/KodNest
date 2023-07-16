package hackerRank;

import java.util.Scanner;

public class DecimalToBinary {
	static void toBinary(int a) {
		String res = Integer.toBinaryString(a);
//		System.out.println(res);
		int count=0;
		char[] arr = res.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='1') {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		toBinary(decimal);
		sc.close();
		

	}

}
