package Lab5;

import Lab4.GradedActivity;

public class PassFailActivity extends GradedActivity{
	
	private double _minScore;

	public PassFailActivity(double _minScore) {
		this._minScore = _minScore;
	}

	@Override
	public char getGrade() {
		char letterGrade;
		
		if(super.get_score() >= _minScore){
			letterGrade = 'P';
		}
		else{
			letterGrade = 'F';
		}
		
		return letterGrade;
	}

	public double get_minScore() {
		return _minScore;
	}
	
	
	
	
	
	

}
