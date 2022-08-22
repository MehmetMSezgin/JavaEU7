package replit;



public class Zombie_attack_arrays {

	public static void main(String[] args) {
		
		 int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
		    
		 for (int i=0 ; ((inhabitants[0]+inhabitants[1]+inhabitants[2]+inhabitants[3]+inhabitants[4]+inhabitants[5]+inhabitants[6]+inhabitants[7])>0);i++) {
			 if (inhabitants[i]==0) {
				 if (i==7) {
					 inhabitants[i-1] = inhabitants[i-1]/2 ;
				 }else if (i==0) {
					 inhabitants[i+1] = inhabitants[i+1]/2 ;

				 }else {
					 inhabitants[i-1] = inhabitants[i-1]/2 ;
					 inhabitants[i+1] = inhabitants[i+1]/2 ;
				 }
				 	System.out.println("Day " + i +  " [" + inhabitants[0] + "," + inhabitants[1] + "," + inhabitants[2] +"," +inhabitants[3] +"," +inhabitants[4] +"," +inhabitants[5] +"," +inhabitants[6] +"," + inhabitants[7]);
			 }else {
				 
				 continue;
			 }
		 }
	}

}
