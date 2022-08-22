package day36_staticClassMembers;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student ("mike" , 30 , 1000 , "cybertek") ;
		Student s2 = new Student ("turner" , 23 , 3000 , "cybertek") ;
		Student s3 = new Student ("muk" , 34 , 2000 , "cybertek") ;

		
		System.out.println(s1.toString());
	}

}
