package accessmodifier.game;

public class Paladin extends ProtectedCommoner {

	public void HolyAttack() {
		if (getMp() > 0) {
			setHp(getHp() + 3);
			setMp(getMp() - 5);
			setExp(getExp() + 13);
			System.out.println("======================");
			System.out.println("성직자의 [[HolyAttack]]!!!");
			System.out.println("=======================");
		} else {
			System.out.println("마나가 부족하여 [HolyAttack]이 취소되었습니다.");
		}
	}
	public void getAllData() {
		System.out.println("[팔라딘]");
		super.getAllData();
	}
	public void hunt() {
		System.out.println("[팔라딘]이 악한것들의 정화를 시작합니다.");
		super.hunt();
	}
// 현재체력을 getHp로 두고 최대체력을 MaxgetHp를 만들어서 제한두면 좋음 근데 만들면 다시 만들어야해..ㅠㅠ
	public void Heal() {
		if (getMp() > 0&& getHp()<20) {
			setHp(getHp() + 6);
			setMp(getMp() - 3);
			System.out.println("==================================");
			System.out.println("팔라딘의 [[Heal]]!!");
			System.out.println("팔라딘의 HP가" +getHp() + "되었습니다.");
			System.out.println("==================================");
		} else if(getMp()>0 && getHp()>=20) {
			System.out.println("체력이 최대입니다.");
		}else {
			System.out.println("마나가 부족하여 [Heal]이 취소되었습니다.");
		}
	}

}
