package day0529.loop;

public class Quiz08 {public static void main(String[] args) {
	/*
	 * 1부터 10 사이의 숫자 출력
	 * 3의 배수는 글대로 출력
	 * 3의 배수가 아닌수는 2배수를 출력\
	 * 
	 * 출력형식 >
	 * 2
	 * 4
	 * 3
	 * 8
	 * 10
	 * 6
	 * ..
	 * ..
	 * 20
	 */
	for(int cnt=1;cnt<11;cnt++) {
	/*	if (cnt%3==0) {
			System.out.println(cnt);
		}System.out.println(cnt*2);
	*/
		
		//삼항연산자로 정리
	System.out.printf("%d\n",cnt%3==0?cnt:cnt*2);

	
	
	}
}

}
