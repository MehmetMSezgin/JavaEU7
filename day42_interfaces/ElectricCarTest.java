package day42_interfaces;

public class ElectricCarTest {

	public static void main(String[] args) {
		
		
		//ElectricCar ec = new ElectricCar();  !!!ERROR because for abstract class, object can not be created
		
		Tesla modelS = new Tesla("model S", 45000, "grey");
		modelS.charge();
		modelS.start();
		modelS.drive();
		modelS.stop();
		System.out.println(modelS.toString());
		
		
		System.out.println("****************************");
		
		Ford fusion = new Ford("fusion", 35000, "blue",2021 );
		fusion.charge();
		fusion.start();
		fusion.drive();
		fusion.stop();
		System.out.println(fusion.toString());
		
		System.out.println("****************************");
		
		TeslaTruck tr = new TeslaTruck("cyber", 100000, "white", 2019);
		tr.charge();
		tr.load("bio");
		tr.start();
		tr.stop();
		System.out.println(tr.toString());
		
	}

}
