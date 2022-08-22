package assignment_on_StringMethods;

public class Q9 {

	public static void main(String[] args) {
		
		emailMaker("barackObama@gmail.com") ;
		emailMaker("mike_tyson@gmail.com") ;
		emailMaker("craig_federighi@apple.com") ;

	}

	public static void emailMaker(String mail) {
		int ch=0 ;
		int at= 0 ;
		if ( !(mail.contains("_")) ) {
			 System.out.println(mail);
		}else {
			for (int i=0 ; i<mail.length()-1 ; i++ ) {
				if ( mail.charAt(i) == '_' ) {
					ch = i ;
					break;
				}
			}
			
			for (int i=0 ; i<mail.length()-1 ; i++ ) {
				if ( mail.charAt(i) == '@' ) {
					at = i ;
					break;
				}
			}
			
			String name = mail.substring(0, ch) ;
			String surname = mail.substring(ch+1 , at) ;
			String mailType = mail.substring(at) ;
			
			System.out.println( surname + "_" + name + mailType );
			
		}
		
		
		
		
		
		
		
	}

}
