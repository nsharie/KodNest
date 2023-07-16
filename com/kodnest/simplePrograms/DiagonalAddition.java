import java.util.Scanner;

class DiagonalAddition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row Size");
		int rows = sc.nextInt();
		System.out.println("Enter the Column Size");
		int columns = sc.nextInt();
		int[][] arr = new int[rows][columns];
		int i,j;
		int result = 0;
		
		System.out.println("Enter the Elements for Array");
		
		try{
			for(i=0;i<rows;i++){
				for(j=0;j<columns;j++){
					arr[i][j] = sc.nextInt();
				}
			}
		}
		
		catch (Exception e){
			System.out.println("Error");
		}
		
		for(i=0;i<rows;i++){
			for(j=0;j<columns;j++){
				result = arr[0][0]+ arr[1][1];
			}
		}
		System.out.println("The Addition of Dimention Elements are : " + result);	
	}
}