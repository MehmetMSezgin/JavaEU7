package day45_exceptions;

public class try_catch {

	public static void main(String[] args) {
		
		try {
			String str = "java";
			
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5)); //i might have problem here
			System.out.println(str.charAt(1)); //will not be executed

			
		}catch(Exception e) {
			System.out.println("exception happened in try block");
		}
		
		System.out.println("After try catch block");
		
		
	
		
		

	}

}
