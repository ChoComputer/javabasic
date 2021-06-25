package PointMemo;

import java.util.Scanner;

public class Memo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		System.out.println( (a%4==0)?( (a%400==0)?"1":(a%100==0)?"0":"1" ):"0" );
		//                (      a  ?                b                     : c  )
		//                             (    a    ? b :         c         )
		//                                             (    a   ?  b : c )
	}   // 3항 연산자  중첩임 참 거짓 도 조건문을 걸어서 실행 가능
	
	
	}