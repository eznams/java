package modSeven;
import java.util.*;

public class example {
	 public static void main(String args[]) {

		        HashSet<String> set = new HashSet<String>();
		        set.add("Human");
		        set.add("Goodbye");
		        set.add("Ahoy");
		        set.add("Element");
		  
		        System.out.println("Original HashSet: " + set);
		        // Sorting HashSet using List
		        List<String> list = new ArrayList<String>(set);
		        Collections.sort(list);
		        // Print the sorted elements of the HashSet
		        System.out.println("HashSet elements in sorted order using List: " + list);
		
	 }
}

//LinkedList<String> groceryList = new LinkedList<String>();
//String item = "";
////adding fruits and vegetables
//groceryList.add("Pepper");
//groceryList.add("Banana");
//groceryList.add("Tomato");
//
//
////adding element on index 2 
//groceryList.add(2, "Apple");
//System.out.println();
//System.out.println("List: ");
//for (int i = 0; i < groceryList.size(); ++i) {     
//	   item = groceryList.get(i);     
//	   System.out.println((i+1) + ". " + item);  
//}