package overloading;

public class Main {

	// 오버로딩은 과적재 라는 뜻으로 같은 이름의 메서드를
	// 한공간에 여럿 정의하는것을 의미함
	// 자바는 메서드를 구분할 때 이름으로도 구분하지만
	// !!파라미터의 갯수, 자료형(종류)으로도 구분한다.
	// 오버로딩은 메서드 이름은 같지만 파라미터의 종류가 달라도
	// 자바에서 호출구분이 되는것을 감안해 허용되는 문법이다.
	// 생성자에서도 적용이됨

	public static void over(int a) {
		System.out.println("출력1 : " + a);
	}
 
	public static void over(int a, int b) {
		System.out.println("출력2 : " + a + "," + b);
	}

	public static void over(String a) {
		System.out.println("출력3 : " + a);
	}

	public static void main(String[] args) {
		over(5);
		over(5, 2);
		over("야후");

		System.out.println("------------------------");
        
		// o, o2,03....이거 없이 o 로 해결하려 했엇음
		// 이해못한거임 이부분 다시 공부
		
		OverTest o = new OverTest();
		OverTest o2 = new OverTest("2번함수");
		OverTest o3 = new OverTest(3);
		OverTest o4 = new OverTest("4번함수", 4);
		
		o.showData();
		o2.showData();
		o3.showData();
		o4.showData();

		

	}

}
