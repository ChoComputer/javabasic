package day0529.ifswitch;

import java.util.Scanner;

public class Quiz05 {public static void main(String[] args) {
	/*
	 * 롯데월드 놀이동산에놀러왔다 나이에따른 요금을 계산하여 출력한다.
	 * 
	 * 0~5세 무료 6~11세까지 2500원 12이상은 5000원
	 * 
	 * 출력형식
	 * 
	 * 나이 : 4
	 * 요금 : 무료
	 * 
	 * 나이 : 8
	 * 요금 : 2500원
	 */
	

	Scanner sc= new Scanner(System.in);
	System.out.print("나이 :");
	int age = sc.nextInt();
	//내풀이
	/* 이렇게도 상관없지만....
	if ( age >0 && age <= 5 ) {
		System.out.println("요금 : 무료");
		
	}else if ( age >5 && age <=11 ) {
		System.out.println("요금 : 2500원");
		
	} else {System.out.println("요금 : 5000원");
	
	}
	*/
	//답지
	// && 의 앞조건은 앞의  if 에서 이미 처리 됫기때문에 안해도됨
	if (  age <= 5 ) {
		System.out.println("요금 : 무료");
		
	}else if ( age <=11 ) {
		System.out.println("요금 : 2500원");
		
	} else {System.out.println("요금 : 5000원");
	
	}
	
}

}
