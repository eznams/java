/*
 * Ezequiel Nams
 * Last edited 12/15/2021
 * 
 *  Develop a Java program that will store data in the form of monthly temperatures for a year. Store the month and
 *  temperature in two different arrays. Your program should prompt the user for the month to be viewed and display both
 *  the month and average temperature. If "year" is entered, the output for your program should provide the temperature 
 *  for each month along with the yearly average as well as the highest and lowest monthly averages. Use the looping and 
 *  decision constructs in combination with the arrays to complete this assignment.
 * */

package moduleFive;
import java.util.Scanner;
public class MonthlyTemperature {

	public static void main(String[] args) {
		// I am using double for variables since I am not sure how precise the user will be with the temperature
		Scanner input = new Scanner(System.in); 
		String[] months = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"}; 
		double [] temperatures = new double[12];
		String userInput;
		double yearAvg = 0;
		double lowestTemp = 9999999;
		double highestTemp = -9999999;
		String monthHot = "";
		String monthCold = "";
		String cont;
		boolean stop;
		// getting temperature for each month and starting to calculate
		for(int i = 0; i < months.length ; ++i) {
			System.out.print("Enter the monthly temperature for " + months[i].substring(0, 1).toUpperCase() + months[i].substring(1) + " in F: ");
			temperatures[i] = input.nextDouble();	
			yearAvg = yearAvg + temperatures[i];
			if(temperatures[i] > highestTemp) {
				highestTemp = temperatures[i];
				monthHot = months[i];
			}
			if(temperatures[i] < lowestTemp) {
				lowestTemp = temperatures[i];
				monthCold = months[i];
			}
		}
		do {
		//asking year that user would like temperature 
		System.out.print("Enter the month to show or year: ");
		userInput = input.next().toLowerCase();
		//verify input - Instead of creating a loop I could have created a if checking with all the months
		for(int i = 0; i < temperatures.length ; ++i) {
			if (months[i].equals(userInput) || userInput.equals("year")) {
				break;	
			} 
			if(i == 11)
			{
				System.out.println("The information entered is incorrect. Please restart the program. Goodbye.");
				input.close();
				System.exit(0);
			}
		}
		//year case
		if (userInput.equals("year")){
			for(int i = 0; i < temperatures.length ; ++i) {
				System.out.println("In " + months[i].substring(0, 1).toUpperCase() + months[i].substring(1) + " was " + temperatures[i] + " Farenheit.");
			}	
		}
		//verify the month requested
		for(int i = 0; i < temperatures.length ; ++i) {
			if (months[i].equals(userInput)) {
				System.out.println("In " + months[i].substring(0, 1).toUpperCase() + months[i].substring(1)  + " was " + temperatures[i] + " Farenheit.");
			}
		}
		
		yearAvg = yearAvg / 12;
		System.out.printf("The average temperature for the year was %.2f Farenheit.\n", yearAvg);
		System.out.println(monthHot.substring(0, 1).toUpperCase() + monthHot.substring(1) + " was the hottest month with " + highestTemp + " Farenheit.");
		System.out.println(monthCold.substring(0, 1).toUpperCase() + monthCold.substring(1) + " was the coldest month with " + lowestTemp + " Farenheit.");
		System.out.println("Do you want to check other month? Y/N ");
		cont = input.next();
		if (cont.equals("y") || cont.equals("yes")) {
			stop = true;
		} 
		else {
			System.out.print("Goodbye");
			//close scanner
			input.close();
			stop = false;
			}
		}while(stop);
	}
}