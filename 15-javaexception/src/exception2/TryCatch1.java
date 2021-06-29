package exception2;

import java.util.Scanner;

public class TryCatch1 {
	public static void main(String[] args) {
		// try~catch 구문은 크게 예외가 발생할 수 있는 구문을 적는
		// try 블럭과 , 예외 발생시 처리할 catch블럭으로 나뉩니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번 정수 입력 : ");
		int a =sc.nextInt();
		System.out.println("2번 정수 입력 : ");
		int b =sc.nextInt();
		
		sc.close();
		
		try {
			// 예외가 발생할 구문을 적는 블록. try블록은 
			// 반드시 하단에 catch 블록이 추가로 작성되어야함
			System.out.println(a/b);
			System.out.println("계산 끝!");
		}catch(Exception e) {
			// catch 블록에는 (Exception e)가 기본으로 들어감 만능처리구문임
			// 추후 특정한 종류의 예외만 처리하고 싶을떄 다른 자료형을 적어주면 된다.
			System.out.println("나누는 숫자는 0이 될수 없다");
		}finally {//이건 필수는 아님 그냥 sysou코드끝 만 넣어도됨
		System.out.println("코드 끝!!");
		}
		
	}

}
