package package02;

import java.util.Scanner;

public class ElseIf01 {
	public static void main(String[] args) {
		// else if는 if로 달린 조건 이외에 추가 조건을 달때 사용함
		// if문 다음에 작성하고, else문 전에 작성함
		// else if 문은 else와 달리 조건식을 기입해야함
		// else if 문은 몇개라도 작성할수가 있다.
		Scanner sc= new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요 :");
		int num =sc.nextInt();
		
		if(num>0) {
			System.out.println("양수 입니다.");
		}else if(num==0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음수 입니다.");
		}

	}

}
