package package02;

import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		// 주어진 변수 a에 스캐너로 정수값을 입력받게 만들기
		// 입력받은 정수가 0이상이면 "0보다 크거나 같습니다."를 콘솔에
		// 그렇지 않다면 "0보다 작습니다"를 콘솔에 출력하는 코드를
		// if문 2개를 이용하여 구현하기

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int a = sc.nextInt();
		sc.close();

		if (a >= 0) {
			System.out.println("입력된 수는 " + a + "이고 0보다 크거나 같습니다");
		}
		if (a < 0) {
			System.out.println("입력된 수는 " + a + "이고 0보다 작습니다.");
		}
//
//		if (a >= 0) {
//			System.out.println("입력된 수는 " + a + "이고 0보다 크거나 같습니다.");
//		} else {
//			System.out.println("입력된 수는 " + a + "이고 0보다 작습니다.");
//
//		}
	}

}
