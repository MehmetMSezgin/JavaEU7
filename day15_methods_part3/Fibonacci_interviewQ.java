package day15_methods_part3;

public class Fibonacci_interviewQ {

	public static void main(String[] args) {
		// 1 1 2 3 5 8 13 21 34...
		// 1	pre1
		// 1	pre2		pre1
		// 2	sum1	=	pre2		pre1
		// 3				sum2	=	pre2
		// 5							sum3
		// 8
		
		int count=20 ;
		int pre1=0 ;
		int pre2=1 ;
		
		System.out.println("Fibonacci series of " + count + " numbers");
		
		for (int i=1 ; i<count ; i++) {
			System.out.print(pre2 + " ");
			// on each iteration, we are assigning second number to the first number
			// and assigning the sum of last two numbers to the second number
			int sum= pre1 + pre2;
				pre1= pre2;
				pre2= sum;	
		}
		
		
		
		
		
		
	}

}
