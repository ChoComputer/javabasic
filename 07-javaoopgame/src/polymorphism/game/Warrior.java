package polymorphism.game;

public class Warrior extends Person{
	private String id;
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int lv;
	private int exp;
	private int count;

	public Warrior() {
		super("전사",30,8,0,3,1,0);
		
	}

	public void hunt(Monster M) {
		int d = (int) (Math.random() * 10);
		this.atk = d;
		super.hunt(M);
		
		
	}
	

	public void Skill(Monster M) {
		if (M.getHp() > 0) {
			if (this.mp > 0) {
				this.mp -= 3;
				M.setHp(M.getHp() - (this.atk + 3));
				System.out.println("[[전사]]의 더블어택!!");
				System.out.println("MP 3 소모");
				System.out.println("전사가 " + M.getId() + "에게 [[" + (this.atk + 3) + "]]의 대미지를 주었습니다.");
				System.out.println("--------------------------------------");
			} else {
				System.out.println("마나가 부족하여 스킬이 사용이 안됩니다.");
			}
		} else if (M.getHp() <= 0) {
			this.exp += M.getExp();
			System.out.println("경험치를" + M.getExp() + "획득했습니다.");
			System.out.println("[록타 오가르 ~!..]");
			System.out.println("[[전투종료]]");
		}
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
