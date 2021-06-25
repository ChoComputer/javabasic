package Quiz;

public class Q1 {
	public static void main(String[] args) {

		// 다음 로직 대로 전위 , 후위 수식을 이용하여 코드를
		// 작성하고 전위 , 후위 수식 코드는 Unary01.java 에서 그랬듯
		// 두 단계로 주석으로 풀어서 설명하기

		// 1.a에 15를 선언 및 초기화
		int a = 15;
		
		// 2.a를 후위 수식 감소시키면서 콘솔에 출력
		System.out.println(a--);
		// 01- System.out.println(a(15));
		// 02- a = a (15) - 1;
		
		// 3.a를 콘솔에 출력
		System.out.println(a);
		// System.out.println(a(14));
		
		// 4.a를 전위수식 감소키면서 콘솔에 출력
		System.out.println(--a);
		// 01- a=a(14)-1;
		// 02- System.out.println(a(13));
		
		// 5.a를 콘솔에 출력
		System.out.println(a);
		// System.out.println(a(13));

	}

}
