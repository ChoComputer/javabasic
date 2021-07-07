package random1;

import java.util.Random;
import java.util.Scanner;

public class Random2 {
	public static void main(String[] args) {
		// Random 객체를 생성한 다음 nextBoolean() 기능을 이용하여
		// 동전 던지기 카운팅 프로그램을 만들어 주세요
		// n회 던졌을때 true =앞면, false= 뒷면 으로 간주해서
		// 프로그램이 다끝났을 때 앞면 몇회, 뒷면 몇회 인지
		// 콘솔에 출력
		// 실행횟수는 n회는 스캐너로 입력을 받는다

		Scanner sc = new Scanner(System.in);
		System.out.print("동전 던질 횟수 : ");
		int n = sc.nextInt();
		sc.close();

		Random r = new Random();
		int countTrue = 0;
		int countFalse = 0;

		for (int i = 0; i < n; i++) {
//			boolean result = r.nextBoolean();
//			if (result==true) { // 내풀이 더 간략화 가능 밑에꺼가 간략화
			if (r.nextBoolean()) {
				countTrue += 1;
			} else {
				countFalse += 1;
			}
		}
		System.out.println(n + "바퀴 돌린값");
		System.out.println("앞면 : " + countTrue);
		System.out.println("뒷면 : " + countFalse);

	}

}
