package day0529.loop;

public class Quiz12 {public static void main(String[] args) {
	int evenSum = 0; //짝수합
	int oddSum = 0;  //홀수합
	/*for (int i =1;i<=10 ;i++) {
		if (i %2==0) {
			evenSum+=i;			
		}else { oddSum+=i;}
*/		
		for (int i =1;i<=10 ;i++) {
			if (i %2==0) {
				evenSum+=i;	
				continue;  //컨티뉴 쓰면 else 쓸 필요가 없다 나머지부분 스킵이니까 if else 구문을 간편히 스킵됨 조건문이 줄어듬
			} oddSum+=i;    // 컨티뉴는 조건만족시 밑에꺼 무시하고  i++로다시 돌아감
			
	}
	System.out.println("짝수합 :" + evenSum);
	System.out.println("홀수합 :" + oddSum);
	System.out.println("전체합 :"+ evenSum + oddSum); // 이러면 문자열 취급이니까 (evenSum+oddSum)를 해서 우선순위를 높여줘야함!
	System.out.println("전체합 :"+ (evenSum + oddSum)); 
	
	
}

}
