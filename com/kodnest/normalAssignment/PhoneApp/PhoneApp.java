import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the phone brand");
		String brand = scan.nextLine();
		
		System.out.println("Enter the phone model");
		String model = scan.nextLine();
		
		System.out.println("Enter the phone color");
		String color = scan.nextLine();
		
		System.out.println("Enter the phone processor");
		String processor = scan.nextLine();
		
		System.out.println("Enter the phone screen refresh rate");
		int screenRefreshRate = scan.nextInt();
		
		System.out.println("Enter the number of cameras");
		int numberOfCameras = scan.nextInt();
		
		System.out.println("Enter the size of ram");
		int ram = scan.nextInt();
		
		System.out.println("Enter the storage size of phone");
		int storageSize = scan.nextInt();
		
		System.out.println("Enter the price of the phone");
		int price = scan.nextInt();
		
		System.out.println("Enter the screen size of the phone");
		float screenSize = scan.nextFloat();
		scan.close();
		
		Phone p = new Phone(brand, model, color, processor, screenRefreshRate, numberOfCameras, ram, storageSize, price, screenSize);
		
		p.display();
		p.charging();
	}

}
