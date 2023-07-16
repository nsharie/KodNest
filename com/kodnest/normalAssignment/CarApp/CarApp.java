import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the car brand");
		String brand = scan.nextLine();
		
		System.out.println("Enter the car color");
		String color = scan.nextLine();
		
		System.out.println("Enter the car model");
		String model = scan.nextLine();
		
		System.out.println("Enter the car type of gearing System");
		String gearSystem = scan.nextLine();
		
		System.out.println("Enter the fuel type of the car");
		String fuelType = scan.nextLine();
		
		System.out.println("Enter the type of car");
		String typeOfCar = scan.nextLine();
		
		System.out.println("Enter the engine CC");
		int engineCC = scan.nextInt();
		
		System.out.println("Enter the number of seats in car");
		int numberOfSeats = scan.nextInt();
		
		System.out.println("Enter the car's year of manufacture");
		int yearOfManufacture = scan.nextInt();
		
		System.out.println("Enter the maximum speed of the car");
		int maxSpeed = scan.nextInt();
		
		Car c1 = new Car(brand, color, model, gearSystem, fuelType, typeOfCar, engineCC, numberOfSeats, yearOfManufacture, maxSpeed); 
		c1.engine();
		c1.acceleration();
	}

}
