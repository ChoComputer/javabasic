package Quiz;

import java.util.Scanner;

public class Q4ForIf {
	public static void main(String[] args) {
		// 구구단 출력기를 만들어보자
		// 1~9중 하나의 숫자를 입력 받습니다.
		// 만약 1~9범위 밖의 숫자가 입력되면 "범위 내의 수를 입력하시오" 라는 안내 문구 적고 종료
		// 맞는 숫자가 들어온다면 결과예시처럼 출력하기
		//

		
		
		
		
		
		
		
		
		
		
		
		//////////////생각선///////////////////////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9중의 숫자 하나 입력 해주세요  : ");
		int a = sc.nextInt();
		sc.close();
		
		if (a > 0 && a < 10) {
			System.out.printf("구구단 중 %d단 입니다.\n", a);
			for (int i = 1; i < 10; i++) {
				
//				System.out.println(a + "*" + i + "=" + a * i);
				
				// or
				
//				int c=a*i;
//				System.out.printf("%d*%d=%d\n",a ,i ,c);

				//or
				
				System.out.printf("%d*%d=%d\n",a ,i ,a*i );
				
			}
		} else {
			System.out.println("범위 내의 수를 입력해주세요");
		}
	}
}
