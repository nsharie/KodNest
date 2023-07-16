package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindingMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Enter the size of List");
//		Scanner scan = new Scanner(System.in);
		int median = 0;
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(1);
		arr.add(0);
		arr.add(2);
		arr.add(4);
		arr.add(3);
		arr.add(6);
//		arr.add(7);
		Collections.sort(arr);
//		for(int s1 : arr) {
//			System.out.println(s1);
//		}		
		if(arr.size()%2==1) {
//			System.out.println();
			median = arr.get((arr.size()+1)/2-1);
//			System.out.println(median);
		}
		
		else {
			median = (arr.get(arr.size()/2-1)+arr.get(arr.size()/2))/2;
		}
		System.out.println(median);
		
	}

}
