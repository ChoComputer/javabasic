package day0529.loop;

import java.util.Scanner;
/*
 * 사용자가 -1 입력할때까지 그때까지 입력한 수의 합을 구한다. 단 -1은 값에 포함되지 않는다.
 * 
 * 수 입력 : 10
 * 수 입력 : 5
 * 수 입력 : -1
 * 수의 합은 15 입니다.
 * 
 */
public class Quiz14 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	while(true) {
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
//		sum += num;    -1 까지 포함 되기 때문에 이 위치면 안된다.
		if (num==-1) {
			break;			 
		}
		sum += num; // while의 {} 안에 있으면서 -1 이 포함안된상태로 계산됨
	}
	System.out.println(" 수의 합은 "+ sum + "입니다.");
	
	
	
	
}

}
