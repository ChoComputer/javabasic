package PointMemo;

import java.util.Scanner;

public class Memo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		String res;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			res="31"; break;
		
		case 4:	
		case 6:	
		case 9:	
		case 11:
			res="30"; break;
		
		case 2:
			res="29"; break;
			
		default :
			res ="몰라";
		}
//		System.out.println(month+"월은 "+res+"일까지입니다.");
		System.out.printf(" %d월은 %s일 까지 입니다." ,month ,res);  
		//??? 왜안되냐? %d는 정수 %s문자 %s를 생각못함
	}
}