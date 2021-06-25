package Quiz;

//import java.util.Scanner;

public class SwitchCaseRandom {
	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int a = sc.nextInt();

//		double number=Math.random(); * 10;
//		System.out.println(number);
		// Math.random(); 을 이용해 난수를 하나 발급 받을수가 있고 난수의 범위는 0초과 1미만 입니다. 뒤에 * 숫자 하면 숫자미만의
		// 범위의 정수를 얻을수 있습니다.

		int intNum = (int) (Math.random() * 6);
//		System.out.println(intNum);
		// int 붙이면 정수가 나옴 0.~ 없어져서 이경우 0도 나옴

		/*
		 * switch~case 문을 이용하여 식당이름을 출력하는 프로그램을 만들어보세요.(최소 6개)
		 */

		switch (intNum) {
		case 0:
			System.out.println("풀뜯는돼지");
			break;
		case 1:
			System.out.println("맥도날드");
			break;
		case 2:
			System.out.println("kfc");
			break;
		case 3:
			System.out.println("토끼정");
			break;
		case 4:
			System.out.println("민스카츠");
			break;
		default:
			System.out.println("백반");
		}
	}

}