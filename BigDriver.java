package Lab5;

import Lab4.Essay;
import Lab4.GradedActivity;

public class BigDriver {

	public static void main(String[] args) {
		
		GradedActivity lab = new GradedActivity();
		lab.set_score(90);
		
		PassFailExam passFailExam = new PassFailExam(100, 5, 70);
		
		Essay essay = new Essay(20, 30, 30, 20);
		
		FinalExam finalExam = new FinalExam(100, 10);
		
		CourseGrades grades = new CourseGrades();
		grades.setLab(lab);
		grades.setPassFailExam(passFailExam);
		grades.setEssay(essay);
		grades.setFinalExam(finalExam);
		
		System.out.println(grades);
		

	}
	//interface method
	public interface DisplayGrades{
		void displayGrades();
	}

}
