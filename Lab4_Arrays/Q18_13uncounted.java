package Lab4_Arrays;

public class Q18_13uncounted {

	public static void main(String[] args) {
		int [] x = {1,2,3,1,1,13,133} ;
		System.out.println(unlucky13(x));
	}
	
	public static int unlucky13 (int[] array) { //13 and after that don't count
		
		int sum = 0 ;
		for (int i=0 ; i<array.length ; i++) {
			if (!(array[i]==13)) {
			sum= sum+ array[i] ;
			}else if(array[i]==13) {
				break;
			}
		}
		return sum ;
	}

}
