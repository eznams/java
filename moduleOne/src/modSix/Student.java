package modSix;

public class Student {
	int rollno;
	String name;
	String address;
	
	public Student(int rollno, String name, String address) {
		
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student Roll number: " + rollno + "\n \t Name: " + name + "\n \t Address: " + address + "\n";
	}
	
	public int compareTo(Student this,Student other) {	
		return this.rollno - other.rollno;
	}
}

