package day0529.loop;
import java.util.Scanner;
public class Quiz09 {public static void main(String[] args) {
	
	/*
	 * 숫자5개를 입력받고 입력받은 숫자의 합과 평균을 구하는 프로그램 작성
	 */
	
	Scanner sc =new Scanner(System.in);
	int sum =0;        //for에 들어가게 되면 sum 값이 초기화됨 그러면안됨
	int cnt=5;       //이렇게 되면 나중에 수입력 수를 자유롭게 바꿀수잇음 이거 하나만 바꾸면 다바뀌니까 손대기 쉬움
	for(int i =0; i<cnt; i++) {
	System.out.print("수입력 : ");
	int num=sc.nextInt();
	//sum = sum +num;
	sum += num;
	
	}
	System.out.println("합계 : "+sum);
	System.out.println("평균 : "+sum/cnt);
	
}

}
