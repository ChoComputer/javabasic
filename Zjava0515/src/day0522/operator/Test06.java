
package day0522.operator;

public class Test06 {
	public static void main(String[] args) {
		/*
		 * 배정연산자
		 * : 연산자 =
		 * : +=, -= , *=, /=
		 */
		{
			int a = 5;
			a = a+1;
			System.out.println(a);
						
			
		}
	
		{
			int a = 5;
			a++; //a = a+1; 과 같다
			System.out.println(a);
			
			
		}
		{
			
		int a = 5;
		a += 1;   //a= a+1; 같은거  1이상할때는 편함 a += 10; 이면 10증가임
		System.out.println(a);
		// a = a* 10;   ( a*= 10; 과 같다 )
		
		}
	
	
	}
	

}
