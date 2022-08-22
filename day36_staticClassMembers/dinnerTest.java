package day36_staticClassMembers;

public class dinnerTest {

	public static void main(String[] args) {
		
		dinner mom = new dinner () ;
		dinner kid = new dinner () ;
		dinner dad = new dinner () ;
		
		System.out.println("total slices" + dinner.pizzaSlice);
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		
		System.out.println(dinner.pizzaSlice);
		//dad.pizzaSlice  = mom.pizzaSlice = kid.pizzaSlice = dinner.pizzaSlice ;
		kid.takeASlice(3);
		dad.takeASlice(2);
		
		System.out.println(dinner.pizzaSlice);
	}

}
