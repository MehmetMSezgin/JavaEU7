package day36_staticClassMembers;

public class ABCtest {

	public static void main(String[] args) {
		
		ABC.m1(); //way 1
		// you can call static methods directly
		
		ABC o1 = new ABC() ; //way 2
		o1.m1();
		
	}

}
