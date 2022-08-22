package day36_staticClassMembers;

public class CampusTest {

	public static void main(String[] args) {
		
		Campus c1 = new Campus ("LA") ;
		Campus c2 = new Campus ("TXS") ;
		
		System.out.println(Campus.country);
	}

}
