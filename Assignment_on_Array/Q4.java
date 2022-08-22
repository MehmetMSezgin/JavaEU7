package Assignment_on_Array;

public class Q4 {

	public static void main(String[] args) {
		
		short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		
		for (short i=0; i<scores.length ; i++) {
			
			if (50 <= scores[i] && scores[i]< 100) {
				System.out.println("half-century");
			}else if (100 <= scores[i] && scores[i] < 200) {
				System.out.println("a century");
			}else if (200 <= scores[i]) {
				System.out.println("a century");
			}
			
			
		}

	}

}
