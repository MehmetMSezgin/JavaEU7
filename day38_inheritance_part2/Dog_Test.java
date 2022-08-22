package day38_inheritance_part2;

public class Dog_Test {

	public static void main(String[] args) {
		
		//Dog dog = new Dog() ; // I can not define object like that because I dont have 
								// default cons Dog() , I have only with parameters
	
		Dog dog = new Dog("yorkie", 1, 2, 8, 20, 2, 4, 1, 20, "long sily");
		
		dog.eat();
		dog.chew();
		
		// dog.name = "abc" ;
		// I can not initialize my name again 
		// because I dont have setter in my child and parent class
	}

}
