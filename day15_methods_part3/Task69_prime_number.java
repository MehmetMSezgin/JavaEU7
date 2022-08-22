package day15_methods_part3;

public class Task69_prime_number {

	public static void main(String[] args) {
		
		int number=7 ;
		if (isPrime(number)) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}
	
	public static boolean isPrime (int number) {
		
		boolean flag = true ;
		
		if (number==1 || number==0) {
			//false
			flag = false ;
		} else {
			
			for (int i=2 ; i<number ; i++) {
				
				if (number%i==0) {
					//false
					flag= false ;
					break;
				}
			}
		}
		
		return flag ;
	
	
	}

}
