package Quiz;

import java.util.Scanner;

public class QMission {
	public static void main(String[] args) {
		// 이중 반복문을 이용해
		// n을 입력받을시 4~n까지의 범위에서
		// 소수만 출력해주는 코드를 작성하시오
		// 소수는 1과 자기자신으로만 나눌수 있는숫자
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 까지의 숫자 중 소수만 탐색하시겠습니까? : ");
		int finalNum = sc.nextInt();
		boolean isOk;
		for (int i = 4; i < finalNum; i++) {
			isOk = false;
			for (int j = 2; j < 1; j++) {
				if (i % j == 0) {
					isOk = true;
				}
				if ((i - 1 == j) && !isOk) {
					System.out.println(i + "은 소수입니다.");
				}
			}
		}

	}
}
