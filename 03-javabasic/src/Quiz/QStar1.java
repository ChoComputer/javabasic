package Quiz;

import java.util.Scanner;

public class QStar1 {
	public static void main(String[] args) {
/*
 *                    ****
 *                    ***
 *                    **
 *                    * 
 */
		Scanner sc = new Scanner(System.in);
		System.out.print("별피라미드는 몇층이어야 이쁠까? : ");
		int star = sc.nextInt();

		for (int i =star; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
