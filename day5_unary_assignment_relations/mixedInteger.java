package day5_unary_assignment_relations;

public class mixedInteger {

	public static void main(String[] args) {
		int i1=5 ;
		int i2= 10 ;
		float f1=15.5f ; //force to be float
		double d1=20.5 ;
		
		int res1=i1+i2; //should be at least integer
		float res2=i1+f1; // should be at least float 
		double res3= i2+d1; //should be at least double
		
		short s1=15 ;
		short s2=12 ;
		 int s3= s1 + s2 ; //short+short = java automatically changes integer
		 // s3 can not be defined as short
	}

}
