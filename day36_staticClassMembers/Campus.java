package day36_staticClassMembers;

public class Campus {
	private String city ;
	static String country ;
	
	static {
		System.out.println("1");  //these static blocks will run FIRST and only ONE TIME
		country = "UK";
	}
	
	public Campus (String city) {
		System.out.println("constructor");
		this.city=city ;
	}
	
	static {
		System.out.println("2"); //these static blocks will run FIRST and only ONE TIME
		country = "USA";
	}
}
