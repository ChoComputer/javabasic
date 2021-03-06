package date210623.method;

public class MethodBonus02 {

	// void가 아닌 리턴 자료형을 가지는 메서드도
	// return구문 실행시 종료됨
	// void가 아니라면 어떤경우에도 리턴이 무조건 실행되야함
	public static int getInt() {
		System.out.println("인트 발송 전");
		if (3 < 5) {
			return 1;
		}
		System.out.println("인트 발송 후");
		return 0;
	}

	public static void main(String[] args) {
		// getInt(); 가실행되면 8번줄로가서 실행 참 일경우 getInt()= 1 로 대체해지고
		//                              거짓 일경우 getInt()= 0 이된다
		
		// 리턴된 숫자를 출력하는 첫번째 방법
		int a = getInt();
		System.out.println(a);

		// 두번째 방법
		System.out.println(getInt());

	}

}
