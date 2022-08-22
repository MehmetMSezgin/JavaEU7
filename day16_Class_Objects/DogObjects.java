package day16_Class_Objects;

public class DogObjects {

	public static void main(String[] args) {
		
		
		Dog dog1 = new Dog () ;
		
		Dog dog2 = new Dog () ;
		
		Dog dog3 = new Dog () ;
		
		//Default variables
		// String: null , int: 0 , boolean:false , char: " " (empty)
		
		dog1.name = "Nuknuk" ;
		dog1.age = 5 ;
		dog1.breed = "puppy" ;
		dog1.size = "small" ;
		dog1.color = "white" ;
		dog1.getInfo();
		
		dog2.name = "Kucukucu" ;
		dog2.age = 4 ;
		dog2.breed = "golden" ;
		dog2.size = "middle" ;
		dog2.color = "yellow" ;
		dog2.getInfo() ;

	}

}
