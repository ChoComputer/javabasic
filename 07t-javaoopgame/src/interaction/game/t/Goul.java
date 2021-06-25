package interaction.game.t;

public class Goul {
	private int hp;
	private int atk;
	private int def;

	public Goul() {
		this.hp = 10;
		this.atk = 3;
		this.def = 1;
	}

	public void dobattle(int uatk) {
		this.hp = this.hp + this.def - uatk;
		if (this.hp <= 0) {
			System.out.println("구울을 사냥 하였습니다.");
			System.out.println("--------------");
		}

	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public int getDef() {
		return def;
	}

}
