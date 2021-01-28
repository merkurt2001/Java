package day37_inheritance;

public class GradeActivity {
	
	private double score;
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public char getGrade() {
		
		char letterGrade;
		
		if(score>=90) {
			letterGrade = 'A';
		}else if(score>=80) {
			letterGrade = 'B';
		}else if(score>=70) {
			letterGrade = 'C';
		}else if(score>=60) {
			letterGrade = 'D';
		}else {
			letterGrade = 'F';
		}
		
		return letterGrade;
	}

}
