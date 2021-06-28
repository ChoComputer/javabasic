package polymorphism.game;

public class Archer {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int lv;
	private int exp;
	private int count;

	public Archer() {
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.def = 1;
		this.lv = 1;
		this.exp = 0;
	}

	public void hunt(Monster M) {

		if (M.getHp() <= 0) {
			System.out.println("시체는 사냥감으로 좋지 않지..");
			return;
		}

		count++;
		System.out.println("사냥의 시간이 돌아왔다..");
		System.out.println(M.getId() + "를 발견했다!!");
		System.out.println(M.getId()+"와의 " + count + "번 쨰 교전 완료!");

		M.dobattle(this.atk);

		if (this.hp <= 0) {
			System.out.println("사냥꾼과 사냥감은 바뀌기 마련...");
			System.out.println("다음 생엔 사냥감을 고르는 눈을 기르기 바라지");
			System.out.println("[[사망]]");
			return;
		}

		if (this.hp > 0 && M.getHp() > 0) {

			this.hp = (this.hp + this.def) - M.getAtk();

			System.out.println(M.getId() + "이(가) ((" + (M.getAtk()-this.def) + "))의 대미지를 주었다.");
			System.out.println("아처는 ((" + (this.atk-M.getDef()) + "))의 대미지를 주었다.");
			System.out.println("나의 hp: " + this.hp);
			System.out.println(M.getId() + "의 hp: " + M.getHp());
			System.out.println("--------------------------------");
		}
		if (M.getHp() <= 0) {
			this.exp += 20;
			System.out.println("경험치를 20 획득했습니다.");
			System.out.println("[좋은 사냥감은 죽은 사냥감이지..]");
			System.out.println("[[사냥종료]]");
		}
	}

	public void showData() {
		this.hp = (this.hp <= 0) ? 0 : hp;
		System.out.println("*************************");
		System.out.println("<<궁수>>");
		System.out.println("체력 : " + this.hp);
		System.out.println("마나 : " + this.mp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("레벨 : " + this.lv);
		System.out.println("경험치 : " + this.exp);
		System.out.println("*************************");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

}