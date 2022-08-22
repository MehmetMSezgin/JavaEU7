package day13_methods;

public class multiple_arguments {

	public static void main(String[] args) {
		value(5 , 10); // 5 is assigned automatically to i
					   // 10 is assigned to j
	}					//never write data type here inside of calling

	public static void value(int i , double j) {
		System.out.println(i + j);
	}

}
