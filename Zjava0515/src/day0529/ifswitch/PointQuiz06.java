package day0529.ifswitch;

import java.util.Scanner;

public class PointQuiz06 {public static void main(String[] args) {
	
	/*
	 * 전자제품 대리점
	 * 
	 * 물건값에 따른 할인을 진행하고 있음
	 * 
	 * 물건값 :10만이하   30만원이하     30만원초과 
	 * 할인율 :3퍼할인    5퍼할인         8퍼할인
	 * 
	 * 출력형식
	 * 
	 * 물건값(만원) : 10
	 * 계산값 : 97000
	 * 
	 */
	Scanner sc = new Scanner(System.in);
	
	System.out.print("물건값(만원) : ");
	int num = sc.nextInt();
	double rate; 
	if ( num <= 10) { rate =0.97;
	} else if (num <=30) { rate =0.95;
	} else { rate=0.92;
	}
	System.out.println("계산값 : "+ (int)(num*10000*rate)+ "원 입니다.");  // 앞의 int를 통해 소수점을 없앨수 있음 
	System.out.printf("계산값 : %d원 입니다.",(int)(num*10000*rate));  //이건 정수값 임 d는!!
	System.out.printf("\n계산값 : %20.2f원 입니다.",num*10000*rate);   // %f는 실수!! 소수점 가능!기본은 소수점 6자리임%.1f 소숫점 1자리 %.3f소수점3자리까지 표현
	                                                            // %20.2f 일경우 출력 숫자의 칸을 20자리 차리하고 소숫점 2까지 표현한다는소리임!
	                                                            //%s는 문자열!! %c는 문자!!
}


	/*
	//  test  이것도 옳음
	if ( num <= 10) {
		System.out.println("계산값 : " + (num-num*0.03) +"만원 입니다." );
	} else if (num <=30) {
		System.out.println("계산값 : " +(num-num*0.05)+"만원 입니다.");
	} else {
		System.out.println("계산값 : "+ (num-num*0.08)+"만원 입니다.");
	}
}
*/
	//답지
}
