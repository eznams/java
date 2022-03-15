package portfolioMilestone;

import java.util.*;
import java.io.*;


public class Automobile {

	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	private static ArrayList<Automobile> auto = new ArrayList <Automobile>();
	//to check if the name of file is working or not
	private final static String NAMEOFFILE = "/Users/ezequiel/Desktop/Java/moduleOne/src/portfolioMilestone/Autos.txt";
	
	public Automobile() {		
		this.make = "No Make";
		this.model = "No Model";
		this.color = "No Color";
		this.year = -1;
		this.mileage = -1;	
		
	}
	
	public Automobile(String make, String model, String color, int year, int mileage) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.mileage = mileage;	
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
	
	public static void addVehicleToArr(Automobile vehicle){
		auto.add(vehicle);
	}
	//Adds a new car
	public static void addVehicle(String make, String model, String color, int year, int mileage) {	
		Automobile vehicle = new Automobile(make, model, color, year, mileage);
		auto.add(vehicle);
		System.out.println("Car added successfully");
		}
		//removes car
	protected static void removeVehicle(String make, String model, String color, int year, int mileage) {
		for (int i = 0; i < auto.size(); i++) {
			Automobile vehicle = auto.get(i);
			//The equalsIgnoreCase() method of the String class compares two strings irrespective of the case (lower or upper) of the string
			if(vehicle.getModel().equalsIgnoreCase(model) && vehicle.getColor().equalsIgnoreCase(color) 
					&& vehicle.getMake().equalsIgnoreCase(make) 
					&& vehicle.getMileage() == mileage && vehicle.getYear() == year) {
					try {
						auto.remove(vehicle);
						System.out.println("Vehicle was removed successfully");
					}
					catch(Exception e){
						System.out.println("Vehicle was not removed, try again");
					}
				} else if(i == (auto.size()-1)) {
					System.out.println("Error - " + make + " " + model + " " +  color + " year - " + year + " mileage - " + mileage
							+" Vehicle does not exist");
				}
				
		}
	}

	public static void updateVehicle(String makeNew, String modelNew, String colorNew, int yearNew, int mileageNew, 
			String makeOld, String modelOld, String colorOld, int yearOld, int mileageOld) {
		for (int i = 0; i < auto.size(); i++) {
			Automobile vehicle = auto.get(i);
			if(vehicle.getModel().equalsIgnoreCase(modelOld) && vehicle.getColor().equalsIgnoreCase(colorOld) && 
					vehicle.getMake().equalsIgnoreCase(makeOld) 
					&& vehicle.getMileage() == mileageOld && vehicle.getYear() == yearOld) {
				try {
				vehicle.setColor(colorNew);
				vehicle.setMake(makeNew);
				vehicle.setMileage(mileageNew);
				vehicle.setModel(modelNew);
				vehicle.setYear(yearNew);
				auto.set(i, vehicle);
				
				
				
				System.out.println("Car updated successfully!");
				}
				catch(Exception e){
					System.out.println("Error out of bounds while trying to update vehicle");
				}
			} else if (i == (auto.size()-1)){
				System.out.println("Error - " + makeOld + " " + modelOld + " " +  colorOld + " year - " + 
			yearOld + " mileage - " + mileageOld  +" Vehicle does not exist");
			}
			
		}
	}
	
	// display one vehicle information
	public static String[] listVehicleInformation(Automobile auto){
		String[] returnArray= new String[5];
		returnArray[0] = auto.getMake();
		returnArray[1] = auto.getYear() + " ";
		returnArray[2] = auto.getModel();
		returnArray[3] = auto.getMileage() + " ";
		returnArray[4] = auto.getColor();
		
		
		return returnArray;
		
	}
	public static String[] listVehicleInformation(){
		String[] returnArray= new String[5];
		for (int i = 0; i < auto.size(); i++) {
			if(i == (auto.size()-1)) {
				returnArray[0] = auto.get(i).getMake();
				returnArray[1] = auto.get(i).getYear() + " ";
				returnArray[2] = auto.get(i).getModel();
				returnArray[3] = auto.get(i).getMileage() + " ";
				returnArray[4] = auto.get(i).getColor();
			}
		}
		return returnArray;
	}
	
	// this method will write in a file the information and display it
	public static void writeInformation() {
	
		try {
			FileWriter fw = new FileWriter(NAMEOFFILE, true);
			BufferedWriter out = new BufferedWriter(fw);
			for(int i = 0; i < auto.size();i++) {
				Automobile vehicle = auto.get(i);
				
				out.write("\nNew Automobile " + (i+1) + ": \n");
				out.write("Make - " + vehicle.getMake() + " \n");
				out.write("Model - " + vehicle.getModel()+ " \n");
				out.write("Color - " + vehicle.getColor()+ " \n");
				out.write("Year - " + vehicle.getYear()+ " \n");
				out.write("Mileage - " + vehicle.getMileage()+ " \n");
				
			}
			out.flush();
			out.close();
		} 	catch(FileNotFoundException e){
				System.out.println("File not found");
			} 
			catch(IOException e){
				System.out.println("Error with the input - Please try again");
			}
			catch(Exception e){
				System.out.println("There was an error - Try again");
			}
			
	}
// optional if I want to read the whole file
	public void displayFile() {
		try { 
			File myObj = new File(NAMEOFFILE);
		    Scanner reader = new Scanner(myObj);
		    while (reader.hasNextLine()) {
		        String info = reader.nextLine();
		        System.out.println(info);
		        }
		    reader.close();
	     } catch(FileNotFoundException e) {
	    	 System.out.println("File not found");
	     }
	}
}
