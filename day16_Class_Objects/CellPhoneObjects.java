package day16_Class_Objects;

public class CellPhoneObjects {

	public static void main(String[] args) {
		
		CellPhone phone1 = new CellPhone() ;
		CellPhone phone2 = new CellPhone() ;
		
		phone1.brand = "apple" ;
		phone1.color = "black" ;
		phone1.screenSize = 12.7 ;
		phone1.price = 3000 ;
		
		phone1.phoneInfo();
		phone1.call();
		phone1.message();
		
		System.out.println(phone1.brand);
		//System.out.println(brand); // !!! I can not call property , I can call just object
		
		phone2.color = "white" ;
		phone2.color = "pink"  ;
		System.out.println(phone2.color); //it shows whatever assigned last, so pink
	}

}
