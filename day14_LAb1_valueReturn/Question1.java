package day14_LAb1_valueReturn;

public class Question1 {

	public static void main(String[] args) {
		stringTimes("Hi" , 3);
	}

	public static void stringTimes(String string , int number) {
		
		String str = "" ;
		for (int i=0 ; i<number ; i++) {
			
			str = str + string ;
			
		}
		System.out.print(str);
		
	}

}
