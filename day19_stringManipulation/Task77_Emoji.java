package day19_stringManipulation;

public class Task77_Emoji {

	public static void main(String[] args) {
		
		String emoji = ";)" ;
		char twodots = ':' ;
		char winkdot = ';' ;
		
		if (emoji.length()==2) {
			if (emoji.charAt(0) == twodots) {
				
				switch (emoji) {
					case ":)" :
						System.out.println("smile");
						break ;
					
					case ":(" :
						System.out.println("sad");
						break ;
					
					case ":/" :
						System.out.println("upset");
						break ;
					
					case ":P" :
						System.out.println("playful");
						break ;
						
					default :
						System.out.println("error");
						break ;
				}
			}else if (emoji.charAt(0) == winkdot) {
				switch (emoji) {
					case ";)" :
					System.out.println("wink");
					break ;
				
					case ":0" :
					System.out.println("surprised");
					break ;
					
					default :
					System.out.println("error");
					break ;
			}
			
			
		} else {
			System.out.println("invalid emoji");
			return ; // stop execution !!!!!!!!!!!!!!!!!!!!!!!!! you can use
		}

	}

}
}
