package day0529.loop;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		/*
		 * 1부터 입력받은 수까지의 합을 구하는 프로그램 작성
		 * 
		 * 수 입력 : -1 0보다 큰 수를 입력하세요 수 입력 : 5 1~5까지의 합은 : 15 입니다.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int num =-1;
		while (true) {
			System.out.print("수 입력 : ");
			num = sc.nextInt();  //지역변수 선언 전체 변수 선언 에 관련된거 그래서 int없앤겨
			if (num > 0) {
				break;
			}
			System.out.println("0보다 큰 수를 입력하세요");
		}
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
			System.out.printf("1부터 %d까지의 합은 %d입니다.", num, sum);
	}
}
