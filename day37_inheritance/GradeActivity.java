package day37_inheritance;

public class GradeActivity {
		
		private double score ; //encapsualated

		public double getScore() {
			return score;
		}

		public void setScore(double score) {
			this.score = score;
		}
		
		public char getGrade () {
			char letterGrade = '0' ;
			
			if (score>=90) {
				letterGrade = 'A' ;
			}else if(score>=70){
				letterGrade = 'C' ;
			}else if (score <=50) {
				letterGrade = 'F' ;
			}
			return letterGrade ;
		} 
}
