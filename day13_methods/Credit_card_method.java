package day13_methods;

public class Credit_card_method {

	public static void main(String[] args) {
		double salary=5000 ;
		int creditRating=5 ;
		
		if (salary>=5000 && creditRating>=5) {
			qualify();
		} else {
			noQualify() ;
		}

	}
	
	public static void qualify() {
		System.out.println("eligible");
		
	}

	public static void noQualify () {
		System.out.println("not eligible");
	}

}
