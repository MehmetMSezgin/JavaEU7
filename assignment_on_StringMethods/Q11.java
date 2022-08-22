package assignment_on_StringMethods;

public class Q11 {

	public static void main(String[] args) {
		
		String mail = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}" ;
		
		int nameStart = 0 ;
		int nameEnd = 0 ;
		int numberStart = 0 ;
		int numberEnd = 0 ;
		int messageStart = 0 ;
		
		
		
		
		for (int i=0 ; i<mail.length()-1 ; i++ ) { //1
			if ( mail.charAt(i) == '<' ) {
				nameStart = i ;
				break;
			}
		}
		
		for (int i=0 ; i<mail.length()-1 ; i++ ) { //2
			if ( mail.charAt(i) == '>' ) {
				nameEnd = i ;
				break;
			}
		}
		
		for (int i=0 ; i<mail.length()-1 ; i++ ) { //3
			if ( mail.charAt(i) == '[' ) {
				numberStart = i ;
				break;
			}
		}
		
		for (int i=0 ; i<mail.length()-1 ; i++ ) { //4
			if ( mail.charAt(i) == ']' ) {
				numberEnd = i ;
				break;
			}
		}
		
		for (int i=0 ; i<mail.length()-1 ; i++ ) { //5
			if ( mail.charAt(i) == '{' ) {
				messageStart = i ;
				break;
			}
		}
		
		

		
		System.out.println("Sender: " + mail.substring( (nameStart+1), nameEnd ) );
		System.out.println("Phone Number: " + mail.substring( (numberStart+1), numberEnd ) );
		System.out.println("Message body: " + mail.substring( (messageStart+1), mail.length()-1) ); 

		
		
		
		
		
		
		
		
		
		
	}

}
