package package02;

//import java.util.Scanner;

public class SwitchCaseRandom {
	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int a = sc.nextInt();

//		double number=Math.random(); 
//		System.out.println(number);
		// Math.random(); 을 이용해 난수를 하나 발급 받을수가 있고 난수의 범위는 0초과 1미만 입니다. 
		
	    int intNum=(int)(Math.random() * 10);
		System.out.println(intNum);
		// int 붙이면 정수가 나옴 0.~ 없어져서 이경우 0도 나옴
//		뒤에 * 숫자 하면 숫자미만의 범위의 정수를 얻을수 있습니다.
		
	}
	

}
