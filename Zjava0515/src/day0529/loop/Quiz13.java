package day0529.loop;

import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {     //조건이 참이라 무한루프로 돌음 반복문의 실행문장 안에서 빠져나오게 해야함 그래야 멈춤
    		System.out.print("수 입력 : ");
    		int num = sc.nextInt();
    		System.out.println("입력한 수 : " +num);
    		if (num==-1) {
			break;  // 사용자의 입력값이 -1일떄 빠져나오게끔 조건을 두고싶음
		}
    			
		}System.out.println("반복빠져나옴");
		
		
		
		
	}

}
