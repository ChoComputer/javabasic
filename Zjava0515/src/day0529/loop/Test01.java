package day0529.loop;

public class Test01 {public static void main(String[] args) {
	/*
	 * 
	 * for ( ; ; )     <<- 이건 조건이 없어서 무한으로 반복되는조건임
	 *     실행문장
	 * 
	 * for ( 초기값 ; 참or거짓 ; 조건의 영향을 주는 값의 증감 ) {
	 *     참일 경우 수행
	 *     실행문장
	 *     실행문장
	 *     실행문장
	 *       .
	 *       .
	 *     }
	 *     
	 * for ( 1 ; 2 ; 3) {
	 *     4
	 *      }
	 *      5
	 *      
	 *      반복문이 수행될시 순서
	 *      1 -> 2(참일시) -> 4 -> 3 -> 
	 *           2(참일시) -> 4 -> 3 -> 
	 *           2(참일시) -> 4 -> 3 ->
	 *           2(거짓일시) -> 5
	 */
	for (int i = 0; i<=10; i++) {
		System.out.println(100);	}
	/* 
	 * 반복문 순서
	 * int i =0; -1
	 * 
	 * i<10;     -2 (참)
	 * System.out.println(100); -4
	 * i++        -3  (i=1)
	 * 
	 * i<10;     -2 (참)
	 * System.out.println(100); -4
	 * i++        -3  (i=2)
	 * 
	 */
	
	
	
	
	
	
}

}
