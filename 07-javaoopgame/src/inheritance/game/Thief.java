package inheritance.game;

public class Thief extends Commoner {

	public void getInfo() {
		int Td = Cd + mp / 100;
		System.out.println("레벨: " + level);
		System.out.println("직업: " + job);
		System.out.println("아이디: " + id);
		System.out.println("체력/마력: " + hp + "/" + mp);
		System.out.println("독대미지: " + (Td + 100));
		System.out.println("----------------------");
	}

}
