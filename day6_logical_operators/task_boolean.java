package day6_logical_operators;

public class task_boolean {

	public static void main(String[] args) {
		boolean x= true, z= false ;
		int y= 29 ;
		
		x=(y!=10) && (z=true) ; //z is defined again. if it was statement
		System.out.println(x);   // if it was statement it would be ==

	}

}
