package day44_OOP_review.Shape;

import java.util.List;

public class ShapeManager {
	
		public static Shape buildShape (String type) {
			Shape shape=null ;
			
			switch(type.toLowerCase()) {
				case "shape" :
					shape = new Shape();
					break;
				case "diamond" :
					shape = new Diamond();
					break;
				case "square" :
					shape= new Square();
					break;
			}
			
			return shape;	
		}
		
		public static void drawShape(String shapeType) {
			Shape shape =null;
			
			switch(shapeType.toLowerCase()) {
				case "shape" :
					shape = new Shape();
					shape.draw();
					break;
				case "square" :
					shape = new Square();
					shape.draw();
			}
			
		}
		
		public static void drawSquare (Square squareObject) {
			squareObject.draw();
		}
		
		public static void drawAllShape () {
			Shape[] shapeList = {} ;
			for (Shape each : shapeList) {
				each.draw();
			}
		}
		
		
		public static void drawAllShape2(List<Shape> shapeList) {
			for (Shape each : shapeList) {
				each.draw();
			}
		}
		
	
		
		
}
