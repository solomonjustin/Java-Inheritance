package Lab5;

import Lab4.GradedActivity;

public class FinalExam extends GradedActivity{
	
	private int _numQuestions;
	private double _pointsEach;
	private int _numMissed;
	
	public FinalExam(int _numQuestions, int _numMissed) {
		double numericScore;
		
		this._numQuestions = _numQuestions;
		this._numMissed = _numMissed;
		
		_pointsEach = 100.0 / _numQuestions;
		numericScore = 100.0 - (_numMissed * _pointsEach);
		
		set_score(numericScore);
	}
	
	public FinalExam(FinalExam fe) {
		this(fe._numQuestions, fe._numMissed);
	}

	public double get_pointsEach() {
		return _pointsEach;
	}

	public int get_numMissed() {
		return _numMissed;
	}
	
	

}
