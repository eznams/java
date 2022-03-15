package portfolioMilestone;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);
		// creating new car without parameters
		try {
			 Automobile vehicle = new Automobile();
			 Automobile.addVehicleToArr(vehicle);
			
			
			 String[] vehicleInfo = Automobile.listVehicleInformation(vehicle);
			 System.out.println("Vehicle Information: ");
			 for(int i = 0; i < vehicleInfo.length; i++) {
					System.out.println(vehicleInfo[i]);
				}		
			 }catch (Exception e) {
				 System.out.println("Car not cretaed");
			 }
		
		//creating new car with parameters
		
		try {
			 Automobile vehicleTwo = new Automobile("Subaru", "Forester", "Blue", 2022, 1244);
			 Automobile.addVehicleToArr(vehicleTwo);
			 Automobile.addVehicle("Subaru", "Forester", "Blue", 2022, 1244);
			 
			
			 String[] vehicleInfo = Automobile.listVehicleInformation(vehicleTwo);
			 System.out.println("\nVehicle Information: ");
			 for(int i = 0; i < vehicleInfo.length; i++) {
					System.out.println(vehicleInfo[i]);
				}		
			 }catch (Exception e) {
				 System.out.println("Car not cretaed");
			 }
			
		//remove vehicle has try and catch inside method
			//first car should give me an error to delete
			Automobile.removeVehicle("Chevrolet", "Camaro", "Red", 2022, 4123);
			Automobile.removeVehicle("Subaru", "Forester", "Blue", 2022, 1244);
			
			Automobile.addVehicle("Toyota", "Rav4", "Green", 2010, 12342);
			String[] vehicleInfo = Automobile.listVehicleInformation();
			System.out.println("\nVehicle Information: ");
			for(int i = 0; i < vehicleInfo.length; i++) {
					System.out.println(vehicleInfo[i]);
			}
			//first option should give me an error
			Automobile.updateVehicle("Toyota", "Rav4", "Green", 2010, 12342, "Chevrolet", "Camaro", "Red", 2022, 4123);
			Automobile.updateVehicle("Ford", "Cmax", "Grey", 2021, 10, "Toyota", "Rav4", "Green", 2010, 12342);
			vehicleInfo = Automobile.listVehicleInformation();
			System.out.println("\nVehicle Information: ");
			for(int i = 0; i < vehicleInfo.length; i++) {
					System.out.println(vehicleInfo[i]);
			}	
			
			System.out.println("Would you like to print the information to a file? (Y/N).");
			String userInput = inputUser.nextLine();
			
			if (userInput.toUpperCase().equals("Y")) {
				//method created in Automobile Class
				Automobile.writeInformation();
				System.out.println("Car printed to the file \n");
			} else if (userInput.toUpperCase().equals("N")){
						 System.out.println("Data will not be printed.");	
						 
					} else {
						 System.out.println("Data entered incorrect - the file has not been saved");
						 
					}

		
	}
	
	
}