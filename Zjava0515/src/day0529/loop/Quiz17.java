package day0529.loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {
		Random r = new Random();

		int num = r.nextInt(10) + 1;
		int answer = r.nextInt(10) + 1;
		Scanner sc = new Scanner(System.in);
		int i = 1;
		for ( ; i <= 10; i++) {
			System.out.print(i + ".수를 입력하세요 (1 ~ 10) : ");
			int input = sc.nextInt();
			if (input == answer) {
				System.out.println("정답입니다.");
				break;
			}
			/*
			 * System.out.println("오답입니다."); if(input > answer) {
			 * System.out.println("입력값보다 작습니다."); }
			 */
			System.out.printf(input + "보다 %s 수 입니다.\n", input > answer ? "작은" : "큰");
		}
		if (i == 11) {
			// 정답을 못맞출경우 10회안에 맞추기 게임에 실패하였습니다.
			System.out.println("10회안에 맞추기 게임에 실패하였습니다.");
			System.out.printf("정답은 %d 입니다.", answer);
		}

		// int num = r.nextInt(100); //0부터 숫자-1 까지 나옴
		// int num = r.nextInt(100)+1; 1부터 100 까지 나옴
		// int num = r.nextInt(11)+10; 10부터 20 까지 나옴
		// System.out.println(num);
	}

}
