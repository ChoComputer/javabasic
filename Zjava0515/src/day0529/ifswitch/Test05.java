package day0529.ifswitch;

import java.util.Scanner;

public class Test05 {public static void main(String[] args) {
	/*
	 * switch
	 * 
	 * :동등 비교시 사용
	 * 
	 * ;-> 세미콜론
	 * :-> 콜론
	 * 
	 * 주의사항 : switch  블럭은 break를 만나면 switch 블럭을 빠져나간다.
	 *        break를 안만나면 밑에꺼를 다 실행함 switch안에 있는 블럭들을
	 * 
	 * switch(수식) {
	 *       case 값1:     
	 *          처리할 문장    ->> 수식과 값 1이 같은 값일 경우 실행됨   수식과 값1이 같은지를 따짐
	 *          break; 
	 *       case 값2:     
	 *          처리할 문장    ->> 수식과 값 2이 같은 값일 경우 실행됨   수식과 값2이 같은지를 따짐
	 *       case 값3:     
	 *          처리할 문장    ->> 수식과 값 3이 같은 값일 경우 실행됨   수식과 값3이 같은지를 따짐
	 *          
	 *       default: 
	 *            처리문장    ->> if 문의 else와 같다   
	 * }
	 * 
	 *
	 */
	
	
	Scanner sc =new Scanner(System.in);
	
	int v = 1;   //숫자 바꿔서 해보면 감이 온다야
	switch (v) {
	case 1:
		System.out.println(v+"입니다");
		System.out.println(v+"입니까");
		break;
	case 2:
		System.out.println(v*2 +"입니다");
	case 3:
		System.out.println(v*3+"입니다");
	default:
System.out.println(v*v+"입니다");	  // break가 없어서 이것도 실행된거임 디폴트가  보통은 케이스 마다 break를 달아줌


}
}

}
