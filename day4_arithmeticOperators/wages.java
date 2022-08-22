package day4_arithmeticOperators;

public class wages {

	public static void main(String[] args) {
		double regularWage;
		double basePay=25;
		double regularHours=40;
		double overtimeWages;
		double overTimePay=37.5;
		double overTimeHours=10;
		double totalWage;
		
		regularWage=basePay * regularHours;
		overtimeWages=overTimePay * overTimeHours;
		totalWage= regularWage + overtimeWages;
		
		
		System.out.println("Total wages are " + totalWage + "$");
		
	}

}
