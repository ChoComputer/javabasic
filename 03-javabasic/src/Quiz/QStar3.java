package Quiz;

import java.util.Scanner;

public class QStar3 {
	public static void main(String[] args) {
		/*
		 * **** 
		 *  *** 
		 *   ** 
		 *    *
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("별들에게 물어봐 : ");
		int star = sc.nextInt();
		
		
		for(int i=0; i<star; i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<star-i; j++) {
				System.out.print("*");
			}
		System.out.println();}

	

	}

}
