package modEight;
import java.util.*;


import java.io.*;
public class studentGPA {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  
	       double gpa = -1;
	       String name = "";
	       String address = "";
	       System.out.print("How many students data you want to enter: ");
	       int numberOfStudents = input.nextInt();
	      
	       LinkedList<Student> List = new LinkedList<Student>();
	      
	       for(int i = 0; i<numberOfStudents; i++) {
	    	   input.nextLine();
	    	   System.out.print("Insert name of student " + (i+1) +": ");
	    	   name = input.nextLine();
	    	   System.out.print("Insert address of student " + (i+1) + ": ");
	    	   address = input.nextLine();
	    	   System.out.print("Insert GPA of student " + (i+1) + ": ");
	    	   try {
	    		   	gpa = validate (input.nextDouble());
					} catch (Exception e) {
						//It's not a decimal value.
						System.out.println("That is not a number. The program will end. Goodbye ");
						System.exit(0);
					}
					Student st = new Student(name, address, gpa);
					List.add(st);  
					
				}
	       
	       	input.close();
	       	Collections.sort(List);
	       	Iterator<Student> li1 = List.iterator();
	       	try {
	       		FileWriter fw = new FileWriter("/Users/ezequiel/Desktop/Java/moduleOne/src/modEight/Students Sorted.txt");
	           	while(li1.hasNext()){
	        	   fw.write(li1.next().toString()+"\n");  
	           	}
	           	fw.close();
	           	System.out.println("File was written.");
	       		} catch (IOException e) {
	       			e.printStackTrace();
	       			System.out.println("Error printing the file");
	       }
	  
	   }
		

	public static double validate(double GPA) {	
		Scanner input = new Scanner(System.in);
		while(GPA < 0 || GPA > 4) {
			System.out.println("Please insert a GPA between 0 and 4!");
			System.out.print("Insert GPA of students: ");
			GPA = (input.nextDouble());
			input.nextLine();
			if(GPA < 0 || GPA > 4) {
				continue;
			}
		}	
		return GPA;
	}
}
