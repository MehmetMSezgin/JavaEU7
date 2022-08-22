package day30_wrapperClass;

public class wrapperClass {

	public static void main(String[] args) {
		
		int n1= 10 ;
		Integer n2 = new Integer(10) ; // it is stroked out because new version came
		Integer n3 = Integer.valueOf(11) ; //new version converting to object style
		System.out.println(n1);
		System.out.println(n2);
		
		double d1 = 44.4 ; //primitive
		Double d2 = new Double("3.14") ; //object
		
		Boolean bool1 = Boolean.valueOf(false) ;
		Boolean bool2 = new Boolean ("false") ;  //String style
		Boolean bool3 = new Boolean (false) ;
		
		//you can not use string style only for char object
	}

}
