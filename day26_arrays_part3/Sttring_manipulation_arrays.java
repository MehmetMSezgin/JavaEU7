package day26_arrays_part3;

public class Sttring_manipulation_arrays {

	public static void main(String[] args) {
		
		String[] cars = {"honda" , "bmw" , "mersu"};
		
		System.out.println(cars[2].length());
		System.out.println(cars[0].substring(1));
		System.out.println(cars[1].equals("honda"));
		System.out.println(cars[2].concat("joo"));
		
		for (int i= 0 ; i<cars.length ; i++) {
			System.out.println(cars[i].charAt(0));
		}


	}

}
