package date210623.method;

public class MethodBonus01 {

	// return 구문은 실행 즉시 메서드를 종료시킴
	// 단, 자바에서는 return 아래쪽에 코드를 적는것만으로도
	// 컴파일러가 문법오류로간주
	// 리턴 오른쪽에 배달할 코드 가 들어감 ,없어도되긴함
	public static void returnTest() {
		//void 대신 int들어가면 숫자만 배달 Str~이면 문자열만 배달 void는 배달할게 없다는뜻음
		System.out.println("리턴구문 위쪽");

		if (2 > 0) {
			// 단, 조건문 내부의 return문 아래에는
			// 추가 코드를 작성할 수 있다.
			// 이경우 break문처럼 즉시 메서드 종료
			return;
//		System.out.println("리턴구문 아래쪽"); //오류뜸
		}

		System.out.println("리턴구문 아래쪽"); // 이건 가능

	}

	public static void main(String[] args) {
		returnTest();

	}

}
