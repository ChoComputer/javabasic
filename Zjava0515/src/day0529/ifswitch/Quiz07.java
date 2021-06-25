package day0529.ifswitch;

import java.util.Scanner;

public class Quiz07 {public static void main(String[] args) {
	/*
	 * 숫자를 입력받아
	 * 입력받은 숫자에 해당하는 계절을 출력하고자 한다.
	 * 
	 * 12, 1, 2입력 받을시   -> 겨울 로 출력
	 * 3,4,5, ->봄
	 * 6,7,8, -> 여름
	 * 9,10,11 -> 가을
	 * 
	 */
	
	Scanner sc = new Scanner(System.in);
	System.out.print("입력할 달 : ");
	int mon = sc.nextInt();
	switch(mon) {
	case 12:
		System.out.println("겨울입니다");
		break;
	case 1:
		System.out.println("겨울입니다");
		break;
	case 2:		
		System.out.println("겨울입니다");
		break;
	case 3:		
	case 4:		
	case 5:		
		System.out.println("봄입니다");
		break;
	case 6:	case 7:	case 8:		
		System.out.println("여름입니다");
		break;
	case 9:		
	case 10:		
	case 11:		
		System.out.println("가을입니다");
		break;
	default:
			System.out.println("1년은 12달입니다 당신은 외계인이십니까?");
		
		
	
	}
	
}

}
