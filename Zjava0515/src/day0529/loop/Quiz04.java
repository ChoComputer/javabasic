/*
 *  1 2 3 4 ....10
 *  11 12 13 ...20
 *  ...
 *  ...
 *  91 92 93 ...100
 */
package day0529.loop;

public class Quiz04 {
	public static void main(String[] args) {
		
		
//		
//		for (int i = 1; i<=100; i++ ) {
//			System.out.print( i +" ");
//			if(i%10==0) {
//				System.out.println(); //줄넘김 문자임
//			}else {
//				System.out.print(" ");
//			}
//		}
		
		
//		for (int i = 1; i<=110; i++ ) {
//			//%d 정수 %s문자열 %f실수 %c문자
//			System.out.printf("%3d%s", i, i%10==0 ? "\n" : " ") ;
//		}
		
		/*
		 * 1~10
		 * 11~20
		 * 21~30
		 * ....
		 * 91~100
		 */
//		//1~10
//		for (int i=1; i<=10; i++) {
//			System.out.print(i+0+" ");
//		}
//		System.out.println();
//		//11~20
//		for (int i=1; i<=10; i++) {
//			System.out.print(i+10+" ");
//		}
//		System.out.println();
//		//21~30
//		for (int i=1; i<=10; i++) {
//			System.out.print(i+20+" ");
//		}
//		System.out.println();
		//일일이 하자면.....이렇게 되지만 밑에 간단히
		
		// 위에거 정리 +0 +10 이런거 만 바뀐다는거 알고밑에보면됨
		for(int cnt =0;cnt<10;cnt++) {
			for (int i=1; i<=10; i++) {
				System.out.print(i+ cnt*10 +" ");
			}
			System.out.println();
			
			
		}
		
		
	}

}
