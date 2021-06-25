package day0529.loop;

import java.util.Scanner;

public class Quiz15 {public static void main(String[] args) {
	/*
	 * 1부터 입력받은  수까지의 합을 구하는 프로그램 작성
	 * 
	 *
	 * 수 입력 : 5 
	 * 1~5까지의 합은 : 15 입니다.
	 * 
	 */
	Scanner sc = new Scanner ( System.in);
	System.out.print("수 입력 : ");
	int num =sc.nextInt();
	int sum = 0;
	
	for ( int i =1;i<=num;i++) {
     sum+=i;       	//sum+=num; 내가푼건 num넣은거엿음;;; i를 넣어야하는데;;
	} System.out.println("1부터 "+num+"까지의 합은 "+sum+"입니다.");
 System.out.printf("1부터 %d까지의 합은 %d입니다.",num,sum);
}
	

}
