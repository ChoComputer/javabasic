
package day0522.operator;

public class Test03 {
	public static void main(String [] args) {
		/*
		 * 증감연산자
		 *  : 변수의 값을 1 증가 또는 1감소 시킨다. 별도의 대입이 필요없음 3+5; 이건 오류남 어떻게 쓰는지가 없어서
		 *  : ++ (1을증가시킴), -- (1을 감소시킴) 
		 *  
		 *  
		 *  
		 */
		int a =5;
		a = a+1; // a값을 1증가시켜라 a = 5+1; -> a=6이됨
		a++; //  a 값의 변수를 1증가시켜라
		System.out.println(a);
		
		++a;  // 이것도 a++; 과 동일한 개념
		System.out.println(a);
		
		--a;
		a--;
		System.out.println(a);
		
		
		
		
		
		
	}
	
	
	

}

