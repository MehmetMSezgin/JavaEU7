package day19_stringManipulation;

public class String_contains { //Contains says only true or false of matching

	public static void main(String[] args) {
		String str = "Justice in the world" ;
		boolean b = str.contains("Justice") ;
		
		System.out.println(b);
		
		String list = "tomato, potato, mango, cucumber" ;
		

		
		if (list.contains("mango")) {
			System.out.println("joo");
			
		}else {
			System.out.println("ei");
		}

	}

}
