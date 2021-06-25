package day0529.ifswitch;
import java.util.Scanner;
public class Quiz04 {
	public static void main(String[] args) {
		/*
		 * 숫자하나 입력 입력받은 숫자의 절대값 출력
		 * 
		 * 숫자 : 7
		 * 절대값 : 7
		 * 
		 * 숫자 : -7
		 * 절대값 : 7
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num =sc.nextInt();
		if ( num >= 0 ) {
			System.out.print("절대값 : "+ num);
		} else {
			System.out.print("절대값 : "+ ( num* -1));
		}
	}

}
