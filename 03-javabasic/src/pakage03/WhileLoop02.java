package pakage03;

public class WhileLoop02 {
	public static void main(String[] args) {
		// while 문의 조건식이 어떻게 해석해도 true로 판단되게 입력되면
		// 절대 끝나지 않는 무한 루프문이 됩니다.
		// 이 경우 강제 탈출 구문 break를 써야만 종료가 됩니다.
		
		int count=0;
		while(true){
			count +=1;
			System.out.println("반복문 실행중입니다."+count);
		}
		
	}

}
