package day27_arrays_part4;

public class Teams_2D_array {

	public static void main(String[] args) {
		
		String[][] teams = new String[2][4] ;
		
		teams[0][0] = "a" ;
		teams[0][1] = "b" ;
		teams[0][2] = "c" ;
		teams[0][3] = "d" ;   //first team
		
		teams[1][0] = "!" ;
		teams[1][1] = "?" ;
		teams[1][2] = "¤" ;
		teams[1][3] = "&" ;   //second team
		
		//or
		// String [][] teams = {{a,b,c,d} , {!,?,¤,&}}      (initialising)
		//						  2 rows, 4 columns
		System.out.println("number of rows " + teams.length); //it give row's number
		System.out.println("people in first team " + teams[0].length);
		System.out.println("people in second team " + teams[1].length);
		
		
	
		
		


	}

}
