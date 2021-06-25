package accessmodifier.game;



public class ProtectedCommoner {

	protected int hp;
	protected int level;
	protected int mp;
	protected int exp;

	public ProtectedCommoner() {
		this.hp = 20;
		this.mp = 10;
		this.level = 1;
		this.exp = 0;
	}

	public void ProtecdtedCommoner(int level, int exp, int hp, int mp) {

		this.level = level;
		this.exp = exp;
		this.hp = hp;
		this.mp = mp;
	}

	
	
	public void hunt() {
		this.hp -= (int) (Math.random() * 7);
		this.exp += 10;
		if (hp > 0) {
			System.out.println("사냥 결과 체력은 " + this.hp + "가 되었고");
			System.out.println("사냥 결과 마나는 " + this.mp + "가 되었고");
			System.out.println("누적 경험치는 " + this.exp + "가 되었습니다.");
			System.out.println("-----------------------------");
		} else if (hp <= 0) {
			System.out.println("You die");
		}
	}

// getter setter 쉽게 하는법 마우스 오른쪽누르고 source에서 getter setter 클릭하면 쉽게됨
	public int getHp() {
		return hp;
	}

	public int getExp() {
		return exp;
	}

	public int getLevel() {
		return level;
	}
	
	public int getMp() {
		return mp;
	}
	

	public void setLevel(int level) {
		this.level = level;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void getAllData() {
		if (hp > 0) {
			System.out.println("레벨: " + this.level);
			System.out.println("체력 : " + this.hp);
			System.out.println("마력 : " + this.mp);
			System.out.println("경험치 : " + this.exp);
			System.out.println("----------------------");
		} else {
			System.out.println("사망중인 상태입니다.");
			System.out.println("레벨: " + this.level);
			System.out.println("체력 : " + "0");
			System.out.println("마력 : " + this.mp);
			System.out.println("경험치 : " + this.exp);
			System.out.println("----------------------");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
