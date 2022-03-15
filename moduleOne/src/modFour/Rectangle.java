package modFour;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (width*length);
	}

	@Override
	public double perimeter() {
		return ((2 * width) + (2 * length));
	}

	@Override
	public String toString() {
		return "Rectangle: \n Width = " + width + "\n Length = " + length + "\n Area = " + area() + "\n Perimeter = " + perimeter() + "\n";
	}
	

}
