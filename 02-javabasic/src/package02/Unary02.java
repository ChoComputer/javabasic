package package02;

public class Unary02 {
	public static void main(String[] args) {
		System.out.println(+50); // 출력은 50으로
		System.out.println(-22); // 출력은 -22으로
		// 단항 연산자로 쓰인+, -는 양수 음수 표시에 사용됨
		System.out.println(~1);
		// 비트 반전 연산자는 비트단위에서 0->1로, 1->0으로
		System.out.println(!true);
		// 논리 반전 연산자 !는 true <-> false 상호 변환
		System.out.println((float) 21);
		// 자료형을 바꿔주는 cast 연산자 ((자료형)자료)
	}

}
