package Quiz;

import java.util.Scanner;

public class QStar {
	public static void main(String[] args) {
		// 피라미드형 별찍기
		// 아래와 같은 별찍을수 있도록 코드작성
		// *
		// **
		// ***
		// 중첩반목문의 세로 가로 가 안쪽 바깥쪽 일지 생각!

		
		
		
		
		
		
		
		////////////////생각 선///////////////////////////////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("별피라미드는 몇층이어야 이쁠까? : ");
		int star = sc.nextInt();

		for (int i = 1; i <= star; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
