package day0529.loop;

public class Test04 {public static void main(String[] args) {
	/*        1-2-4-3
	 * for ( 1 ;2 참or거짓 ;3  ) {
	 *     4 참일경우 실행
	 * }  특정한 범위가 있을때 for loop가 편함 
	 * 
	 * 
	 * 1
	 * while( 2 참or거짓 ){
	 *    
	 *    4 참일경우 실행
	 *    
	 *    3
	 * }  특정한 범위가 없을때 는 while loop가 편하다  
	 * 
	 */
	for (int i = 1; i<11; i++) {
		System.out.println("for : " +i);
	}
	
	int i = 1;
	while (i<11) {
		System.out.println("while : "+ i);
		i++;
	}
	
	
}

}
