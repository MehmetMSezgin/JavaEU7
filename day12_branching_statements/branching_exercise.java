package day12_branching_statements;

public class branching_exercise {

	public static void main(String[] args) {
		  
		int i=0 ;
		
		while (i<15) {
			i++;
			
			if (i<5) {
				System.out.println("skipped numbers " + i);
				continue;
			}
			
			if (i>10) {
				System.out.println("break numbers " + i );
				break;
			}
			System.out.println(i);
		}
		
	
		
	}

}
