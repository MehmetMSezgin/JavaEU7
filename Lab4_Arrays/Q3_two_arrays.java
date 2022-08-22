package Lab4_Arrays;

public class Q3_two_arrays {

	public static void main(String[] args) {
		int [] a = {1,2,3} ;
		int [] b = {2,4,5} ;
		
		System.out.println(commonBeginning(a,b));

	}
	
	public static String commonBeginning (int[] x , int[] y) {
		if (!(x.length>1)) {
			return "Array is not valid" ;
		}
		
		if (!(y.length>1)) {
			return "Array is not valid" ;
		}
		
		if(x[0]==y[0]) {
			return "true" ;
		}else {
			return "false" ;
		}
	
	}

}
