package day43_polymorphism;

public class AppleTest {

	public static void main(String[] args) {
		
		AppleDevice apple = new Mac();
		
		apple.use(); // this can be used because "use" method has been existed in AppleDevice and Mac(overriding)
		
		//apple.code() it cannot be used because reference type(AppleDevice) does not have this method
		
		//this rule is valid for just polymorphism
		
		//try by creating normal object
		
		Mac app = new Mac();
		app.use();
		app.code();
		
	}

}
