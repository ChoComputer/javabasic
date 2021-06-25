package Quiz;

//import java.util.Scanner;

public class Qstar2 {
	public static void main(String[] args) {
		//   *
		//  **
		// ***

//		Scanner sc = new Scanner(System.in);
//		int star = sc.nextInt();

		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
       
		
		//같은거여
//		for (int i = 1; i <= star; i++) {
//			for (int j = star; j > i; j--) {
//				System.out.print(" ");
//			}
//            for(int k=0;k<i;k++) {
//            	System.out.print("*");
//            }System.out.println();
//            
//		}
//		
		
		
		
	}
	
	

}
