package Quiz;

import java.util.Scanner;

public class Qcontinue {
	public static void main(String[] args) {
		// 1~n까지의 총합을 구하되 홀수끼리만 더함
		// 총합을 구하는 구문 작성
		// continue문을 반드시 사용
		// n은 스캐너로 입력받기

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/////////////////////////////////생각선/////////////////////////////////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇까지 더할까? 홀수만 더할꺼야 : ");
		int n = sc.nextInt();

		int total = 0;
		int count = 0;

		while (count < n) {
			count += 1;

			if (count % 2 == 0) {
				continue;
			}
			total += count;
			System.out.println("현재 1부터" + count + "까지 홀수만 빼고 더했습니다.");
			System.out.println("총합은 : " + total);

		}

	}

}
