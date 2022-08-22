package day36_staticClassMembers;

public class Countable {
	
		static int instanceCount ; //this is static variable and it belongs to all class not only for one object
		// so when I make changes for obj1 , obj2 and obj3 will be affected too
		public Countable () {
			instanceCount ++ ;
	
		}
		
		public int getInstanceCount () {
			return instanceCount ;
		}
}
