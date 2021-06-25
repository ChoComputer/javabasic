package package02;

import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		// 문자열을 입력 받는 경우

		double height = sc.nextDouble();
		// 실수를 입력 받는 경우 float경우도 동일하게 둘다 .0 값이나옴

		System.out.println(name + height + 333 + 1);
		// 문자 + 숫자로 출력될 경우 몽땅 문자열로 취급(즉 숫자로 취급안하고 문자로 취급한다는것임)

		System.out.println(name + height + (333 + 1));
		// () 하면 문자 + 숫자 뒤에 있어도 ()안이 우선시 되서 계산됨
		sc.close();

	}

}
