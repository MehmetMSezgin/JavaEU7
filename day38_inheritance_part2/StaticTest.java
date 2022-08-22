package day38_inheritance_part2;

public class StaticTest { //asagida onemli konular var oku

	public static void main(String[] args) {
		
		StaticSub obj = new StaticSub();
		
		obj.num = 5 ;
		obj.print();
		
		StatticSuper.num = 10 ; // i can directly use parent class name as well because
		// num is static
		//*************************************
		
		
		StaticSub.m1(); // I can call directly childClassName.parentMethod because static
		obj.m1(); // or I can call by using obj (inherited)
		
		
		//****************************
		//StaticSub.m2() ; //I can not directly call non-static method from parent class
		// but it is inheritted and I can use obj.m2()
		obj.m2();
	}

}
