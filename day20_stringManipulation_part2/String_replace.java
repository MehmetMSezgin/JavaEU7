package day20_stringManipulation_part2;

public class String_replace {

	public static void main(String[] args) {
		
		String str = "Moscow is a capital of russia" ;
		
		System.out.println(str);
		
		str = str.replace("Moscow", "Helsinki").replace("russia", "Finland") ;
		
		System.out.println(str);
		
		//////////////////////////////////
		
		String email = "firstName_lastName@gmail.com" ;
		
		String company = "lahti" ;
		
		String newemail = email.replace("gmail", "lahti") ; //original string will remain, it creates new object
		
		System.out.println(email + " " + newemail);
		//////////////////////////////////////|||||||||||||||
		
		String name = "my name is muk muk" ;  //it removes all spaces
		String nospace = name.replace(" ", "") ;
		System.out.println(nospace);
		
	}

}
