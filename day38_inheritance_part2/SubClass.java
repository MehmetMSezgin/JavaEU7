package day38_inheritance_part2;

public class SubClass extends SuperClass{
	
	public SubClass() {
		super(2) ; //go to super class (parent class) and find Constructor which accepts int value
		System.out.println("this is subclass cons");
	}
}
