package inheritance.game;

public class Main3 {
	public static void main(String[] args) {
		Magician m1 = new Magician();

		m1.hp = 900;
		m1.id = "강법사";
		m1.job = "마법사";
		m1.level = 10;
		m1.Md = 100;
		m1.mp = 1600;
		m1.getInfo();

		Thief t1 = new Thief();
		t1.hp = 1300;
		t1.id = "강도적";
		t1.job = "도적";
		t1.level = 10;
		t1.mp = 1200;
		t1.getInfo();

	}

}
