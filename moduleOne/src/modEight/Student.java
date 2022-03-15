package modEight;
import java.util.*;

public class Student implements Comparable<Student>{
	private String name;
	private String address;
	private double GPA;
	
	public Student(String name, String address, double gpa) {
		super();
		this.name = name;
		this.address = address;
		GPA = gpa;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}

	@Override
	public String toString() {
		return "Student Name: " + name + "\t Address: " + address + "\t GPA: " + GPA;
	}

	@Override
	public int compareTo(Student s) {
		int i = name.compareTo(s.getName()) ;
		if (i >= 1) {
            return 1;
        }
        else if (name.equals(s.getName())) {
            return 0;
        }
        else {
            return -1;
        }
	}
	
}
