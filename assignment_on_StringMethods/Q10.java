package assignment_on_StringMethods;

public class Q10 {

	public static void main(String[] args) {
		
		seperator("craig_federighi@apple.com") ;

	}

	public static void seperator(String mail) {
		
		int ch=0 ;
		int at= 0 ;
		int dot = 0 ;
		
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
		
		for (int i=0 ; i<mail.length()-1 ; i++ ) {
			if ( mail.charAt(i) == '.' ) {
				dot = i ;
				break;
			}
		}
		
		String name = mail.substring(0, ch) ;
		String surname = mail.substring(ch+1 , at) ;
		String domain = mail.substring(at , dot) ;
		String topLevelDomain = mail.substring(dot) ;
		
		System.out.println("First name: " + name + 
							",  Last name:" + surname +
							",  Domain:" + domain + 
							",  Top-Level Domain:" + 
							topLevelDomain );
		
	}

}
