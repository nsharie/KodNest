package hackerRank;

import java.util.Scanner;

public class BinaryTree {
	static int search(int arr[],int search,int low, int high) {
		while(low<=high) {
			int median = low + (high-low)/2;
			
			if(arr[median]==search) {
				return median;
			}
			else if(arr[median]<search) {
				low = median + 1;
			}
			
			else {
				high = median - 1;
			}
		}
		return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the search value");
		int search = sc.nextInt();
		
		int result = search(arr, search, 0 ,arr.length);
		
		if(result!=-1) {
			System.out.println("The searched element is found at index" + result);
		}
		else {
			System.out.println("Not Found");
		}
	}

}
