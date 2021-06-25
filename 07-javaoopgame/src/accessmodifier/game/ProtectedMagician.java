package accessmodifier.game;

import inheritance.game.Commoner;

public class ProtectedMagician extends ProtectedCommoner {

//	public ProtectedMagician(String id) {
//
//		this.hp = 20;
//		this.mp = 40;
//		this.level = 5;
//		this.exp = 0;
//	}
	public void getAllData() {
		System.out.println("[법사]");
		super.getAllData();
	}

	public void hunt() {
		System.out.println("[법사]가 사냥을 시작합니다.");
		super.hunt();
	}

	public void fireBall() {
		if (getMp() - 4 > 0) {
			System.out.println("===============");
			System.out.println("마법사의 [[파이어볼]]!!");
			System.out.println("===============");
			setMp(getMp() - 4);
			setExp(getExp() + 15);
		} else {
			System.out.println("마나가 부족하여 스킬이 취소됩니다.");
		}
	}
}