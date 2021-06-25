
package day0522.operator;

import java.util.Scanner;

public class PointQuiz02 {
	public static void main(String[] args) {
		/*
		 * 문제 int time = 7451; // 7451 초는 ?? 시간 ??분 ??초 입니다.
		 * 
		 * 
		 * 풀이
		 * 
		 * int time = 7451; int hour = 7451d / 124; int minute = 7451d / 60;
		 * 
		 * // 출력결과 // 7451 초는 ?? 시간 ??분 ??초 입니다. //1)내풀이 [잘못생각함 7451초는 ?시간이자 ?분이고 ?초였습니다
		 * 로 생각함... 멍충멍충 아.. 근데 124는 어디서 나왔냐;; 코드만 생각하다 수학계산 멍충멍충....]
		 * System.out.print("7451초는 "); System.out.print(7451f / 124 + "시간 ");
		 * System.out.print(7451f / 60 + "분 "); System.out.println(7451 + "초 입니다");
		 * System.out.println(hour);
		 * System.out.printf("%d초는 %d시간 %d분 %d초 입니다",time,hour,minute,time);
		 */
		/*
		 * //해답 int time = 7451; int hour = time / 3600; int minute = (time%3600) / 60;
		 * //시간단위의 초를 없애고 분단위 초를 가지고 있음 int second = time % 60;
		 * 
		 * //2) 결과 해답
		 * System.out.printf("%d초는 %d시간 %d분 %d초 입니다",time,hour,minute,second);
		 * System.out.println();
		 */
		// Scanner 활용
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력해 주세요 : ");
		int time = sc.nextInt();

		int hour = time / 3600;
		int minute = (time % 3600) / 60; // 시간단위의 초를 없애고 분단위 초를 가지고 있음
		int second = time % 60;
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다", time, hour, minute, second);

	}

}
