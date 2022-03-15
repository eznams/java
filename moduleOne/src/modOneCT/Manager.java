package modOneCT;

public class Manager extends Employee {
	private String department;

	public Manager() {
		super();
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void employeeSummary() {
		super.employeeSummary();
		System.out.println("Department: " + department);
	}
	
	
}
