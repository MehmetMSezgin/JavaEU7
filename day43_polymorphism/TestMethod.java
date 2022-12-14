package day43_polymorphism;

public class TestMethod {

	public static void main(String[] args) {
			
			ChildA chA = new ChildA();
			chA.m1();
			chA.m2();
			chA.m3();
			
			Parent p1 = new ChildA();
			p1.m1();
			
			Parent p2 = new ChildB();
			p2.m1();
			
			MyInterface int1 = new ChildA();
			int1.m2();
			//int1.m3() !!!no access

	}
}

class Parent {
	public void m1() {}
}
	
interface MyInterface {
	void m2();
}

class ChildA extends Parent implements MyInterface {
	public void m2() {}
	public void m3() {}
}

class ChildB extends Parent implements MyInterface {
	public void m2() {}
	public void m4() {}
}
	
	
	
	

