package day44_OOP_callCenter;

public class WhatsApp extends MessagingApp implements VoiceCallable,VideoCallable {

	@Override
	public void videoCall() {
		System.out.println("video calling...");
	}

	@Override
	public void call(String contact) {
		System.out.println("calling...");
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("sending message...");
		System.out.println("message: " + msg);
	}
			
		
}
