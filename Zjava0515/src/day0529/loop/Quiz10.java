package day0529.loop;

import java.util.Scanner;

public class Quiz10 {public static void main(String[] args) {
	/*
	 * 임의의 양수 2개 입력받는다 두수 사이의 수 다 합침
	 * 단, 같은숫자는 입력되지않음
	 * 
	 * 수입력 : 1
	 * 수입력 : 3
	 * 합은 6 입니다.
	 */
	Scanner sc = new Scanner(System.in);
	System.out.print("수 입력 : ");
	int start=sc.nextInt();
	System.out.print("수 입력 : ");
	int end=sc.nextInt();
	int sum=0;
	for(int i =start; i<=end; i++) {
		//sum = sum+i;
		sum +=i;
		
	}
	System.out.println("합은 " +sum + "입니다.");

	
	
	
	
	
	
	
}

}
