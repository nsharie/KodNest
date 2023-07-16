
public class Car {
	String brand;
	String color;
	String model;   //swift or innova, etc
	String gearSystem; //Automatic or Manual
	String fuelType;
	String typeOfCar;  //SUV or HatchBag,etc
	int engineCC;
	int numberOfSeats;
	int yearOfManufacture;
	int maxSpeed;
	
	public Car(String brand, String color, String model, String gearSystem, String fuelType, String typeOfCar, int engineCC, int numberOfSeats, int yearOfManufacture, int maxSpeed) {
		this.brand = brand;
		this.color = color;
		this.model = model;
		this.gearSystem = gearSystem;
		this.fuelType = fuelType;
		this.typeOfCar = typeOfCar;
		this.engineCC = engineCC;
		this.numberOfSeats = numberOfSeats;
		this.yearOfManufacture = yearOfManufacture;
		this.maxSpeed = maxSpeed;
	}
	
	void engine() {
		System.out.println(brand+" "+color+" colored car Engine is Started");
	}
	
	void acceleration() {
		System.out.println(brand+" "+color+" colored car is accelerating");
	}
}
