package day0529.loop;

public class Test02 {
	public static void main(String[] args) {
		int a= 9;
		if (a % 2 ==0) {
			System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		
		
		//조건 연산자 (조건식 ? 값1 : 값2 ) 사용하면
		String result = (a%2==0) ? "짝수" : "홀수" ;
		System.out.println(result);
			

		// 두줄을 한번으로 정리 가능
		System.out.println((a%2==0) ? "짝수" : "홀수"); 
		
		
		
		
		
		
	}

}
