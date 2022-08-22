package day5_unary_assignment_relations;

public class relationalOperators {

	public static void main(String[] args) {
				byte b1= 1 ;
				byte b2= 2;
				double d1= 3.5 ;
				float f1= (float) 67.0 ;
				
				boolean test = d1!=f1 ; //not equal
				System.out.println(test);
				
				boolean test2 = d1==f1 ; //equal
				System.out.println(test2);
				
				boolean test3 = (b1*b2)>=(d1/f1) ; //bigger or equal
				System.out.println(test3);
								
				
//				task 2
				int i1, i2;
				i1=10;
				i2=17 ;
				
				boolean boo1= i1>i2 ;
				System.out.println("first no " + i1  + " is greater than second no " +  i2 + " - " + boo1);
				
				
		
	}

}
