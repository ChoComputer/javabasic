package Quiz;

import java.util.Scanner;

public class Q3ElseIf {
	public static void main(String[] args) {
		/*
		 * 성적 판독기를 만들어 봅시다. if~else if~else 구문은 사용하여 만들기 성적 기준은 95점 이상 A+, 90점 이상 A0,
		 * 85이상B+ 80이상 B0, 75이상C+, 70이상C0, 65이상D+, 60이상D0, 60미만F로 프린트 구문으로 콘솔 출력 스캐너로
		 * int score 변수에 성적 입력
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 성적을 적어주세요 : ");
		int score = sc.nextInt();
		sc.close();

		if (score > 100) {
			System.out.println("존재하지 않는 점수 입니다.\n다시적으세요");
		} else if (score >= 95) {
			System.out.println("당신의 성적 : A+");
		} else if (score >= 90) {
			System.out.println("당신의 성적 : A0");
		} else if (score >= 85) {
			System.out.println("당신의 성적 : B+");
		} else if (score >= 80) {
			System.out.println("당신의 성적 : B0");
		} else if (score >= 75) {
			System.out.println("당신의 성적 : C+");
		} else if (score >= 70) {
			System.out.println("당신의 성적 : C0");
		} else if (score >= 65) {
			System.out.println("당신의 성적 : D+");
		} else if (score >= 60) {
			System.out.println("당신의 성적 : D0");
		} else if (score >= 0) {
			System.out.println("당신의 성적 : F");
		} else {
			System.out.println("존재하지 않는 점수입니다.\n다시 적으세요");
		}

	}

}
