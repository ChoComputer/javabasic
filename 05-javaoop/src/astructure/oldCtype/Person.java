package astructure.oldCtype;

public class Person {
	// 미리 main메소드가 없는   사전 묶음파일을 만들어둠  
	//이거를 만들어둬야 다른 밑의 class에서 활용가능
	// 자바에서 표현할 사람의 필수 정보를 변수로 선언
	// 이름 , 나이 , 폰번호를 필수 정보로 지정
	// public은 지금 단계에서 무조건 붙여준다!!! (main이 없는공간이니까)
	public String name;
	public int age;
	public String pNum; //int로 하면 0 이 안나옴010 -> 1 만보임
	                    //07 08 이것들은 팔진수로 취급해서 08은 안나옴
	public String address;
	// public~ 이거 이클래스 가 없으면 밑의 class에있는 것들이 적용안됨 여기 이 class에 추가해놔야
	// 가이드가 됨

	
	//!!!!! 저장을 안하면 적용이 안된다!!! 하고 저장! 습관적 저장!!!!!
}
