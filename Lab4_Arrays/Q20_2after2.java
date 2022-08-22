package Lab4_Arrays;

public class Q20_2after2 {

	public static void main(String[] args) {
		int [] x = {1,2,1,2,2} ;
		System.out.println(twoTOtwo(x));
	}
	
	public static boolean twoTOtwo (int[] array) {
		
		for (int i= 0 ; i<array.length ; i++) {
			if (array[i]==2) {
				if(array[i+1]==2) {
					return true ;
				}
			}
		}
		return false ;
		
	}

}
