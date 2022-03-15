package modFive;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.math.BigInteger;

public class example {
	
	public static void main(String args[]){
		sayHello(5);
		sayHello(-1);
		sayHello(0);
	}
	static void sayHello(int n){
		if (n < 0){ 
			System.out.println("Incorrect number");
			System.exit(0);
		} 
		if (n > 0){
			System.out.println("Hello World " + n);
		    n--;
		    sayHello(n);
		}
	}
}
	
//	public static int multiply(int n) {
//		if(n < 0) {
//			System.out.println("The number " + n + " is not positve or integer.");
//			System.exit(0);
//			return 0;
//		}
//		//recursive call
//		if (n>1) {
//			return n*(multiply(n-1));
//		} // base case
//		else {
//			return 1;
//		}
//	}
//	public static void main(String args[]){
//		System.out.println("Factorial of 8 is " + multiply(8));
//		System.out.println("Factorial of 0 is " + multiply(0));
//		System.out.println("Factorial of -1 is " + multiply(-1));
//		
//		
//	}

//	// Returns the first character of the string str
//	public static char firstCharacter(String str) {
//		return str.charAt(0);
//	}
//
//	// Returns the last character of a string str
//	public static char lastCharacter (String str) {
//	    return str.charAt(str.length()-1);
//	}
//
//	// Returns the string that results from removing the first
//	//  and last characters from str
//	public static String middleCharacters (String str) {
//	    str = str.substring(1, str.length() - 1);
//		return str;
//	}
//	
//
//	public static boolean isPalindrome(String str) {
//	    // base case #1
//	    if (str.length() == 1 || str.length() == 0){
//	        return true;
//	    }
//	    // base case #2
//	    else if (firstCharacter(str) != lastCharacter(str)){
//	        return false;
//	     // recursive case
//	    } else{
//	    	boolean returned = isPalindrome(middleCharacters(str));
//	    	return returned;
//	    }
//	}
//	public static void main(String args[]){
//		String a, b, c;
//		a = "a";
//		b = "rotor";
//		c = "motor";
//		if(isPalindrome(a)) {
//			System.out.println(a + " is palindrome");
//		}else {
//			System.out.println(a + " is not palindrome");
//		}
//		if(isPalindrome(b)) {
//			System.out.println(b + " is palindrome");
//		}else {
//			System.out.println(b + " is not palindrome");
//		}
//		if(isPalindrome(c)) {
//			System.out.println(c + " is palindrome");
//		}else {
//			System.out.println(c + " is not palindrome");
//		}
//		
//	}
//}
	