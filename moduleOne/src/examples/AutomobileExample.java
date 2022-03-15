package examples;

public class AutomobileExample {
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	private String vin;
	
	public AutomobileExample() {
		this.make = "";
		this.model = "";
		this.color = "";
		this.year = -1;
		this.mileage = -1;
		this.vin = "";
	}
	
	public AutomobileExample(String make, String model, String color, int year, int mileage, String vin) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.mileage = mileage;
		this.vin = vin;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

	@Override
	public String toString() {
		return "\n Make: " + make + "\n Model: " + model + "\n Color: " + color + "\n Year: " + year
				+ "\n Mileage: " + mileage + "\n VIN: " + vin ;
	}	
	
	public static void main(String[] args) {
		AutomobileExample carOne = new AutomobileExample();
		System.out.println("Car one: \n"+ carOne.toString());
		AutomobileExample carTwo = new AutomobileExample("Toyota", "Rav4", "Black", 2019, 20345, "FHOM1235AS34");
		System.out.println("\n Car two: \n"+ carTwo.toString());
	}
}
