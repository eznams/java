/*
 * Ezequiel Nams
 * Last edited 12/08/2021
 * Write a program that will provide important statistics for the grades in a class. The program will utilize a for-loop to 
 * read ten floating-point grades from user input. Include code to prevent an endless loop. Ask the user to enter the values, t
 * hen print the following data:
 * Average
 * Maximum
 * Minimum
 * */

package moduleFour;
import java.util.Scanner;

public class gradeStatistics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		double sum = 0.0;
		double average;
		double minimum = 100.0;
		double maximum = 0.0;
		double grade;
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println("Please insert the grade of student " + i + " (grade should be between 0 and 100.0) :");
			grade = input.nextDouble();
			if (grade > 100 || grade < 0) {
				
				System.out.println("The input entered is incorrect. Please start the program again. Make sure that the grade should be between 0 and 100.0");
				input.close();
				System.exit(0);
			}
			sum += grade;
			if (grade > maximum) {
				maximum = grade;
			}
			if(minimum > grade) {
				minimum = grade;
			}	
		}
		average = sum / 10.0;
		input.close();
		System.out.println("Average Grade: " + average);
		System.out.println("Maximum Grade: " + maximum);
		System.out.println("Minimum Grade: " + minimum);
	}

}
