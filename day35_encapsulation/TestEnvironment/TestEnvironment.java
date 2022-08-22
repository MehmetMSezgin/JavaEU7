package day35_encapsulation.TestEnvironment;

public class TestEnvironment {

	Browser browser;
	OS os;
	
	
	public String toString() {
		
		return browser.getBrowserType()+ " | " +os.getOs();
		
	}
	
}
