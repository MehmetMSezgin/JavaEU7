package assignment_on_StringMethods;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter screen size");
		double screenSize = sc.nextDouble();
		
		System.out.println("please enter CPU type");
		String cpu = sc.next();
		
		System.out.println("please enter RAM size");
		double RAMsize = sc.nextDouble() ;
		
		System.out.println("please enter storage type");
		String storageType = sc.next();
		
		System.out.println("please enter memory size");
		int memory = sc.nextInt();
		
		System.out.println("please enter screen resolution");
		String resolution = sc.next();
		
		double total ;
		total = screenSize(screenSize) + CPU(cpu) + RAM(RAMsize) + storagePrice(storageType, memory) + screenResolution(resolution);
		System.out.println("Laptop price is: " + total + " dolar" );
	}
	
	public static double screenSize (double screenSize) {
		
		if (screenSize==13.3) {
			return 200 ;
		}else if (screenSize==15) {
			return 300 ;
		}else if (screenSize == 17) {
			return 400 ;
		}
		return 0 ;
	}
	
	public static int CPU (String CPUtype) {
		String price = null ;
		if (CPUtype.equalsIgnoreCase("i3")) {
			 price ="150" ;
		}else if (CPUtype.equalsIgnoreCase("i5")) {
			 price ="250" ;
		}else if (CPUtype.equalsIgnoreCase("i7")) {
			 price="350" ;
		}
		int priceInt ;
		priceInt = Integer.parseInt(price);
		return priceInt ;
	}
	
	public static double RAM (double RAMsize) {
		double RAMprice ;
		RAMprice = (RAMsize/4) * 50 ;
		return RAMprice ;
	}
	
	public static int storagePrice (String storageType , int memory) {
		int price = 0 ;
		if (storageType.equalsIgnoreCase("ssd")) {
			price = (memory/500) * 50 ;
		}else if (storageType.equalsIgnoreCase("hdd")) {
			price = (memory/500) * 100 ;
		}
		return price ;
	}
	
	public static int screenResolution (String resolution) {
		String price = "" ;
		if (resolution.equalsIgnoreCase("fullhd")) {
			price = "100" ;
		}else if (resolution.equalsIgnoreCase("4k")) {
			price = "200" ;
		}
		int priceInt ;
		priceInt = Integer.parseInt(price) ;
		return priceInt ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
