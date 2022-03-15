package modSix;
import java.util.*;
public class MainStudents {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		//change address
		students.add(new Student(3, "Heather White", "18 Corona Ave, Chevy Chase, MD 20815"));
		students.add(new Student(9, "Alan Arnold", "7146 North Meadowbrook Dr. Bloomfield, NJ 07003"));
		students.add(new Student(1, "Beatriz Ford", "9947 Howard Ave. Camas, WA 98607"));
		students.add(new Student(98, "Hannah Xo", "358 White Ave. Tampa, FL 33604"));
		students.add(new Student(32, "Beau Bo", "7271 Orchard Drive Dearborn Heights, MI 48127"));
		students.add(new Student(37, "Anthony Feran", "7147 Applegate Road Nazareth, PA 18064"));
		students.add(new Student(5, "Clara Mind", "40 Sulphur Springs Ave. Reisterstown, MD 21136"));
		students.add(new Student(4, "Jonh Smith", "82 Madison Ave. Amityville, NY 11701"));
		students.add(new Student(8, "Ella Bradley", " 170 W. Homestead Dr. Pickerington, OH 43147"));
		selectionSort(students);
		for(int i = 0; i < students.size(); i++) {   
		    System.out.println(students.get(i).toString());
		    
		}  
	}
	static void selectionSort(ArrayList<Student> students)
    {
        int size = students.size();
        for (int i = 0; i < size-1; i++){
            
            int min_idx = i;
            for (int j = i+1; j < size; j++) {
                if (students.get(j).compareTo(students.get(min_idx)) < 0){
                	min_idx = j;
                }
        	}
            Student temp = students.get(min_idx);
            students.set(min_idx, students.get(i));
            students.set(i, temp);
            //used this print statement to test
            //System.out.println(students);
        }
    }
}
