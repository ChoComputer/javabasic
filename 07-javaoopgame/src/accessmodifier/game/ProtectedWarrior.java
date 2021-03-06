package accessmodifier.game;

import java.awt.Container;

public class ProtectedWarrior extends ProtectedCommoner {

//	public ProtectedWarrior(String id) {
//
//		this.hp = 40;
//		this.mp = 20;
//		this.level = 5;
//		this.exp = 0;
//	}
//	public void getAllData() {
//		System.out.println("[전사] 상태창");
//		super.getAllData();
//	}
	
	// setter getter 연습용
	public void getAllData() {
		if (getHp() > 0) {
			System.out.println("----------------------");
			System.out.println("[전사]");
			System.out.println("레벨: " + getLevel());
			System.out.println("체력 : " + getHp());
			System.out.println("마력 : " + getMp());
			System.out.println("경험치 : " + getExp());
			System.out.println("----------------------");
		} else {
			System.out.println("사망중인 상태입니다.");
			System.out.println("레벨: " + getLevel());
			System.out.println("체력 : " + "0");
			System.out.println("마력 : " + getMp());
			System.out.println("경험치 : " + getExp());
			System.out.println("----------------------");
		}
	}

	// getter setter 쉽게 하는법 마우스 오른쪽누르고 source에서 getter setter 클릭하면 쉽게됨
	public void hunt() {
		System.out.println("[전사]가 사냥을 시작합니다.");
//		super.hunt();       // Commoner 에서 그냥 무지성으로 가져온거

		// setter getter 사용한거
		setHp(getHp() - (int) (Math.random() * 7)); // 같은 거임 hp = hp-2 , hp-=2;
		setExp(getExp() + 10);

	}

	public void doubleAttack() {
		if (getMp() - 2 > 0 && getHp() > 0) {
			System.out.println("===============");
			System.out.println("전사의 [[더블어택 ]]!!!");
			System.out.println("===============");
			setMp(getMp() - 2);
			setExp(getExp() + 15);
		} else {
			System.out.println("마나가 부족하여 스킬이 취소됩니다.");
		}
	}
}