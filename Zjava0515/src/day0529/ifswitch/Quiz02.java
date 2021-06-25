package day0529.ifswitch;
import java.util.Scanner;
public class Quiz02 {
	public static void main(String[] args) {
		/*
		 * 화면에서 점수하나 입력받음
		 * 입력받은 점수가 60점이상일경우
		 * 합격출력 미만일경우 불합격 출력
		 * 
		 * 
		 * 출력 형식
		 * 점수 : _70
		 * 합격
		 * 
		 * 점수 : _55
		 * 불합격
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score= sc.nextInt(); // 점수에 숫자를 입력 받겠다 란 의미 순서 중요!!
		
		if (score >= 70) {
			System.out.print("합격");
		}else{
			System.out.print("불합격");
		}
		}
		
	}


