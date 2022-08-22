package day44_OOP_callCenter;

public interface VoiceCallable {
		
	boolean CAN_CALL = true; //JVM will see as public static final boolean
	
	public abstract void call(String contact) ;
	
	public static void decline () {
		System.out.println("voice call is declined");
	}
	
	public default void accept() { //this default is not access modifier
		System.out.println("voice call is accepted");
	}
	//static and default is keyword here
		
}
