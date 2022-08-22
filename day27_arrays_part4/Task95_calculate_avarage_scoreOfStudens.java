package day27_arrays_part4;

public class Task95_calculate_avarage_scoreOfStudens {

	public static void main(String[] args) {
		
		int[][] list = {{68,75,54,80},
					{100,64,20,50},
					{10,35,40,90}
	};
		int sum = 0 ;
		for (int column=0 ; column<list[0].length ; column++) {
				sum = sum + list[0][column] ;
				
			}
		System.out.println(sum/list[0].length);  //avarage of first student's scores
		
		
		int sum2 = 0 ;
		for (int row= 0 ; row<list.length ; row++) {
			sum2 = sum2 + list[row][0] ;
		}
		System.out.println("math's avarage score " + (sum2/list.length));
	}

}
