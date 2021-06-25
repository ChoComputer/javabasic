package package02;

public class Birnary01 {
	public static void main(String[] args) {
//		이항 연산자는 양 변에 피연산자를 항목을 하나씩 취하는 연산자 입니다.
//		산술연산자는 우리가 잘 알고있는 사칙연산 등을 활용하기 위한 연산자 이며
//		연산 우선순위도 그대로 계승
//		단, %연산자의 우선순위는 *, / 와 동일함
//		+ - *
		System.out.println(3 + 5);
		System.out.println(17 - 21);
		System.out.println(2 * 3);
		System.out.println(7 / 2);
		// /는 왼쪽 수를 오른 쪽 수로 나눠 몫을 구함
		// (정수 / 정수 = 정수)
		//3.5나오게 하려면 숫자뒤에 f or .0 붙이기 한숫자에 붙여도 되고 다 붙여도 됨
		System.out.println(10 % 4);
		//%는 정수 최대 몫을 구하고 남은 값을 출력함
		System.out.println(10 + 6 / 4 );
		System.out.println((10 + 6) / 4 );
		//연산 우선 순위는 그대로 존재함

	}

}
