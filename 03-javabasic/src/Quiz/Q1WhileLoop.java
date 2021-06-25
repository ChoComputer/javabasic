package Quiz;

import java.util.Scanner;

public class Q1WhileLoop {
	public static void main(String[] args) {
		// 스캐너를 이용하여 String num변수에
		// "문자열 형태인 숫자"를 입력받게 해주세요
		// 이 문자 자료 num을 int loop 변수에 정수로 변환해 저장하시오
		// loop 변수에 입력된 정수 횟수만큼
		// "반복문을 실행합니다(횟수)" 라는 문장이 콘솔에 출력 되도록
		// while문작성

		
		
		
		
		
		
		
		
		/////////////////// 생각///////////////////

		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
//		int loop = sc.nextInt(); 

		String num = sc.nextLine();
		int loop = Integer.parseInt(num);
		// 문자열 num을 int loop로 변환

		sc.close();

		int count = 0;
		while (count < loop) {
			count += 1;
			System.out.printf("반복문을 실행합니다. (%d)\n", count);
		}
		// count변수를 넣어서 변수 2개로 만들어야 한다는 생각을 못함 loop num은 같은거인데 별개라고 생각해서 헷갈렷음
		System.out.println(count);
	}

}
