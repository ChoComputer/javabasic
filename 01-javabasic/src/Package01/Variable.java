package Package01;

public class Variable {
	public static void main(String[] args) {
		// 변수는 기본적으로
		/*
		 * 자료형 변수명 ;(선언) 
		 * 변수명 = 값 ; (초기화) 
		 * 방식과 
		 * 자료형 변수명 =값;(선언 및 초기화) ex) int a= 12;
		 * 두가지 방식으로 값을 대입할수 있다
		 */
		int a; // 나는 a박스에 정수를 넣을 예정이다 (아직 안넣음) int 정수 란 의미 -정수 a 를 선언
		a = 5; // 위의 박스에 5를 집어 넣겠다 -정수a를 5로 초기화
		int b, c; // b, c 박스에 정수를 넣을 여정이다. -정수b,c를 선언
		b = 10; // b에 10을 담겠다
		c = 15; // c박스에 15를 담겠다.
		System.out.println(a); // a 박스 내부값 출력
		System.out.println(b); // b 박스 내부값 출력
		System.out.println(c); // c 박스 내부값 출력
		a = 20; // a 변수값을 20으로 교체 (기존의 5는 삭제된다)
		System.out.println(a); // 변경된 값으로 출력이됨
	}
}
