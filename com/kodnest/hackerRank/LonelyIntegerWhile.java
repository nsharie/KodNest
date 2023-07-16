package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class LonelyIntegerWhile {
	
	static void lonelyInteger(List<Integer> a) {
		int res = 0;
		int k=0;
		if(a.size()==1) {
			System.out.println(a.get(k));
		}
		else {
			for(int i=0;i<a.size();i++) {
				for(int j=1;j<a.size();j++) {
					while(a.get(i)!=a.get(j)) {
						res=+a.get(i);
					}
				}
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(0);
		a.add(1);
		a.add(2);
		a.add(1);
//		System.out.println(a);
//		System.out.println(a.size());
		lonelyInteger(a);
	}

}
