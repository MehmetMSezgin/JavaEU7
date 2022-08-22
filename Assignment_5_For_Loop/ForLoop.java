package Assignment_5_For_Loop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		//Question1();
		//Question2();
		//Question3();
		//Question4();
		//Question5();
		//Question6();
		//Question7();
		//Question8();
		//Question9();
		//Question10();
		//Question11();
		//Question12();
		Question13();
		//Question14();
	}
	
	public static void Question1 () {
		for(int i=0 ; i<=1000 ; i=i+10) {
			System.out.println(i);
		}
	}
	///////////////////////////////////////////
	public static void Question2() {
		
		for(int i=3 ; i<=130 ; i++) {
			if((i%2)==1) {
				System.out.println(i);
			}
		}
		
	}
	/////////////////////////////////////////
	public static void Question3() {
		for(int i=5 ; i<=50 ; i++) {
			if((i%2)==0) {
				System.out.println(i);
			}
		}
	}
	///////////////////////////////////////////
	public static void Question4() {
		int number=0 ;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter a number");
			number = sc.nextInt();
		}while (number<100) ;
		
	}
	///////////////////////////////////////////
	public static void Question5() {
		for (int i=1 ; i<=10 ; i++) {
			System.out.println("12 X " + i + " = " + (12*i));
		}
	}
	///////////////////////////////////////////////////
	public static void Question6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int count= sc.nextInt() ;
		int pre1=0 ;
		int pre2=1 ;
		
		System.out.println("Fibonacci series of " + count + " numbers");
		System.out.print(0 + " ");
		
		for (int i=1 ; i<count ; i++) {
			System.out.print(pre2 + " ");
			int sum= pre1 + pre2;
				pre1= pre2;
				pre2= sum;	
		}
	}
	///////////////////////////////////////////
	public static void Question7() {
		for (int i=0 ; i<=100 ; i++) {
			if (i%5==0) {
				System.out.println(i);
			}
		}
	}
	//////////////////////////////////////////
	public static void Question8() {
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter a number");
		int upperBound= sc.nextInt();
		int sum = 0;
			for(int i =0; i<=upperBound ; i++) {
				sum+=i;
			}
		System.out.println(sum);
		} while (true);
		
	}
	////////////////////////////////////////
	public static void Question9() {
		String sum = "";
		int number =11 ;
		if (number<3) {
			System.out.println("invalid");
		}
		System.out.print("1");
		for (int i=3 ; i<=number ; i++) {
			if (!(i%2==0)) {
				sum = sum + ", " + i ;
			}
		}
		System.out.print(sum);
	}
	////////////////////////////////////////
	public static void Question10() {
		for (int i=1 ; i<=7 ; i++) {
			
			for (int j=1 ; j<=i ; j++) {
				System.out.print(i);        
			}
			System.out.println("");
		}
	}
	///////////////////////////////////////
	public static void Question11() {
		for (int i=1 ; i<=4 ; i++) {
            
            for (int j=1 ; j<i ; j++) {
                
                System.out.print(" ");
            }
        
            for (int k=5-i ; k>=1 ; k--) {
                
              System.out.print(k+ "  ");
            
            
            }
            
            System.out.println();

            System.out.println();
		}
	}
	////////////////////////////////////////
	public static void Question12() {
		
		for(int i=1 ; i<=10 ; i++) {
			for (int j=1 ; j<=10 ; j++) {
				System.out.print((i*j) + " ");
			}
			System.out.println();
			System.out.println();
		}
	}
	/////////////////////////////////////////
	public static void Question13() {
		String L1 = "W" ;
		String L2 = "B" ;
		String L3 = ""  ;
		
		for (int i=0 ; i<=8 ; i++) {
			for (int j=0 ; j<=8 ; j++) {
				if (((j%2)==0)) {
					System.out.print(L1 + " ");
				}else {
					System.out.print(L2 + " ");
				}
			}
		System.out.println();
		L3 = L2 ;
		L2 = L1 ;
		L1 = L3 ;
		}
	}
	////////////////////////////////////////////
	public static void Question14() {
		for (int i=1 ; i<=6 ; i++) {
			System.out.print("#");

			for (int j=1 ; j<i ; j++) {
				System.out.print(" ");        
			}
			System.out.print("#");
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
