package PointMemo;

//import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		//   *
		//  **
		// ***

//		Scanner sc = new Scanner(System.in);
//		int star = sc.nextInt();

		//      for문으로 푸는법
		
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 0; j < 4 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		
		//for - if문으로 풀기
		
		for(int i=4; i>0; i--) {
			for(int j=0; j<4; j++) {
				if(i > j+1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
			}
			}System.out.println();
		}
		
		
		
		
	}
	
	

}
