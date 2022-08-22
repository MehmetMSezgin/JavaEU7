package day8_controlFlowStatements;

public class switch_case_statements {

	public static void main(String[] args) {
		
		String weather= "sunny" ; //There is no boolean just statement
									// it might be char or int also
		switch (weather) {
		case "sunny" :
			System.out.println("Go to park");
			System.out.println("Code java");
			break; //break means switch off and go out from switch 
		case "hot" :
			System.out.println("Go to swimming");
			System.out.println("Code java");
			break; // if there is no break Java will perform next syso also
		case "windy" :
			System.out.println("Fly a kite");
			System.out.println("Code java");
			break;
		default:         //default can be anywhere in code block
			System.out.println("Just code java");
			break; 
			
		}

	}

}
