package Inheritance;

public class Main2 {
	public static void main(String[] args) {
		
		Salaryman sla1=new Salaryman();
		
		sla1.name="김셀러";
		sla1.age=40;
		sla1.getPersonInfo();
		sla1.upSalary();
		sla1.getSalaryInfo();
		sla1.upSalary();
		sla1.getPersonInfo();
		sla1.getSalaryInfo();
				
		Student s1=new Student();
		
		s1.name="김학생";
		s1.age=18;
		s1.major="문과";
		s1.getPersonInfo();
		s1.getStudentInfo();
		s1.getScore();
		s1.getScore();
		s1.minusScore();
		s1.minusScore();
		s1.minusScore();
	}
	


}
