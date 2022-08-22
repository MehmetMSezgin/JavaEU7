package day8_controlFlowStatements;

public class taks_if_else {

	public static void main(String[] args) {
		int math, chemistry , biology ;
		math=64;
		chemistry=46 ;
		biology=86 ;
		double a ;
		a= (math + chemistry + biology)/3 ;
		
		if (a<60 && a>0 ) {
			System.out.println("fail");
		} else if (a<=70 && a>=60) {
			System.out.println("slightly passed");
		} else if (a>70 && a<100) {
			System.out.println("successful");
		} else { System.out.println("not a valid score");
		
		}
		System.out.println(a);

		
		
		
		
		
		
		
		
		
	}

}
