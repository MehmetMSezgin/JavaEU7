package day14_LAb1_valueReturn;

public class valueReturn_task66 {

	public static void main(String[] args) {
		
		double globalDistance = travel(60,10) ;
		
		if (globalDistance>500) {
			System.out.println("calm down");
		} else {
			System.out.println("go go go");
		}
		
		System.out.println(globalDistance);
	}

	public static double travel(double speed , int time) {
		double distance ;
		distance= speed * time ;
		
		return distance ; 
	}

}
