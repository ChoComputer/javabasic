package final2;

public class Final2Main {
	
	public static void main(String[] args) {
		// 일반 숫자를 이용한 출력
		
		System.out.println("전사의 체력 : "+ 50);
		System.out.println(50);
		System.out.println("몬스터의 경험치: "+ 20);
		System.out.println(20);
		
		// 자주 사용하게될 수치는 아래와 같이 상수처리하여 
		// 코드에 대입을 한다
		// 이러면 변수명 만으로도 어떤의미를 가진 수치인지 바로 유추가되어
		// 코드의 가독성이 높아진다
		
		final int WARRIOR_HP =50;
		final int MONSTER_EXP =50;
		
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);
		
		
		
		
	}

}
