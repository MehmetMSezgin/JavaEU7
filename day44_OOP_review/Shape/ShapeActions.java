package day44_OOP_review.Shape;

import static day44_OOP_review.Shape.ShapeManager.*; //static import

import java.util.ArrayList;

import java.util.List;


public class ShapeActions {
	
	public static void main(String[] args) {
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		drawSquare((Square)buildShape("square")); //Burayi anlaman cok onemli
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		drawShape("square");
		
		System.out.println("---------------");
		
		List<Shape> myList = new ArrayList<>(); //ArrayList polymorphism
		//inside in this list I am adding objects
		myList.add(new Shape()); // Shape = new Shape();
		myList.add(new Square()); // Shape = new Square();
		myList.add(new Diamond());
		myList.add(new Square());
		
		drawAllShape2(myList); //this method accepting Shape(and extended ones diamond,square..)

		
		
		
	}

}
