package day32_arrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class methodArrayList {

	public static void main(String[] args) {
		
		ArrayList<Double> list = getRandomList(3) ;  //1
		System.out.println(list);
		
		ArrayList<String> strNums = new ArrayList<> ();
		strNums.add("12") ;
		strNums.add("13") ;
		strNums.add("11") ;
		ArrayList<Integer> converted = converToIntList(strNums) ;
		System.out.println(converted);
		

	}

	public static ArrayList<Integer> converToIntList(ArrayList<String> strList) {
		
		ArrayList<Integer> l1 = new ArrayList<> () ;
		
		for (String str : strList) {
			
			l1.add(Integer.parseInt(str)) ;
			
		}
		return l1;
	}

	public static ArrayList<Double> getRandomList(int size) {  //1
		
		Random r = new Random() ;
		
		ArrayList <Double> randomNums = new ArrayList<> () ;
		
		for (int i=0 ; i<size ; i++) {
			
			randomNums.add(r.nextDouble()) ;
			
		} 
		
		return randomNums;
	}

}
