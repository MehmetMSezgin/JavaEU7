package day42_interfaces;

public interface Electric {
		
	public static final boolean has_batteries= true ;
	
	boolean has_batteries2 = false ; //even if I dont write this field is final and static
	
	public abstract void charge();
		
	void charge2() ; //even if you dont write abstract it is public abstract
							//this rule for interfaces
		
	
	public default void methodA () {
		//default method just can be used in interfaces
	}
	
	public static void methodB() {
		//
	}
	
	
}
