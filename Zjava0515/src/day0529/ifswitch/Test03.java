package day0529.ifswitch;

import java.util.Scanner;

public class Test03 {public static void main(String[] args) {
	
	/*기본
	 * if (참 또는 거짓){
	 * 참일경우
	 * } else{
	 * 거짓일경우
	 * }
	 * 
	 * 다중if문
	 * 
	 * if (참 또는 거짓){
	 * 참일경우
	 * } else if (참 또는 거짓){
	 *  else if 가 참일경우 -요건 계속 넣을수있음
	 * }
	 *    .
	 *    .
	 *    .  
	 *  else {
	 *   위의  if들이 다 아닐경우
	 * }
	 */
	
	/*
	 * 숫자가 입력받고
	 * 입력받은 숫자가 5일경우 "5입니다"출력
	 * 5보다 클경우 "5보다 큽니다" 출력
	 * 5보다 작은경우 "5보다 작습니다" 출력
	 * 
	 */
	 Scanner sc = new Scanner(System.in);
	 System.out.print("입력할 숫자 : ");
	 int num = sc.nextInt();
	 
	 if (num == 5) {
		 System.out.println("5입니다.");
	 }else if(num > 5){
		 System.out.println("5보다 큽니다.");
	 } else{
		 System.out.println("5보다 작습니다.");
	 } 
	 
	 
	
}

}
