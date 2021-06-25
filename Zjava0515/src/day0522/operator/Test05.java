
package day0522.operator;

public class Test05 {
	public static void main(String []args) {
		/*
		 * 논리 연산자
		 *     &&    ( 둘다 참일 경우만 참 )  -앞의것이 거짓일경우 앞의 비교연산자만 확인하면 뒤는 확인 할 필요없다. 앞의 비교연산자만 수행하고 뒤의것은 수행하지않음
		 *   T    T  -> T
		 *   T    F  -> F
		 *   F    T  -> F
		 *   F    F  -> F
		 *   
		 *   
		 *     ||    ( 둘중에 하나가 참일 경우 참 )   shift + \  //앞의 조건이 틀릴지라도 뒤에꺼까지 다 계산해줌
		 *   T    T  -> T
		 *   T    F  -> T
		 *   F    T  -> T
		 *   F    F  -> F
		 *   
		 *  ! 부정개념임
		 *   !T -> F
		 *   !F -> T
		 */
		
		int num = 10;
		System.out.println(num<5 && num++ % 2 == 0);
		System.out.println(num);
		
		System.out.println(num<20 && num++ % 2 == 0);
		System.out.println(num);
		
		System.out.println((num ==20));
		System.out.println(!(num ==20));
		
	}
	

}
