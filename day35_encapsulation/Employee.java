package day35_encapsulation; //setters and getters

public class Employee {
	
	private String name ;
	private int idNum ;
	private String department ;
	private String gender ;
	
	
	
	
	public Employee(){
		this.name = "" ;
		this.idNum = 0 ;
		this.department = "" ;
		this.gender =  "" ;
	}


	public Employee (String name, int idNum , String department , String gender) {
		setName (name) ;
		setIdNum(idNum);
		setDepartment(department) ;
		setGender(gender) ;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNum() {		
		return idNum;
	}
	public void setIdNum(int idNum) {
		if (idNum<0) {
			System.out.println("error");
		}else {
			this.idNum = idNum;
		}
		
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) {
			this.gender = gender;
		}else {
			System.out.println("error");
		}
	}

	public String toString() {  //eclipse ---> source ----> choose generate to String
		return "Employee [name=" + name + ", idNum=" + idNum + ", department=" + department + ", gender=" + gender
				+ "]";
	}
	
}
