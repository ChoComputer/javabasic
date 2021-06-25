package PointMemo;

import java.util.Scanner;

public class Memo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0&&b==0) break; //여기서 브레이크 걸림 밑의 a+b안나옴 참고참고
			System.out.println(a+b);
		}
	}
}
