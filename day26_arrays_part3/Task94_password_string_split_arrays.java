package day26_arrays_part3;

public class Task94_password_string_split_arrays {

	public static void main(String[] args) {
		
		String s1 = "This info is used for creation password : xxxCD132Gxxx. Please do not share with anyone" ;
		String s2 = "This info is used for creation password : xxx00ABC!xxx. Please do not share with anyone" ;

		String[] array = s1.split("xxx") ;
		String[] array2 = s2.split("xxx") ;
	//	for (String value : array) {
	//		System.out.println(value);
	//	}
		
		System.out.println("your unique password is: " + (array[1].concat(array2[1]))  );
		
	}

}
