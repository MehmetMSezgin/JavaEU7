package day38_inheritance_part2;

public class CompanyTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		fullTimeEmployee f = new fullTimeEmployee();
		
		emp.calculatePay(40, 40);
		
		f.calculatePay(40, 40);
	}

}
