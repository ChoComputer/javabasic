package day0529.ifswitch;
import java.util.Scanner;
public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * 당신의 가족 구성원 수를 입력하세요
		 * 입력받은 가족 구성원의 수가 5명 이상일 경우 
		 * "당신은 대가족 입니다."
		 * 
		 * 프로그램 종료 출력 - 조건없이 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 가족 구성원수를 입력하시오 : ");
		int num = sc.nextInt();
		
		if (num >= 5 ) {
			System.out.println("당신의 가족수는 : "+ num);
			System.out.println("당신은 대가족 입니다");
			System.out.printf("당신의 가족수는 %d이니까 당신은 대가족 이군요\n",num);
		}
		System.out.print("프로그램 종료");
		
		
		
		
		
	}
	
	
	

}
