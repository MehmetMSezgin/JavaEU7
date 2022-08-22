package day37_inheritance;

public class Student extends Person { //student is child class , person is parent class
	
		
		int studentID ;
		String termCLass ;
		
		public void code (String lang) {
			System.out.println(name + " is coding" + lang); //I used "name" from person class
		}
		
}
