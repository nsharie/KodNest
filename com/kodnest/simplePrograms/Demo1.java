import java.util.Scanner;

class Demo1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int arr[] = new int[sc.nextInt()];
		int i,j;
		for(i =0;i<arr.length;i++)
		{
			System.out.println("Enter the number");
			arr[i] = sc.nextInt();
		}
		System.out.println("The values in the array are: ");
		for(j =0;j<arr.length;j++)
		{
			System.out.println(arr[j]);	
		}
	}
}