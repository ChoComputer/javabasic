package inheritance.game;

public class Main1 {
	public static void main(String[] args) {
		// 초보자계정 하나 생성하고 확인하기

		Commoner c1 = new Commoner();
		c1.level = 1;
		c1.id = "강초보";
		c1.hp = 100;
		c1.mp = 100;
		c1.job = "모험가";
		c1.getInfo();
	}

}
