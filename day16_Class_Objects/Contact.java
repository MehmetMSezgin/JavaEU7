package day16_Class_Objects;

public class Contact {
		String name ;
		String phoneNumber ;
		String email ;
		
		
		public void call () {
			System.out.println(name + "calling...");
		}
		
		public void sendMessagge () {
			System.out.println("sending message to " + name + " number is " + phoneNumber);
		}
}
