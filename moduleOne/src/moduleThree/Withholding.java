package moduleThree;
/*
 * Ezequiel Nams
 * Last edited 12/01/2021
 * Create a program that will calculate the weekly average tax withholding for a customer given the following weekly income guidelines:

Income less than $500: tax rate 10%
Incomes greater than/equal to $500 and less than $1500: tax rate 15%
Incomes greater than/equal to $1500 and less than $2500: tax rate 20%
Incomes greater than/equal to $2500: tax rate 30%.
 * */
import java.util.Scanner;
public class Withholding {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String cont;
		boolean stop = false;
		double income;
		int percTax = 30;
		do {
			
			System.out.println("Please insert your gross weekly income: ");
			income = input.nextDouble();
			
			if (income < 0) {
				System.out.println("Incorrect value. Select a number grater or equal to 0, please start the program again");
				//close scanner
				input.close();
				//terminate program 
				System.exit(0);
			}
			if(income < 500) {
				percTax = 10;
			}else if((income >= 500) && (income < 1500)){
				percTax = 15;
			}else if((income >= 1500) && (income < 2500)) {
				percTax = 20;
			}
			
			double totalTax = income * (0.01 * percTax); 
			System.out.println("Your weekly gross income: $" + income);
			System.out.println("Your weekly tax withholding is: " + percTax + "%");
			System.out.printf("Amount of weekly tax in dollars: $" + "%.2f", totalTax);
			System.out.println();
			System.out.print("Do you want to check again? Y/N:  ");
			cont = input.next();
			cont = cont.toLowerCase();
			if (cont.equals("y") || cont.equals("yes")) {
				stop = true;
			} else {
				System.out.print("Goodbye");
				//close scanner
				input.close();
				stop = false;
			}
			System.out.println();
		} while(stop);
	}
	
}
