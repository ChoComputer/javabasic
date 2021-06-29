package exception2;

import java.util.Scanner;

public class ifElse {
	public static void main(String[] args) {
		// int a,b 에 스캐너로 각각 정수 입력을 받아주세요
		// a/b 의 결과를 콘솔창에 띄워주시되
		// if~else문을 이용해 0으로 나누는 에러 발생이 일어나기 전에
		// 나누는 수는 0을 입력할수 없습니다.
		// 라고 경고만 띄우도록 처리하기

		Scanner sc = new Scanner(System.in);
		System.out.print("a입력 : ");
		int a = sc.nextInt();
		System.out.print("b입력 : ");
		int b = sc.nextInt();
		
		sc.close();

		if (b == 0) {
			System.out.println("나누는 수는 0을 입력할수 없습니다.");
		} else {
			System.out.println(a / b);
		}

	}

}
