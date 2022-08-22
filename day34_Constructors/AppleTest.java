package day34_Constructors;

public class AppleTest {

	public static void main(String[] args) {
		Apple a1 = new Apple() ;
		// apple is my reference type
		// a1 is my variable
		System.out.println(a1.color); //red
		changeApple(a1) ;
		System.out.println(a1.color); //white
		
		System.out.println( methodObject() ); //it holds address
		System.out.println( methodObject().color);
	}
	
	public static void changeApple(Apple x) {
		//x yerine a1 de yazabilirdin
		
		x.color = "white" ;
	}
	
	public static Apple methodObject () {
		Apple b1 = new Apple();
		return b1 ;
	}
}
