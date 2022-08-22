package day20_stringManipulation_part2;

public class Task80_existing {

	public static void main(String[] args) {
		checkedString("your confirmation number is 54321", "54321");
		

	}
	
	public static void checkedString (String str1 , String str2) {
		
		if (str1.contains(str2)) {
			System.out.println(str1.indexOf("54321"));
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
	}

}
