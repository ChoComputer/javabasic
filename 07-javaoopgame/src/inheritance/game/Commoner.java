package inheritance.game;
// inheritance 폴더안의 game 폴더 라는 의미가 됨 .은 그런의미

public class Commoner {
	// 레벨 체력 아이디 마나수치를 변수로 만들기

	public int level;
	public int hp;
	public String id;
	public int mp;
	public String job;

	public int Cd = level * 10 + hp / 100;

	// 매서드는 getInfo()로 콘솔에 변수상태를 조회할수 있도록 구성하기
	public void getInfo() {
		System.out.println("레벨: " + level);
		System.out.println("직업: " + job);
		System.out.println("아이디: " + id);
		System.out.println("체력/마력: " + hp + "/" + mp);
		System.out.println("----------------------");

	}

}
