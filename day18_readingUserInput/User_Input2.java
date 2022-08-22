package day18_readingUserInput;

import java.util.Scanner; // do not forget

public class User_Input2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Say me smth I will repeat ");
		
		String s1 = sc.nextLine() ;
		
		System.out.println(s1);
		

	}

}
