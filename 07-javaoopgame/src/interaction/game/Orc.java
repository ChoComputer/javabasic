package interaction.game;

public class Orc {

	private int hp;
	private int atk;
	private int def;

	public Orc() {
		this.hp = 30;
		this.atk = (int) (Math.random() * 7);
		this.def = 3;
	}

	public void attacked(int WA) {
		if (this.hp > 0) {
			if (WA >= 3) {
				this.hp = this.hp - (WA - this.def);
			} else {
				hp = hp;
			}
		}
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

	public void attack() {

	}

}
