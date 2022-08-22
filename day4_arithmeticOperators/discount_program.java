package day4_arithmeticOperators;

public class discount_program {

	public static void main(String[] args) {
		double regularPrice=45.5;
		double discount=0.2; //don't write %20 never!!!!!!!
		double salesPrice;
		double discountAmount;
		double discountType2=0.4;
		double discountAmount2;
		double salesPrice2;
		
		discountAmount= regularPrice * discount ;
		salesPrice= regularPrice - discountAmount ;
		discountAmount2= regularPrice * discountType2;
		salesPrice2= regularPrice - discountAmount2 ;

		System.out.println("sale price is " + salesPrice );
		System.out.println("end of season price is " + salesPrice2);

	}

}
