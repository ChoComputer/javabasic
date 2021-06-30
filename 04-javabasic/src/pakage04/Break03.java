package pakage04;

public class Break03 {
	public static void main(String[] args) {
		// 중첩 반복문 사용 시 전체 종료가 아닌
		// 내부 반복문만 종료하는 예시(outter라벨없을시)
		// 구구단 출력, 단 n*5 까지만 출력하는 예시
		// 단 , break가 속한 반복문이 아닌 상위의 반복문을 종료하고 싶다면
		// 라벨명 : for(...)로 라벨을 붙인 뒤
		// break 라벨명;
		// 으로 호출하면 상위 반복문도 종료됨

		// 바깥족 반복문에 outter 이라는 라벨은 붙임
		outter:	for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단 출력.");
			 for (int j = 1; j <= 9; j++) {
				if (j > 5) {
					System.out.println(i + "*6이상은 직접 알아보기");
					break outter;
				}
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println("----------------------");
		}
	}

}
