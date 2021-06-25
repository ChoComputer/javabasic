package package02;

import java.util.Scanner;

public class Scanner01 {
	public static void main(String[] args) {
		// 코드 실행 중 사용자의 입력을 받는 경우 스캐너 기능을 사용함
		// Scanner 부분에 마우스 갖다 대고 import를 해주면 됨
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		// 정수 하나를 입력받음
		
		System.out.println(a);
		// 입력받은 정수를 출력
		
		
		scan.close();
		// 메모리 절약을 위해 다 쓴 scan 변수는 닫습니다.
		
		
	}

}
