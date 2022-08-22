package Lab4_Arrays;

public class Q1 {

	public static void main(String[] args) {
		
		int[] x = {1,3,6} ;
		
		System.out.println(firstLast6(x)); ;

	}
	
	public static boolean firstLast6 (int[] arr) {
		
		if(arr.length<1) {
			return false ;
		}
		
		if (arr[0]==6 || arr[arr.length-1]==6) {
			return true ;
		}else {
			return false;
		}
	}

	

}
