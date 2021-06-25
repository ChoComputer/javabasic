package Quiz;

import java.util.Scanner;

public class Q3For {
	public static void main(String[] args) {
		// Hello Java를 입력한 횟수만큼 출력하는 구문을 작성하시오
		//입력은 Scanner로 받는다
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("몇 번 나열할까? : ");
		int a = sc.nextInt();
		
		for(int i=1;i<=a;i++ ) {
			System.out.println("Hello Java! "+i);
		}
		sc.close();
		
	}

}
