package day20_stringManipulation_part2;

public class Task81_timeStamp {

	public static void main(String[] args) {
		
		String date = "10/10/2021 14:59:00" ;
		
		timeStamp("10/10/2021 14:59:00") ;

	}

	public static void timeStamp(String date) {
		
		date =date.replace("/", "").replace(" ", "").replace(":", "") ;
		
		System.out.println(date);
		
	}

}
