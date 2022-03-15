package modFour;

public class Triangle extends Shape{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double side1, double side2, double side3) {
	
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public double area() {
		//using Heron's formula to calculate area
		double s = (side1 + side2 + side3) / 2;
		double areaSquare = s * (s - side1) * (s - side2) * (s - side3);
		return Math.sqrt(areaSquare);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (side1 + side2 + side3);
	}

	@Override
	public String toString() {
		return "Triangle:\n Side 1 = " + side1 + "\n Side 2 = " + side2 + "\n Side 3 = " + side3 + "\n Area() = " + area()
				+ "\n Perimeter = " + perimeter();
	}
	
	
}
