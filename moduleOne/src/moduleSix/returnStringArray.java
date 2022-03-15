/*
 * Ezequiel Nams
 * Last edited 01/01/2022
 * Write program with a method that returns an array. The method should accept as input a comma-delimited string with three values from a user. 
 * The array should store each value in a different element. Use Try..Catch error handling and print any failure messages, or print success from within
 * method if execution is successful (see Chapter 6 in the text).
 * Call the method from the main method of the program to demonstrate its functionality by looping through the array and printing the individual values.
 * 
 * */

package moduleSix;
import java.util.Scanner;
public class returnStringArray {
	public static void main(String args[]){
		       
	   String userInput;
	   String arrayInput[];
	   Scanner input= new Scanner(System.in);
	   
		   System.out.print("Enter three String values separated with comma (,): ");
		   userInput = input.nextLine();
		   //calling method
		   arrayInput = returnStringArray(userInput);   
		   //print results only if the arrayInput contains 3 values
		   if(arrayInput.length == 3){
		       System.out.println("The String values are (separated with a ' - ' ): ");
		       
		       for(int i = 0; i<arrayInput.length; i++){
		    	   if (i < 2) {
		    		   System.out.print(arrayInput[i] + " - ");
		    	   } else {
		    		   System.out.print(arrayInput[i]);
		    	   }
		       }
		   }
		  
	}
	// method
	public static String[] returnStringArray(String userString) {	 
		String values[]= new String[3];
		try{
	       if(userString == ""){
	    	   throw new Exception("Program failed - an empty String cannot be processed.");
	       } else 
	    	   if(userString == null){
	    		   throw new Exception("Program failed - Null String cannot be processed.");
	    	   } else {
	    		   values = userString.split(",");
		       if(values.length < 3){
		           throw new Exception("Program failed - There are less than 3 Strings in the input.");
		       } else 
		    	   if(values.length > 3){
		    		   throw new Exception("Program failed - There are more than 3 Strings in the input.");
		    	   } else {
		    		   System.out.println("Success");
		    		   return values;
		           	}
		       }
		}
		catch(Exception e){
    	   System.out.println(e.getMessage());
		}
		// the method needs to return something
		return new String[0];
		
   }

}