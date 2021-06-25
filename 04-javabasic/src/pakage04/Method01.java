package pakage04;

public class Method01 {

	public static void add(int a) {
		
		// void는 결과물 없음을 의미
		// add라는 이름을 main 매서드 내부 영역에서 호출해야 실행될 코드.
		// int a 자료를 호출시에 제공해야 내부 문장이 실행을 할수 있다.
		// int a 위치가 int로 정수란걸 알게됨
		
		System.out.println(a + 1);
	}

	public static void main(String[] args) {
		
		// method는 자주 사용할 코드를 특정한 이름으로 붙여둔것 입니다.
		// method 내부에는 불완전한 코드가 들어올 수 있습니다.
		// method는 이 불완전한 코드를 완성시킬 자료를 요청할 수 있습니다.
		// 실행 결과물이 있다면 return문을 이용하여 약속된 실행 결과물을 호출 위치로 보냅니다.
		// method는 main 외부에 작성합니다.
		
		add(300);
		// 위의 void add 가 실행됨a가 3이라 위의 a+1이 실행되어 출력 int a = 300; 이라는 것임 but add에 포함된거라 main에는 a값이 없다! 염두염두
//		System.out.println(a); 이거 해봣자 main에 a의 값이 없어서 소용 없다
		
	}

}

// 메서드 선언 방법
//
//< 반환 유형 > < 메서드 식별자 이름> (매개 변수) {
//	기능 상세;
//	
//	반환 유형(return type) - void 가 아닌경우 return 사용 return사용시 int 사용
//	
//	매개 변수(parameter)
