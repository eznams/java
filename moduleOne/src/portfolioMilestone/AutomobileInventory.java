package portfolioMilestone;
import java.util.*;

public class AutomobileInventory {
	
	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);
		Automobile auto = new Automobile();
		 System.out.println ("Welcome to the car inventory.");
		while(true) {
			System.out.println ("\nMain Menu ");
			 System.out.println ("\nPlease select an option below: ");
			 System.out.println ("Type 1 to add a car to inventory");
			 System.out.println ("Type 2 to update a car in the inventory");
			 System.out.println ("Type 3 to remove a car from inventory");
			 System.out.println ("Type 4 to display cars in inventory");
			 System.out.println ("Type 5 to close inventory program");
			 int optionInput = inputUser.nextInt();
			 switch(optionInput){
				 case 1:
					 System.out.println ("Insert vehicle to inventory:") ;
					 
					 System.out.print ("Insert the the make of the new car (car manufacterer): ");
					 String make = inputUser.next();
					 inputUser.nextLine();

					 System.out.print ("Insert the year car was manufactured: ");
					 int year = inputUser.nextInt();
					 inputUser.nextLine();

					 System.out.print ("Insert car model: ");
					 String model = inputUser.nextLine();

					 System.out.print ("Insert car's milage: ");
					 int mileage = inputUser.nextInt();
					 inputUser.nextLine();

					 System.out.print ("Insert the color of car: ");
					 String color = inputUser.nextLine();
					 
					 try {
					 Automobile vehicle = new Automobile(make, model, color, year, mileage);
					 Automobile.addVehicleToArr(vehicle);
					 vehicle.addVehicle(make, model, color, year, mileage);
					 
					
					 String[] vehicleInfo = Automobile.listVehicleInformation(vehicle);
					 System.out.println("Vehicle Information: ");
					 for(int i = 0; i < vehicleInfo.length; i++) {
							System.out.println(vehicleInfo[i]);
						}		
					 }catch (Exception e) {
						 System.out.println("Car not cretaed");
					 }
					 break;
				 
				 case 2:
					 //Update car
					 //asking for information of old car
					 System.out.println("We will update a vehicle, please provide with the following information:");
					 inputUser.nextLine();
					 System.out.println("Enter Make of old car: ");
					 String oldMake = inputUser.nextLine();
					 System.out.println("Enter Model of old car: ");
					 String oldModel = inputUser.nextLine();
					 System.out.println("Enter color of old car: ");
					 String oldColor = inputUser.nextLine();
					 System.out.println("Enter mileage of old car: ");
					 int oldMileage = inputUser.nextInt();
					 inputUser.nextLine();
					 System.out.println("Enter Year of old car: ");
					 int oldYear = inputUser.nextInt();
					 
					
					 //asking for information of new car
					
					 System.out.println("Enter information of new car.");
					 inputUser.nextLine();
					 System.out.println("Enter Make of new car: "); 
					 String newMake = inputUser.nextLine();
					 System.out.println("Enter Model of new car: ");
					 String newModel = inputUser.nextLine();
					 System.out.println("Enter color of new car: ");
					 String newColor = inputUser.nextLine();
					 System.out.println("Enter mileage of new car: ");
					 int newMileage = inputUser.nextInt();
					 inputUser.nextLine();
					 System.out.println("Enter Year of new car: ");
					 int newYear = inputUser.nextInt();
					 
					 auto.updateVehicle(newMake, newModel, newColor, newYear, newMileage, oldMake, oldModel, oldColor, oldYear, oldMileage);
					 break;
				 case 3:
					 //remove car
					 System.out.println("Remove car");
					 System.out.println("Enter information of car to remove.");
					 System.out.println("Enter Make: ");
					 String deleteMake = inputUser.nextLine();
					 System.out.println("Enter Model: ");
					 String deleteModel = inputUser.nextLine();
					 System.out.println("Enter color: ");
					 String deleteColor = inputUser.nextLine();
					 System.out.println("Enter mileage: ");
					 int deleteMileage = inputUser.nextInt();
					 inputUser.nextLine();
					 System.out.println("Enter Year: ");
					 int deleteYear = inputUser.nextInt();
					 inputUser.nextLine();
					 auto.removeVehicle(deleteMake, deleteModel, deleteColor, deleteYear, deleteMileage);
				 	 break;
				 case 4:
					 System.out.println("Display inventory");
					 auto.displayFile();
					 break;	
				 case 5:
					 System.out.println("Thank you. See you soon.");
					 System.exit(0);
					 break;
				default:
					System.out.println("Incorrect input. Try again");
			 }
		}
	}

}
