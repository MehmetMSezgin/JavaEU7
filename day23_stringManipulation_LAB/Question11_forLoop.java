package day23_stringManipulation_LAB;

public class Question11_forLoop {

	public static void main(String[] args) {
		
		String word = "abchihiasldksaölcölsdhihsdkfbogfihkgdmbofdishjngoihiihisalmvdsfhiodfhjbfsiohnked" ;
		// hihello = substring(0,2)
		//ahihello = substring (1,3)          !!!SEE the PATTERN
		//ashihello = substring (2,4)
		
		int counter = 0 ;
		for (int i=0 ; i<word.length()- 1 ; i++) {
			
			
			if (word.substring(i, i+2).equals("hi")) {
				counter++ ;
			}
		}
			
	
		System.out.println(counter);

	}

	
		

}
