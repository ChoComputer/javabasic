package day0522.operator;

public class Test01 {
	public static void main(String []args) {
		
		  //System.out.println("홍길동"+100);
		 
		/*
		 * 산술연산자
		 * : +, -, *(곱하기,'에스타리프'라 부름), /(몫), %(나누고 남은 나머지값) 
		 * int(정수,계산가능), string(더하기만됨 문자에 그냥 붙이는 느낌), char(계산가능, 문자에 해당하는 숫자코드로 바꿔서 관리해서)
		 * "12"+"2" = "122"
		 * ctrl + 화살표방향 : 단어 단위로 움직여짐 커서가
		 */
		
		  System.out.println(100+200);
		  System.out.println(100*200);
		  System.out.println(100-200);
		  System.out.println(100/200);     
		  // 앞뒤 타입이 int면 값이 int로 계산 실수(소수점수)는 float, double(기본타입으로 설정되있음) 이 있음
		  // 1.5234 : 별도 명령이 없으면 double로 취급, 1.1f or 1.1F : 이건 float 으로 취급 대소문자 상관 x 
		  // 1.1d or 1.1D -> double 타입으로 강제 인식시킴 
 		  // 100 - int가됨 (소수점없어서) [산술연산자 + - * % / ] 100 -int임 : 앞뒤 int라 결과값도 int가 됨
		  // int 산술연산자 int -> 결과는 int
		  // int 산술연산자 double -> 결과는 double
		  // double 산술연산자 int -> 결과는 double
		  System.out.println(100/200.0);
		  System.out.println(100/200d);
		  System.out.println(100.0/200.0);
		  System.out.println(100.0/200);
		  System.out.println(100f/200);
		  System.out.println(100%200);
		  System.out.println(75 % 2);   
		  // 75/2 는 37하고 나머지 1 이 남는다
		  System.out.println(100 % 2);   
		  System.out.println(999 % 2);   
		  // 짝수 홀수 배수 파악할때 % 잘씀 2로 나눠서 짝수(0이남음) 홀수(1이남음) 확인 3으로 나눌시엔 012 나옴 3의 배수 확인용
		  // % 잘씀 ex) 달력 
		  
		  
		  
		  
	}

}
