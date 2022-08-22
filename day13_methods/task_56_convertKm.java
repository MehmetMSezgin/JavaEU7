package day13_methods;

public class task_56_convertKm {

	public static void main(String[] args) {
		convertKM();
		greater();
	}

	public static void convertKM() {
		double mile=140 , km ;
		km= (mile * 1.60) ;	
		System.out.println("km= " + km + " mile= " + mile );
	}
	
	public static void greater() {
		
		int num1=5 ;
		int num2=5 ;
		if (num1>num2) {
			System.out.println("num1 is greater");
		} else if (num2>num1) {
			System.out.println("num2 is grater");
		} else {
			System.out.println("equal");
		}
		
	}

}

