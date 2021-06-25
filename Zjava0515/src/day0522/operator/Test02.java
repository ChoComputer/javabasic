package day0522.operator;

public class Test02 {
	public static void main(String [] args) {
		/*
		 * 비교 연산자
		 * : 크기 비교 값 비교 할때 사용 / 연산의 결과가 참과 거짓을 가지고옴
		 * : <, >, <= (순서중요<가먼저 공백은x 붙어있어야함), >=, = (이건 대입연산자임 같다 아님), == (같다라는 표시임 좌우가 같다)
		 * : != (같지 않다) 
		 * 이항연산자 : 오퍼레이터 ( ex + - % ..... 좌우 값 사이에 잇는 연산자를 통틀어 명칭)
		 * 오퍼랜드 : 좌우에 들어가는 크기비교할 값 
		 * 비교연산자의 값 :  1 > 2 -> false 거짓의 값이나옴 3 > 1 -> true 참으로 나옴
		 *  
		 */
		System.out.println(1 > 2);     //false
		System.out.println(1 == 2);  // false
		System.out.println(1 <= 2);  // true
		System.out.println(1 < 2);   // true
		System.out.println(1 != 2);  // true
		
		/*
		 *  기본 데이터 타입 (primetive)
		 * -정수(4가지)
		 *  : int(기본값)-21억 4천 어쩌구 까지의 범위, byte(127안쪽까지 범위), short, long(가장큰값을가질수잇음21억4천이상의범위 보통파일은 long으로 표시함) -담을수 있는 수의 한계가 있다.
		 * -실수(2가지)
		 *  : float(숫자뒤에 f or F), double(숫자뒤에 d or D / 기본값) ->  3.14 같은거
		 * -문자(1가지)
		 *  : char(' ' 으로 표현)
		 * -논리(1가지)
		 *  : boolean (true false 딱 두가지만 담는다)
		 * 위 4가지 외엔 다 참조형으로 취급 
		 */
		boolean bool = true;
		//boolean bool = "true"; 이건 안됨 "" 요거 안됨 ""는 문자열 취급!!
		//
		
		boolean b1 = 1 > 3;
		System.out.println(b1);
		
		System.out.println(1>3);
		
		System.out.println(bool);
		
		
	}

}
