package hackerRank;

public class DecimalToBinaryWithMethod {
	static void binaryMethod(int a) {
		int count = 0;
		while(a!=1) {
			if(a%2==0) {
			}
			else {
				count++;
			}
			a=a/2;
		}
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		binaryMethod(a);
	}

}
