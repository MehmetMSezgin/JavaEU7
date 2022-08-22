package day44_OOP_review.Shape;

public class Triangle extends Shape {
	
	public Triangle() {
		type = "triangle";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
	}
	
	

}
