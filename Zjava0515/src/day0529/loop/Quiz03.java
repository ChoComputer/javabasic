package day0529.loop;

import java.util.Scanner;

public class Quiz03 {public static void main(String[] args) {
	
	/*
	 * 7의 배수 10 개 출력
	 */
//	
//	for (int i =7;i<=70;i+=7) {
//		System.out.println(i);
//	}
		/*
		 * 
	for (int i =1;i<=10;i++) {
		System.out.println(i*7);
		}
		 */
	Scanner sc = new Scanner(System.in);
System.out.print("숫자를 입력하시오 : ");
int num = sc.nextInt();
for (int i =1;i<=10;i++) {
	System.out.println(i*num);
}
System.out.println("end");

}

}
