package day0522.operator;

import java.util.Scanner;
//Scanner 를 쓰려면 import 가 필요 import class의 위치를 알려줌
public class Test08 {
	public static void main(String[] args) {
		/*
		 * 사용자에게 입력 받기
		 * 
		 * 		  
		 */
		// Scanner (class생각 첫문자 대문자 주의) api(함수같은것)중 하나
		// Scanner 데이터타입 sc 변수의 이름
		//기본타입들 제외하곤 대문자로 시작하는 것들임 답은 new로 시작함 클래스문법!
        // 형태 
		Scanner sc = new Scanner(System.in); //()에있는건 위치를 나타냄 주소라고 보면 될듯 
		
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println("입력된 이름 : "+ name);
		System.out.println("입력된 나이 : "+ age);
		
		
		/*
		 * nextInt() : int 정수값을 입력 받겠다 대문자주의
		 * next() : 문자열을 입력받겠다.
		 */
		
		
		//Test t = new Test(); 어떠한 데이터 타입이던 이런 형식 
		 /*String s = "";
		 String s2 = new String();  String은 두 종류 다 가능
		*/
		
		
		
		System.out.println();
		
		
		
	}

}
