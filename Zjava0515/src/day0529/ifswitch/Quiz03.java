package day0529.ifswitch;
import java.util.Scanner;
public class Quiz03 {
	public static void main(String[] args) {
		
		/*
		 * 숫자 입력받습니다.
		 * 입력받은 숫자가 짝수 인지 홀수인지 출력
		 * 출력형식
		 * 
		 * 숫자 : 10
		 * 짝수
		 * 
		 * 숫자 :9
		 * 홀수 
		 * 
		 */
		//내풀이
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("숫자 :");
		int num = sc.nextInt();
		if (num/2 = 1) { == 같다표시는 ==임 ==을생각못함;;;
			System.out.println("짝수");
		}else {			
			System.out.println("홀수");
		}
*/
		//답지
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 :");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("짝수");
		}else {			
			System.out.println("홀수");
		}
	}

}
