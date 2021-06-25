package Quiz;

public class QMethod {
	public static int mul(int a, int b, int c) {
	// mul 메서드 선언
	// 이 메서드는 임의의 정수 변수 3개를 입력받고
	// 변수 3개를 곱한값을 return해줌
	
		
		return a*b*c;
		// return 은 static "int" mul 이라는걸 기억하자
	}
	
	public static void info() {
	// info 메서드 선언 . void 리던 자료형
	// 이 메서드는 내부에서
	// "안녕하세요"
	// "자바 메서드 학습중입니다."
	// "3줄을 한번의 호출로 적습니다" 라는 문장 출력
		
	System.out.println("안녕하세요");
	System.out.println("자바메서드 학습중");
	System.out.println("3줄을 한번의 호출로 ㄱㄱ\n");
	}
	
	public static void main(String[] args) {
		// mul을 호출해 결과값을 int result에 저장
		// 저장된 값 콘솔창에 출력확인
		
		int result=mul(1,3,2);
		
		System.out.println(result+"\n");
		
		
		// info 메서드 반복문(for문) 3번호출 
		for( int i=0; i<3; i++ ) {
		info();
		}
		
	}

}
