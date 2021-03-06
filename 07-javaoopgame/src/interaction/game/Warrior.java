package interaction.game;

public class Warrior {

	private int level;
	private int exp;
	private String id;
	private int hp;
	private int mp;
	private int atk;
	private int def;

	public void Warrior() {
		this.level = 5;
		this.exp = 0;
		this.id = "전사";
		this.hp = 50;
		this.mp = 30;
		this.atk = (int) (Math.random() * 15);
		this.def = 5;
	}

	public void huntOrc(Orc o) {
		System.out.println("전사의 싸움이다 오크!!");
		
		
		o.attacked(this.atk);

		
		
		if (this.def >= o.getAtk()) {
			this.hp = hp;
			System.out.println("공격을 회피!!");
			return;
		} else {
			this.hp = hp + (def - o.getAtk());
		}

		if (o.getHp() <= 0) {
			this.exp += 5;
			System.out.println("Final Attack!!");
			System.out.println("+" + exp + "!!!");
		}
		o.setHp(o.getHp() - this.atk);
		System.out.println(this.atk + "의 공격!!");
		System.out.println(o.getAtk() + "의 공격을 받아 전사(" + hp + ")가되었습니다.");
		System.out.println("orc는 공격을 받아 HP가 " + o.getHp() + "만큼 남았다.");
	}

	public void huntGoul(Goul g) {

	}

	public void huntDeveil(Deveil d) {

	}

	public void Data() {
		if (hp > 0) {
			System.out.println("----------------------");
			System.out.println("[[전사]]");
			System.out.println("레벨: " + this.level);
			System.out.println("체력 : " + this.hp);
			System.out.println("마력 : " + this.mp);
			System.out.println("경험치 : " + this.exp);
			System.out.println("----------------------");
		} else {
			System.out.println("----------------------");
			System.out.println("사망중인 상태입니다.");
			System.out.println("----------------------");
		}
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

}
