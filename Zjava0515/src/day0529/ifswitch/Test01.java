package day0529.ifswitch;
import java.util.Scanner;
public class Test01 {
	public static void main(String []args) {
		/*단축키
		 * sc + cntrol 스페이스 하면 import까지 다됨
		 * sysout + cntl 스페이스
		 *  
		 * 조건제어문 ( if : 범위비교 나이가 10보다 크다작다 / switch : 식의 값이 동등 비교 나이가 10과 같다 아니다 이사람의 국적이 한국인지 아닌지 )
		 * 
		 *  if 조건제어문
		 *  
		 *  if (참 or 거짓 - 비교연산자 논리연산자가 참 거짓위치에 놓임)
		 *     참일때 실행할 문장 - 한문장만 가능 중괄호가 없어서
		 *     
		 *     
		 *  if (참 or 거짓) {   중괄호 있을땐 어려개의 문장 가능 여러문장일경우 필수로 {} 필요!!
		 *     참일때 실행할 문장
		 *     참일때 실행할 문장
		 *     참일때 실행할 문장
		 *    }  
		 */
		//어떤 나이를 입력받아 입력받은 나이가 18보다 이상일 경우 "투표 가능한 나이 입니다"로 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		/*
		if (age >=18)    <<<<< ; 안붙임 조심조심!!
			System.out.println("투표가능한 나이입니다.");	
		
		System.out.println("프로그램 종료");
		*/
		if (age >=18) {
			System.out.println("당신의 나이는 " + age );	
			System.out.println("투표가능한 나이입니다.");	
			
		}
		System.out.println("프로그램 종료");
		
	}
	
}
