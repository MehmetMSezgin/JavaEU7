package day44_OOP_callCenter;

public abstract class MessagingApp {
		
		public String name ;
		
		protected boolean isFree ; //accessible in same package and with inheritance rel it is accessible outside of package
		
		boolean allOSCompatible ;
		
		private static int count ;
		
		public static final String APP_TYPE = "Messenger" ; //it needs to be initiliazed
		
		public MessagingApp() {
			System.out.println("no arg constructor");
		}

		public MessagingApp(String name, boolean isFree, boolean allOSCompatible) {
			super();
			this.name = name;
			this.isFree = isFree;
			this.allOSCompatible = allOSCompatible;
		}
		
		public abstract void sendMessage (String msg);
		
		public void launch() {
			System.out.println("app is launching...");
		}
		
		public static void close() {
			System.out.println("app is closing...");
		}

		
		//setter getter for my private variable
		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			MessagingApp.count = count;
		}
		
		
		
}
