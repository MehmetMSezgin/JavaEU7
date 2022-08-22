package day6_logical_operators;

public class logicalOperators {

	public static void main(String[] args) {
		
		char c1= 'A' ;
		char c2= 65 ;
		int i1=5 ;
		int i2=10 ;
		
		boolean res1 = (c1==c2) && (i2<=i1);
		System.out.println(res1); 
		//tricky question if there is c1++ and syso wants c1
		// c1 would be old value because Java does not do
		// && and c1++ at the same time
		
		boolean res2 =  ! ((c1==c2) && (i2<=i1));
		System.out.println(res2);
		// ! "not operator" it changes t->f , f->t
		
		

	}

}
