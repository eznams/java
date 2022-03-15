package modFour;
//import java.util.*;
public class ShapeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(4.5, 8);
		Circle cir = new Circle(2);
		Triangle tri = new Triangle (4, 4, 4);
		Shape[] shapeArray = new Shape[3];
		shapeArray [0] = rect;
		shapeArray [1] = cir;
		shapeArray [2] = tri;
		for(int i = 0; i < shapeArray.length; i++) {
			System.out.println(shapeArray[i].toString());
		}
	}

}
