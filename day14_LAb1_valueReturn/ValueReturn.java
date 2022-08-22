package day14_LAb1_valueReturn;

public class ValueReturn {

	public static void main(String[] args) {
		// sum(2,3); 4. here is holding the result, I need to reveal
		
		System.out.println(sum(2,3)); // 5. first way I will use syso
		/////////        or
		int result= sum(2,3) ; //definingResultAsGlobal
		
		// 6. you should declare a new value by using "calling"
		// but actually this new value equals to "result"

	}

	public static int sum(int i, int j) { //2. I change "void" to "int" . Because result is int data type
		
		int result;     // local value
		result= i + j ; // 1. I want to make this result value global
		
		return result ; // 3. I use "return" to change from local to global
	}	// return is end of method you can not write anything else

}
