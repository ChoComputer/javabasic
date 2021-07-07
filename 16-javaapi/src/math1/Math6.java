package math1;

public class Math6 {

	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보기
		// Math.random() 을 이용하여 1/3확률로 가위 바위 보를 부여하고
		// 가위 > 보, 바위 > 가위, 보> 가위 의 상성
		// 같은 요소가 나오면 무승부

		int a = (int) (Math.random() * 3);
		int b = (int) (Math.random() * 3);

		String[] A = new String[3];
		A[0] = "가위";
		A[1] = "바위";
		A[2] = "보";
		//String[] B = { "가위", "바위", "보" };

		
		
		// 내가 풀던거
//		if (a == b) {
//			System.out.println("무승부");
//		} else if (a == 0) {
//			switch (b) {
//			case 1:
//				System.out.println("B의 승리");
//				break;
//			case 2:
//				System.out.println("A의 승리");
//				break;
//			}
//		} else if (b == 0) {
//			switch (a) {
//			case 1:
//				System.out.println("A의 승리");
//				break;
//			case 2:
//				System.out.println("B의 승리");
//				break;
//			}
//
//		}
		
		//선생님의 풀이
		// final int SCISSORS=0; 이렇게 상수 처리하면 밑에 숫자대신 시저스 같은 단어로 바꿔 넣을수 있음 가독성 증가!!
		if((a==0&&b==2)||(a==1&&b==0)||(a==2&&b==1)) {
			System.out.println("A 의 승리");
		}else if((a==2&&b==0)||(a==0&&b==1)||(a==1&&b==2)) {
			System.out.println("B 의 승리");
		}else if(a==b) {
			System.out.println("무승부");
		}
		System.out.println("A는 : " + A[a]);
		System.out.println("B는 : " + A[b]);

	}

}
