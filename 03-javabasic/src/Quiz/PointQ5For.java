package Quiz;

public class PointQ5For {
	public static void main(String[] args) {
		
		
		
		// 2~9단 까지 구구단을 출력하는 코드 작성
		// 중첩 반복문 사용
		
		
		
		
		
		
		
		
		
		
		
		
		///////////////생각선////////////////////////////////
		
		
		
		
		
		
		
		
		
		int i;
		int j;
		for (i = 2; i < 10; i++) {
			System.out.printf("%d단 구구단 입니다.\n",i);
			for (j = 1; j < 10; j++) {
				System.out.printf("%2d * %d = %-3d//", i, j, i * j);
			}
			System.out.println("\n");
		}
	}

}
