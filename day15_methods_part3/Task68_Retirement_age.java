package day15_methods_part3;

public class Task68_Retirement_age {

	public static void main(String[] args) {
		
		yearsUntilRetirement("mike" , 1991);
		//1. Going and finding this method and assigns name mike and year 1991
	}
	
	public static int calculateAge(int yearBirth) { //I change the void to int 
		
		return 2021- yearBirth ; //and I use "return"
		// so I made "calculateAge" value global
	}	// return 2021- yearBirth = calculateAge(1991)										
		
		// or we could do 
		// int age = 2021 - yearBirth;
		// return age ;
	public static void yearsUntilRetirement (String name, int year) {
		//2. assigned values
		int retirementAge = 65 - calculateAge(year) ;
		// 3. new value retirementAge and it goes and finds calculateAge method
		// 4. at the same time it assigns to "yearBirth" whatever assigned "year"
		System.out.println(name + " retires in " + retirementAge + " years");
		
	}								

}
