package day5_unary_assignment_relations;

public class increment_decrement_task {

	public static void main(String[] args) {
		int a=50 ;
		int result= --a + a++ + a-- + a++ ;
		
// a in memory    : 50 -> 49 -> 50 -> 49 -> 50
//result	      : 49 + 49 + 50 + 49
				
				System.out.println(a);
				System.out.println(result);
		
			
				
		//task 2
		int a2 = 1 ;
		int result2 = -a2-- + a2++ / -a2-- * --a2 ; 
		System.out.println(a2);
		System.out.println(result2);
// a2 in memory   : 1 -> 0 -> 1 -> 0 -> -1          
// result 2       : -1 + 0 / -1 * -1
	}

}
