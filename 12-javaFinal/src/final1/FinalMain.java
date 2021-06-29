package final1;

public class FinalMain {
	public static void main(String[] args) {
		// 상수를 선언 할때에는 자료형 왼쪽에 final 키워드를 붙인다
		final int A=50;
		// 상수 조회시는 아무 문제가 없다
		System.out.println(A);
		// 값을 변경하려하면 오류가 뜸
//		A=500;
		
		// 자바 버전에 따라...
		// 상수 변수는 선언만 하고 초기화를 동시에 하지 않으면 
		// 내부에 값이 없는 상태가 박제되어버린다
		// 따라서 , 반드시 선언과 동시에 초기화ㅣ를 해야함
		int B;
//		System.out.println(B);
		B=50;
		System.out.println(B);
		B=70;
		System.out.println(B);
		
		
	}

}
