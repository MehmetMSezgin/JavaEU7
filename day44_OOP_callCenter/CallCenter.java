package day44_OOP_callCenter;

public class CallCenter {

	public static void main(String[] args) {
		
		WhatsApp whatsapp = new WhatsApp();
		
		whatsapp.launch();
		whatsapp.allOSCompatible = true ;
		whatsapp.isFree = true ;
		whatsapp.name = "my phone" ;
		whatsapp.call("mom");
		whatsapp.sendMessage("hello");
		whatsapp.videoCall();
		whatsapp.accept();
		whatsapp.setCount(3);
		System.out.println(whatsapp.getCount());
		
		
		VoiceCallable.decline(); //static method directly you can call it
		
		//polymorphic way --->
		VoiceCallable vc = new WhatsApp();
		//my reference type VoiceCallable(parent class) decides to run whic methods are usable
		//in order to reach launch() method I need casting
		( (MessagingApp) vc ).launch();
		
		((MessagingApp) vc).allOSCompatible = false ; //casting variable
		
		vc.call("Muk");
		
		((VideoCallable) vc).videoCall(); 
		
		
		
		
		
		
	}

}
