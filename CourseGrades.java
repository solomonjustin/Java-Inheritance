package Lab5;

import Lab4.Essay;
import Lab4.GradedActivity;

public class CourseGrades{
	
	//fields
	private GradedActivity[] grades = new GradedActivity[4];
	
	//methods
	public void setLab(GradedActivity ga){
		grades[0] = new GradedActivity();
		grades[0].set_score(ga.get_score());
	}
	//passed polymorphic arguments
	public void setPassFailExam(PassFailExam pfe) {
		grades[1] = new PassFailExam(pfe);
	}
	
	public void setEssay(Essay e){
		grades[2] = new Essay(e);
	}
	
	public void setFinalExam(FinalExam fe) {
		grades[3] = new FinalExam(fe);
	}

	@Override
	public String toString() {
		String str= "";
		
		for(GradedActivity activity: grades){
			str+="Score: " + activity.get_score() + "\nGrade: " + activity.getGrade() + "\n";
		}
		
		return str;
	}
}
