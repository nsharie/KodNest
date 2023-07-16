package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LonelyInteger {
	
	static void lonelyInteger(List<Integer> a) {
		Collections.sort(a);
		int res =0;
		int k=0;
		if(a.size()==1) {
			res = a.get(k);
		}
		else {
			for(int i:a) {
				res ^=i;
			}
		}
		System.out.println(res);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("The array is: ");
		List<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(0);
		a.add(1);
		a.add(2);
		a.add(1);
//		System.out.println(a);
		System.out.println("The lonely integer is");
		lonelyInteger(a);
	}

}
