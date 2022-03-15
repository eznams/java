package moduleI;

import java.util.ArrayList;
class main{
	public static void main(String[] args) {
			Clothes myObj = new Clothes("X Large", "Blue");
			pants myObjTwo = new pants ("Medium","Red",2 ,"Black");
			shirts myObjThree = new shirts ("S","Black", 3, "Grey");
			
			System.out.println(myObj.toString());
			System.out.println(myObjTwo.toString());
			System.out.println(myObjThree.toString());
			
			System.out.println();
			ArrayList <Object> list = new ArrayList <Object> ();
			list.add(myObj);
			list.add(myObjTwo);
			list.add(myObjThree);
			//showing polymorphism
			System.out.println(list.toString());
			
	
		}
}