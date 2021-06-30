package Quiz;

import java.util.Scanner;

public class PointQ6star {
	public static void main(String[] args) {
		// Scanner 로 정수를 입력 받게 해주세요
		// 입력받은 정수의 제곱형태의 정사각형이 찍히도록 중첩 반복문 작성
		// 예시3입력시
		// ***
		// ***
		// ***
		// 과 같이 추력

		
		
		
		
		
		
		////////////생각선 //////////////////////////////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("수를 입력해 주세요 : ");
		int num = sc.nextInt();
		    
		int i;
		int j;
		for (i = 0; i < num; i++) {
			for (j = 0; j < num; j++) {
//                         for문 안에있는 num에 + -..등 사칙연산으로 숫자넣으면 num+1 가로세로 별의 수가 바뀐다.
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
