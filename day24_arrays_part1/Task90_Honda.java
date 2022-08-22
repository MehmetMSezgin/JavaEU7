package day24_arrays_part1;

public class Task90_Honda {

	public static void main(String[] args) {
		
		String cars[] = {"suzuki" , "bmw" , "reanult" , "volvo" , "dacia" , "honda"} ;
		
		boolean flag = false ;
		
		for (int i= 0 ; i<cars.length ; i++) {
			
			if (cars[i]=="honda") {
				flag = true ;
			}
		}
		
		if (flag) {
			System.out.println("founded honda");
		}else {
			System.out.println("not founded"); ;
		}
	}

}
