package modFive;
import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		//array for storing 5 numbers
		int[] inputArray = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five numbers (separate them with a space): ");
		for (int i = 0; i < inputArray.length; i++) {
			try {
				inputArray[i] = input.nextInt();
			} catch(Exception exc){
				System.out.println("Incorrect input. Program will exit.");
				System.exit(0);
			}
		}
		
		System.out.println(); 
		System.out.println("The answer to the multiplication is " + recursiveMultiplication(inputArray,4));
	} 
	
	public static int recursiveMultiplication(int arr[], int amountOfNumbers) {
		//base case
		if(amountOfNumbers<0) {
			return 1; 
		}
		//recursive call
		return arr[amountOfNumbers] * recursiveMultiplication(arr, --amountOfNumbers);
	}
}
