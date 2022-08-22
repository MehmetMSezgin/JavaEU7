package day5_unary_assignment_relations;

public class unary {

	public static void main(String[] args) {
		int i1= 10 ;
		int i2= -100 ;
		int i3= - (i1+i2) ; //90
		System.out.println(i3);
		
		boolean flag=true ;
		System.out.println(!flag);
		
		//Pre and post
		int i=10 , j=5 ;
		i++; --j ; //value of i will be activated next line which is 17th
		System.out.println(i);
		System.out.println(j);
		
		int iNEW=20 , jNEW=30 ;
		System.out.println(iNEW++ + --jNEW); //iNEW is not active in this line
		//iNEW will be active next line so 49
		//jNEW will be activated same line
		// Also ++ and -- can be used without defining just in println 
		
		int x= 2 ;
		int y= x++ ; //y is not affected this line so 2
		System.out.println(x); //x is affected anymore it is 3
		System.out.println(y); //y does not change so 2

	}

}
