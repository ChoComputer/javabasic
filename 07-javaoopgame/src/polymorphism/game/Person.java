package polymorphism.game;

public class Person {
	private String id;
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int lv;
	private int exp;
	private int count;
	

	public Person(String id,int hp,int mp, int atk,int def, int lv, int exp) {
		this.id =id;
		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
		this.def = def;
		this.lv = lv;
		this.exp = exp;
		int d = (int) (Math.random() * this.atk);
		this.atk = d;
		
	}

	public void hunt(Monster M) {
		int r = (int) (Math.random() * M.getAtk());
		M.setAtk(r);
		if (M.getHp() <= 0) {
			System.out.println("시체잖아?사냥감을 찾아라..");
			return;
		}

		count++;
		System.out.println("전장의 냄새가 난다..");
		System.out.println(M.getId() + "를 발견했다!!");
		System.out.println(M.getId() + "와의 " + count + "번 쨰 교전!!");

		M.dobattle(this.atk);

		if (this.hp <= 0) {
			System.out.println("무모한 전투 였는가...");
			System.out.println("다음에 보도록 하지");
			System.out.println("[[사망]]");
			return;
		}

		if (this.hp > 0 && M.getHp() > 0) {
			
			if(M.getAtk()>this.def) {
			this.hp = (this.hp + this.def) - M.getAtk();}else{
				this.hp=this.hp;
			}

			System.out.println(M.getId() + "이(가) ((" + (M.getAtk() - this.def) + "))의 대미지를 주었다.");
			if (this.atk <= M.getDef()) {
				System.out.println(this.id +"의 공격실패.");
			} else {
				System.out.println(this.id+"((" + (this.atk - M.getDef()) + "))의 대미지를 주었다.");
			}
			System.out.println("나의 hp: " + this.hp);
			System.out.println(M.getId() + "의 hp: " + M.getHp());
			System.out.println("--------------------------------");
		}
		if (M.getHp() <= 0) {
			this.exp += M.getExp();
			System.out.println("경험치를" + M.getExp() + "획득했습니다.");
			System.out.println("[록타 오가르 ~!..]");
			System.out.println("[[전투종료]]");
		}}
	public void Skill(Monster M) {
		
	}
	
	

	public void showData() {
		this.hp = (this.hp <= 0) ? 0 : hp;
		this.mp = (this.mp <= 0) ? 0 : mp;
		System.out.println("*************************");
		System.out.println("<<"+this.id+">>");
		System.out.println("체력 : " + this.hp);
		System.out.println("마나 : " + this.mp);
		System.out.println("공격력 : 랜덤");
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
