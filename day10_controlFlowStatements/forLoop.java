package day10_controlFlowStatements;

public class forLoop {

	public static void main(String[] args) {
		for (int i=1; i<=6 ; i++) {     // i++ bir arttir
			System.out.println("hello");
		}
		// i      condition     action     increment(i++)
		// 1         True        hello        1+1
		// 2         True        hello        2+1
		//                .....
		// 6	     True        hello        6+1
		// 7         False         -           -
		// if it is false directly it will jump out of curly brackets
		//////////////////////////////////////////////////////////////
		
		for (int i=20 ; i>=5 ; i-=5) {   //int tanimladik artik iceri sadece int tanimlayabiliriz
			System.out.println("i= " + i);   //i is not global you can use again
		}                                    // because it is inside of "for" statement
		
		// i-=5 i yi beser beser azalt demek
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
