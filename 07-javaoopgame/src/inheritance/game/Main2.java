package inheritance.game;

public class Main2 {
	public static void main(String[] args) {
		// Warrior를 생성 각종스탯 작성
		// getInfo호출

		Warrior w1 = new Warrior();

		w1.hp = 2000;
		w1.mp = 800;
		w1.job = "도끼전사";
		w1.level = 10;
		w1.Pd = 150;
		w1.id = "강도끼";

		w1.getInfo();
		// getInfo()호출시 Commoner의 getInfo()는 무시됩니다
		// Warrior의 재정의된 getInfo()가 우선적으로 호출

	}

}
