package modFour;

public class Circle extends Shape {
	private double radius;
	
	
	public Circle(double radius) {
		this.radius = radius;
	}

	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (Math.PI * (Math.pow(radius, 2)));
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle:\n Radius = " + radius + ",\n Area = " + area() + "\n Perimeter = "
				+ perimeter() + "\n";
	}

	
}
