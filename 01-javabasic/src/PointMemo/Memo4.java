package PointMemo;

import java.util.Scanner;

public class Memo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수 범위 : -10,000 ≤ 수 ≤ 10,000");
		System.out.print("첫 번쨰 수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int b = sc.nextInt();

		if ((-10000 <= a && a <= 10000) && (-10000 <= b && b <= 10000)) {
			if (a > b) {
				System.out.println(">");
			} else if (a == b) {
				System.out.println("==");
			} else {
				System.out.println("<");
			}
		} else {
			System.out.println("범위 밖 숫자입니다. 다시 적어주세요");
		}

	}
}