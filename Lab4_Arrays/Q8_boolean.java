package Lab4_Arrays;

public class Q8_boolean {

	public static void main(String[] args) {
		
		int[] x = {2,5} ;
		int[] y = {1,5, 75,346436,2352,214} ;

		
		System.out.println(check(x));
		System.out.println(check(y));


	}
	
	public static boolean check (int[] array) {
		
		boolean flag = true ;
		for (int i=0 ; i<array.length ; i++) {
			
			if(array[i]==2 || array[i]==3) {
				flag = true ;
				break ; // break is important here
			}else {
				flag = false;
			}
			
		}
		return flag;
		
	}

}
