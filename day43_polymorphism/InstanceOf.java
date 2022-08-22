package day43_polymorphism;

import java.util.ArrayList;


public class InstanceOf {

	public static void main(String[] args) {
		
		Shape sh = new Triangle();
		
		if(sh instanceof Triangle) {
			System.out.println("Triangle Class");
		}else if(sh instanceof Circle) {
			System.out.println("Circle Class");
		}
		
		ArrayList<Shape> shapeList = new ArrayList<>();
		shapeList.add(new Triangle());
		
		//polymorphic way
		//List<Shape> shapeList2 = new ArrayList<>();
		//there is a mistake I could not detect
		
	}

}