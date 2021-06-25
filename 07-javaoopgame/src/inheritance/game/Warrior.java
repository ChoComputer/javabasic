package inheritance.game;

// Commoner 상속받기
public class Warrior extends Commoner {
	// Commoner 상속으로 인해 레벨 체력 마나 아이디는 이미 변수로 기입되있다
	// 전사클래스는 평민과 달리 물리공격력 수치를 부여받게 하기
	public String job;
	public int Pd;

	// getInfo() 함수를 이름그대로 다시 !!!!재정의!!!! 한다.
	// Warrior의 물리 데미지 수치까지 같이 콘솔에 찍히도록 작성
	public void getInfo() {
		System.out.println("레벨: " + level);
		System.out.println("직업: " + job);
		System.out.println("아이디: " + id);
		System.out.println("체력/마력: " + hp + "/" + mp);
		System.out.println("물리 대미지: " + Pd);
		System.out.println("----------------------");
	}

}
