package Package01;

public class Identifier {
	public static void main(String[] args) {
		// 변수는 일종의 자료를 담을 수 있는 박스입니다.
		// 자료를 담기전에 어떤 자료가 담길지 미리 약속을 해야함
		int a = 5; // a는 변수명 a 라는 박스가 생성되고 그a박스에 5가 들어가있는것임
		int A = 10; // 정수숫자 10을 A박스에 담겠다 '변수 A를선언하고 10으로 초기화 했다'고 표현
		int number = 15; // 정수 숫자 15를 number 박스에 담겠다
		System.out.println(a); // a박스 내부 값 콘솔에 출력
		System.out.println(A); // A박스 내부 값 콘솔에 출력
		System.out.println(number); // number박스 내부 값 콘솔에 출력
		// System.out.println(B); B는 선언 된적이 없어서 오류가 난다 실행불가능
	}

}
