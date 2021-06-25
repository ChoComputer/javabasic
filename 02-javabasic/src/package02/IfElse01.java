package package02;

public class IfElse01 {
	public static void main(String[] args) {
		// if~else 구문은 참일때 실행할 구문과 거짓일때 실행할 구문을 함께 작성합니다.
		// if~else 구문은 한 구문으로 간주되어 연산횟수를 절약함
		// else문은 if문 없이 단독으로 쓸 수 없다.
		// else문의 경우 조건문을 작성할 필요가 없다.

		int a = 14;

		if (a == 15) {
			System.out.println("15입니다.");
		} else {
			System.out.println("15가아닙니다.");
		}
             // {} 없어도 실행 가능 {} 없을땐 붙어있는 한줄 자동 실행임 but 쓰지말자
	}

}
