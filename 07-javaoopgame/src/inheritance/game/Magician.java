package inheritance.game;

public class Magician extends Commoner {
	public int Md;

	public void getInfo() {
		int Sd = Md + level * 10;
		System.out.println("레벨: " + level);
		System.out.println("직업: " + job);
		System.out.println("아이디: " + id);
		System.out.println("체력/마력: " + hp + "/" + mp);
		System.out.println("마법대미지: " + Md);
		System.out.println("스킬대미지: " + Sd);
		System.out.println("----------------------");

	}

}
