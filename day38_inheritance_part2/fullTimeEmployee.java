package day38_inheritance_part2;

public class fullTimeEmployee extends Employee{

	@Override //if I add Override here I can not make changes in parameters
	public void calculatePay (int hours , double rate) {
		System.out.println(hours*rate*1.05); // I just added 1.05
		
		//Normally I have this method in parent class(Employee)
		// but I re-adjust it
		// this is overriding (same name, same parameter)
	}
	 //or
	// ---> source ---> Override/implement methodsx
	
	
	
}
