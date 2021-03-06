package polymorphism.game;

public class Monster {
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;

	public Monster(String id, int hp, int atk, int def, int exp) {
		this.id = id;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}

	public void dobattle(int uatk){
		if (uatk > this.def) {
			this.hp = this.hp + this.def - uatk;
		}
		if (this.hp <= 0) {
			System.out.println(this.id + "을 사냥 하였습니다.");
			System.out.println("--------------");
		}
	}

	public void showM() {
		this.hp = (this.hp <= 0) ? 0 : this.hp;
		System.out.println("*************************");
		System.out.println("<<" + this.id + ">>");
		System.out.println("체력 : " + this.hp);
		System.out.println("*************************");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

}
