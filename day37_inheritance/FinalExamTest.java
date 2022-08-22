package day37_inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in) ;
		System.out.println("how many question?");
		int Q = sc.nextInt();
		
		System.out.println("how many missed");
		int m = sc.nextInt();
		
		FinalExam st1 = new FinalExam(Q , m) ;
		char result =st1.getGrade();
		System.out.println(result);

	}

}
