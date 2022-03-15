package modFour;

public class examplesModFour {

	/*public class EmployeeData implements Comparable<EmployeeData> {
		   private String firstName; // First Name
		   private String lastName;  // Last Name
		   private Integer emplID;   // Employee ID
		   private Integer deptNum;  // Department Number
		   
		   EmployeeData(String firstName, String lastName, Integer emplID, Integer deptNum) {
		      this.firstName = firstName;
		      this.lastName = lastName;
		      this.emplID = emplID;
		      this.deptNum = deptNum;
		   }

		   @Override
		   public int compareTo(EmployeeData otherEmpl) {
		      String fullName;           // Full name, this employee
		      String otherFullName;      // Full name, comparison employee
		      int comparisonVal;         // Outcome of comparison
		      
		      // Compare based on department number first
		      comparisonVal = deptNum.compareTo(otherEmpl.deptNum);
		      
		      // If in same organization, use name
		      if (comparisonVal == 0) {
		         fullName = lastName + firstName;
		         otherFullName = otherEmpl.lastName + otherEmpl.firstName;
		         comparisonVal = fullName.compareTo(otherFullName);
		      }
		      
		      return comparisonVal;
		   }
		   
		   @Override
		   public String toString() {
		      return lastName + " " + firstName + 
		             "       \tID: " + emplID + 
		             "\t\tDept. #: " + deptNum;
		   }
		}
/class that could have multiple values generic class - there could be also generic methods (last part)!!
 * 
public class TripleItem <TheType extends Comparable<TheType>> {
   private TheType item1; // Data value 1
   private TheType item2; // Data value 2
   private TheType item3; // Data value 3

   public TripleItem(TheType i1, TheType i2, TheType i3) {
      item1 = i1;
      item2 = i2;
      item3 = i3;
   }

   // Print all data member values
   public void printAll() {
      System.out.println("(" + item1 + "," + item2 + "," + item3 + ")");
   }

   // Return min data member value
   public TheType minItem() {
      TheType minVal;        // Holds min item value, init to first item

      minVal = item1;

      if (item2.compareTo(minVal) < 0) {
         minVal = item2;
      }
      if (item3.compareTo(minVal) < 0) {
         minVal = item3;
      }
      return minVal;
   }
}
public class TripleItemManager {
   public static void main(String[] args) {

      // TripleItem class with Integers
      TripleItem<Integer> triInts = new TripleItem<Integer>(9999, 5555, 6666);       
      
      // TripleItem class with Shorts
      TripleItem<Short> triShorts = new TripleItem<Short>((short)99, (short)55, (short)66); 

      // Try methods from TripleItem
      triInts.printAll();
      System.out.println("Min: " + triInts.minItem() + "\n");
      
      triShorts.printAll();
      System.out.println("Min: " + triShorts.minItem());
   }
}	
	//generic method	
   public static <TheType extends Comparable<TheType>> 
   TheType tripleMin(TheType item1, TheType item2, TheType item3) {
      TheType minVal = item1; // Holds min item value, init to first item

      if (item2.compareTo(minVal) < 0) {
         minVal = item2;
      }
      if (item3.compareTo(minVal) < 0) {
         minVal = item3;
      }
      return minVal;
   }		
		
		
		
		*/

}
