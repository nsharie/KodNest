
public class Phone {
	String brand;
	String model;
	String color;
	String processor;
	int screenRefreshRate;
	int numberOfCameras;
	int ram;
	int storageSize;
	int prize;
	float screenSize;
	
	public Phone(String brand, String model, String color, String processor, int screenRefreshRate, int numberOfCameras,
			int ram, int storageSize, int prize, float screenSize) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.processor = processor;
		this.screenRefreshRate = screenRefreshRate;
		this.numberOfCameras = numberOfCameras;
		this.ram = ram;
		this.storageSize = storageSize;
		this.prize = prize;
		this.screenSize = screenSize;
	}
	
	void display() {
		System.out.println(brand+" "+" "+model+" "+color+" colored phone is displaying the images/videos");
	}
	
	void charging() {
		System.out.println(brand+" "+model+" "+color+" colored phone is charging");
	}
}
