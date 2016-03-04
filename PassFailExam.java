package Lab5;

public class PassFailExam extends PassFailActivity{
	
	private int _numQuestions;
	private double _pointsEach;
	private int _numMissed;
	
	public PassFailExam(int _numQuestions, int _numMissed, double minPassing) {
		
		super(minPassing);
		
		double numericScore;
		
		this._numQuestions = _numQuestions;
		this._numMissed = _numMissed;
		
		_pointsEach = 100.0 / _numQuestions;
		numericScore = 100.0 - (_numMissed * _pointsEach);
		
		set_score(numericScore);
	}
	public PassFailExam(PassFailExam obj){
		this(obj._numQuestions, obj._numMissed, obj.get_minScore());
	}

	public double get_pointsEach() {
		return _pointsEach;
	}

	public int get_numMissed() {
		return _numMissed;
	}

	public int get_numQuestions() {
		return _numQuestions;
	}

}
