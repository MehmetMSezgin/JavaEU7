package day40_accessmodifiers_final_hiding;

public class Mouse extends Rodent {
	
	/* default constructor, java creates for us
	 * public Mouse() {
	 * 		super();
	 * }
	 * 
	 */
	
	protected int tailLength = 8;
	
	public void getMouseDetails() {
		System.out.println("tail:" + tailLength + ",parentTail:" + super.tailLength);
	}
	

}
