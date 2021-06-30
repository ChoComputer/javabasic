package Quiz;

import java.util.Scanner;

public class PointQ2DoWhile {
	public static void main(String[] args) {
		// 여러분들이 배달 어플을 만들었습니다.
		// 이 어플은 주문금액을 입력받습니다.
		// 주문금액은 Scanner를 이용하여 order변수에 직접 입력을 받습니다.
		// 단, do while로 작성하여 첫 주문금액이 15000미만 이어도
		// "배달을 완료했습니다." 라고 출력 후
		// 다시 주문금액을 입력 받는 로직을 반복문 내부에 작성하여주세요

		
		
		
		
		
		
		
		
		
		
		
		///////////////// 생각선//////////////////////////////////

		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("배달 금액을 입력해 주세요 : ");
		int order = sc.nextInt();

		do {
			System.out.printf("주문금액은 %d원 입니다.\n", order);
			System.out.println("배달을 완료했습니다.");
			System.out.print("다음 배달금액을 입력해주세요. : ");
			order = sc.nextInt(); // 이거 생각 못했음;; order2선언했다가 while에 적용안되서 헷갈리고 int order 다시 선언했다가 오류나서 어쩌지...생각함.
//			int order=sc.nextInt(); int선언을 할 필요가없고 그냥 가져오면 됬엇음 선언된걸 ;;; int에 너무 집착했다;;
		} while (15000 <= order);

		System.out.println("금액이 모자라 배달 서비스가 종료되었습니다.");

	}

}
