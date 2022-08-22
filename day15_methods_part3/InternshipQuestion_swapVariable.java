package day15_methods_part3;

public class InternshipQuestion_swapVariable {

	public static void main(String[] args) {
		//solution 1
		int n1= 10 ;
		int n2= 20 ;
		int n3 ;
		
		n3=n1 ;
		n1=n2 ;
		n2=n3 ;
		
		//solution 2 without 3rd variable
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;

	}

}
