package day35_encapsulation.TestEnvironment;


import java.util.ArrayList;

public class Tests {

	public static void main(String[] args) {

		TestEnvironment testOne = new TestEnvironment();

	//	testOne.browser = "Chrome";

	testOne.browser = new Browser("Chrome"); // I am calling one parameter constructor to assign browserType
	testOne.os = new OS("Windows");

	System.out.println("My test environment for test one is : "+testOne.toString());
	testOne.browser.getBrowserType();	
	testOne.os.getOs();
	
	
	TestEnvironment testTwo = new TestEnvironment();
	testTwo.browser = new Browser();
	testTwo.browser.setBrowserType("Safari");

	testTwo.os = new OS();
	testTwo.os.setOs("MacOs");

	System.out.println("My test environment for test two is : "+testTwo.toString());



	ArrayList<TestEnvironment> tests = new ArrayList<>();



	}
}