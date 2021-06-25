package Quiz;

import java.util.Scanner;

public class QBreak {
	public static void main(String[] args) {
		// Scanner 로 정수입력
		// 1~n까지 차곡차곡 순서대로 더할시
		// 1부터몇까지 더해야 입력된 정수를 초과하는지 계산해주는 프로그램

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//////////////////////////////////생각선///////////////////////////////////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수의 총 합이 몇이면 종료 할까요? : ");
		int goal = sc.nextInt();

		int count = 1;
		int total = 0;

		while (true) {
			total += count;
			System.out.println("1부터 " + count + "까지의 총합은 : " + total +"입니다.");
			if (goal <= total) {
				System.out.println("목표값 : " + goal);
				System.out.println("총합: " + total);
				System.out.println("몇까지 더했습니까?: " + count);
				
				break;
			}
			count++;
		}
	}

}
