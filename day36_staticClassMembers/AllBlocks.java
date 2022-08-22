package day36_staticClassMembers;

public class AllBlocks {
	
		public AllBlocks (int x) {
			System.out.println("one argument constructor");
		}
		
		public AllBlocks () {
			System.out.println("no argument cons");
		}
		////////////////////////////////////////////////////////////////////////////////
		static {
			System.out.println("first static init"); //it runs only one time 
		}											// even if you create another object
		///////////////////////////////////////////////////////////////////////////////////
		{
			System.out.println("first instance init");
		}
		
		{
			System.out.println("second instance init");
		}
		
		{
			System.out.println("second static init");
		}
}
