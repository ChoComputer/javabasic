package Inheritance;

public class Student extends Person {
	// 공통 속성(이름,나이)이 아닌 학생만의 개별적 특성 정의
	
	public String major;
	public int plusScore;
	public int minusScore;
	
	// 학생버전의 자기소개
	public void getStudentInfo() {
		//상속받은 자식은 부모쪽 자원을 가져다 쓸 수가 있다.
		System.out.println("저의 전공은 "+major+"입니다.\n");
	}
	public void getScoreInfo() {
		System.out.println("상점을 받아 "+"현재 상점은"+(plusScore+minusScore)+"입니다.");
	}
	public void minusScoreInfo() {
		System.out.println("벌점을 받아 "+"현재 상점은"+(plusScore+minusScore)+"입니다.");
	}

	public void getScore() {
		plusScore+=1;		
		getScoreInfo();
	}
	public void minusScore() {
		minusScore-=1;
		minusScoreInfo();
	}
}
