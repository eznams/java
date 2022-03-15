package modOneCT;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee teacher = new Employee();
		Employee teacherTwo = new Employee();
		Manager dean = new Manager();
		Manager principal = new Manager();
		
		teacher.setFirstName("Adam");
		teacher.setLastName("Smith");
		teacher.setEmployeeID(13142);
		
		teacherTwo.setFirstName("Mayaan");
		teacherTwo.setLastName("Sclein");
		teacherTwo.setEmployeeID(52343);
		teacherTwo.setSalary(4059.73);
		
		principal.setFirstName("Carl");
		principal.setLastName("Evans");
		principal.setEmployeeID(3243);
		principal.setDepartment("Math");
		
		dean.setFirstName("Troy");
		dean.setLastName("Arnold");
		dean.setEmployeeID(1423);
		dean.setDepartment("Computer Science");
		dean.setSalary(6393.2);
		
		ArrayList <Employee> listOfObjects = new ArrayList <Employee>();
		
		listOfObjects.add(teacher);
		listOfObjects.add(teacherTwo);
		listOfObjects.add(principal);
		listOfObjects.add(dean);
		
		for (int i = 0; i<listOfObjects.size();i++) {
			(listOfObjects.get(i)).employeeSummary();
			System.out.println();
		}
	}
}
