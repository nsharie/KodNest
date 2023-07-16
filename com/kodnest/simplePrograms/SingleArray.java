import java.util.Scanner;

class SingleArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int arr[] = new int[sc.nextInt()];
		int i,j;
		
		/*-------Array_Storing--------*/
		
		System.out.println("Enter the Elements in Array ");
		
		for(i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The Elements in the Array are");
	
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}