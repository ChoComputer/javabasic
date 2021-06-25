package accessmodifier.game;

import inheritance.game.Commoner;

public class ProtectedArchor extends ProtectedCommoner {

//	public ProtectedArchor(String id) {
//
//		this.hp = 30;
//		this.mp = 25;
//		this.level = 5;
//		this.exp = 0;
//	}
	public void getAllData() {
		System.out.println("[궁수]");
		super.getAllData();
	}

	public void hunt() {
		System.out.println("[궁수]가 사냥을 시작합니다.");
		super.hunt();
	}

	public void multiShot() {
		if (getMp() - 2 > 0) {
			System.out.println("===============");
			System.out.println("아쳐의 [[멀티샷]]!!!!");
			System.out.println("===============");
			setMp(getMp() - 2);
			setExp(getExp() + 15);
		} else {
			System.out.println("마나가 부족하여 스킬이 취소됩니다.");
		}
	}

}
