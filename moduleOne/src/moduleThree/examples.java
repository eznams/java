package moduleThree;


import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;

public class examples {
	
		   public static void main(String[] args) {
			   
			  String item;
		      int quantity;
		      int discount;

		      StringWriter itemCharStream = new StringWriter();
		      PrintWriter itemOSS = new PrintWriter(itemCharStream);

		      item = "Shoes";
		      quantity = 10;
		      discount = 35;

		      itemOSS.println(item + " x" + quantity);
		      itemOSS.print(discount + "% off");

		      System.out.print(itemCharStream.toString());
		      System.out.println(taxCalc(5.3));
		      
		   }
		   public static double taxCalc (double price){

			   return (price + (price * 0.82));
		   }
	
		
}
	