package Quiz;

import java.util.Scanner;

public class Q2Scanner {
	public static void main(String[] args) {
		/*
		 * 환율 계산기를 만든다 네이버에 검색하여 원하는 국가 화폐의 환율을 rate 변수에 저장 스캐너를 이용해 won 변수에 원화 금액 입력
		 * 원화와 환율을 이용하여 원화 xxx원을 환전시 xxx(화폐)입니다. 출력
		 */
		Scanner sc = new Scanner(System.in);

		double rate = 40.42;
		System.out.println("대만의 환율은 " + rate + "입니다.");
		System.out.print("원화를 입력해 주세요 :");
		double won = sc.nextDouble();
		System.out.println("원화 "+won +"원 을 대만달러로 환전시 "+Math.round(won/rate)+" TWD 입니다.");  //반올림
//		System.out.println("원화 "+won +"원 을 대만달러로 환전시 "+(String.format("%.2f" , (won / rate))+" TWD 입니다."));  //반올림
		
		System.out.printf("%.2f", won/rate); //%f는 소수점 6자리까지나옴 %.2f면 소수점 2자리까지만 보여줌
		System.out.print("Good Rice");
		
		

		sc.close();

	}

}
