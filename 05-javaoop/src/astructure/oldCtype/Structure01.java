package astructure.oldCtype;

public class Structure01 {
	
	public static void main(String[] args) {
		//데이터들은 힙에 저장되있음 표기된것들은 주소라 생각하면됨int []a={}처럼
		// Scanner 와 마찬가지로 사용자가 커스텀으로 디자인한 자료형은
		// 아래와 같이 new 자료형(); 문법으로 생성
		Person a =new Person();
		//a라는 구조체에 이름, 나이, 폰정보 를 입력함
		a.name="홍길동";
		a.age=20;
		a.pNum="010-0000-0000";
		// 입력된 자료를 하나하나 출력한다.
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.pNum);
		
		System.out.println();
		System.out.println();

		// 또다른 사람을 하나 만들자
		Person b = new Person();
		b.name="길홍동";
		b.age=40;
		b.pNum="101-1111-1111";

		System.out.println(b.name);
		System.out.println(b.age);
		System.out.println(b.pNum);
	}

}
