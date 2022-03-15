package modOneCT;

public class Employee {
	private String firstName;
	private String lastName;
	private int employeeID;
	private double salary;
	
	public Employee() {	
		this.salary = 0;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void employeeSummary() {
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Employee ID: "+ employeeID);
		System.out.println("Monthly salary: $"+ salary);
	}
	
}
