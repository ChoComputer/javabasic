package Inheritance;

public class Main1 {
	public static void main(String[] args) {
		// Student 가 Person 을 상속했기 때문에
		// Student 는 Person 의 자원을 사용할 수가 있다.
		Student s1 = new Student();
		s1.name="조철수";
		s1.age = 15;
		s1.major ="이과";
		
		s1.getPersonInfo();
		s1.getStudentInfo();
		s1.getScore();
		s1.minusScore();
	}


}
