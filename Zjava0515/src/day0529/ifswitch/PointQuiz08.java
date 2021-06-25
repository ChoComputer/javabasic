package day0529.ifswitch;

import java.util.Scanner;

public class PointQuiz08 {public static void main(String[] args) {
	/*
	 * 서로다른 숫자를 입력받는다(양수)
	 * 
	 * 입력받은 수중에 가장 큰값을 출력하여라
	 * 
	 * 
	 * 출력형식
	 * 
	 * 숫자1 : 10
	 * 숫자2 : 50
	 * 숫자3 : 7
	 * 
	 * 최대값 : 50
	 * 
	 */
	Scanner sc = new Scanner (System.in);
	System.out.print("숫자1 :");
	int n1 =sc.nextInt();
	System.out.print("숫자2 :");
	int n2 =sc.nextInt();
	System.out.print("숫자3 :");
	int n3 =sc.nextInt();
	// 이이후 못햇음 생각하삼 
	/*
	 * 
	 * 
	 * 
	 * 
	 * 눈팅 방지용 주석  고민해보고 밑보자
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	int max = Integer.MIN_VALUE; // 숫자 1~3을 비교하기위한 공간을 만들어둠  max랑 비교해서 큰거를 맥스로 대채해서 가는거임! 따라서 초기값을 가장작은값으로
			                    //저식이 무조건 작은값을 의미하는거임
	if (max < n1) max = n1;  // n1이 max보다 크면 max를 n1으로 대체 한다는것임
	if (max < n2) max = n2;    //반복문으로 쉽게 할수있음 
	if (max < n3) max = n3;
	System.out.println("최대값 : " + max);
	
	
			

	
	
	
	
	}
	
	
	
	
	
}


