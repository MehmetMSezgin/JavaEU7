package day41_abstraction;

public abstract class Dog extends Animal {
	
		public void eat () {
			System.out.println("eating");
		}

		@Override
		public  void sleep() {
			
			System.out.println("sleeping");
		}

		
		
}
