package math1;

public class Math5 {
	public static void main(String[] args) {
		// 주사위 게임을 만들기
		// 주사위게임은 내값은 myValue 변수에,
		// 컴퓨터의 값은 comValue변수에 값을 난수발생으로 1~6번위로 부여한뒤
		// 값이 같다면 무승부 , 아니면 나나 컴중 승자를 알려주는 방식

		int myValue = (int) (Math.random() * 7); // math.random()*6)+1; 하면 최소 최대 조절 가능 
		int comValue = (int) (Math.random() * 7);

		if (myValue > 0 && comValue > 0) {
			if (myValue == comValue) {
				System.out.println("무승부");
			} else if (myValue > comValue) {
				System.out.println("인간승리");
			} else {
				System.out.println("인간시대의 끝이 도달했다");
			}
			System.out.println("내값 :" + myValue);
			System.out.println("컴값 :" + comValue);
		} else {
			System.out.println("restart");
		}
	}

}
