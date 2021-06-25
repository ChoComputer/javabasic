package Inheritance;

// 상속문법
// 클래스 명칭 오른쪽에 <extends 부모클래스이름> 을 적는다
// 이렇게 상속을 한 클래스는 부모, 자식 클래스가 하나의 객체 내부에
// 공존하는 형태로 메모리에 생성됨
public class Salaryman extends Person {
	
	//연봉을 추가로 가져갑니다
	public int salary;
	
	public void getSalaryInfo() {
		//상속시 부모쪽의 자원을 마음대로 사용할 수 있습니다.
		//getPersonInfo(); // Person class에있는 정보가 여기에도 상속되어 있음 
		                 // sysou~ 해서 "이름은 "+name~ 해도 상속받은 name 정보가 있어서 오류가 안뜸
		                   // Main2에서 이거 주석 없애고 넣고 해서 확인
		System.out.println("연봉은 "+salary+"만원 입니다.\n");
	}

	public void upSalary() {
		salary +=1000;
	}
}
