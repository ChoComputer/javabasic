package exception2;

import java.util.Scanner;

public class TryCatch2 {
	public static void main(String[] args) {
		// 아까 exception1 패키지 내부의 여러 유형중
		// 하나 골라서 예외가 발생할수 있는 코드 작성
		// 발생할 예외에 대한 처리는 try~catch 블록을 활용

		Scanner sc = new Scanner(System.in);

		System.out.print("a :");
		String a = sc.nextLine();
//		System.out.print("b :");
//		String b =sc.nextLine();

		sc.close();

		try {
			int result = Integer.parseInt(a);
			System.out.println(a);
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해라");
		} finally {
			System.out.println("코드 끝");
		}

	}

}
