package interaction.game;

public class Commoner {
	private int level;
	private int exp;
	private String id;
	private int hp;
	private int mp;
	private int Attack;
	private int Deffense;
	
	public Commoner(int lev,int exp,String id,int hp,int mp,int atk,int def) {
		this.level=lev;
		this.exp=exp;
		this.id=id;
		this.hp=hp;
		this.mp=mp;
		this.Attack=atk;
		this.Deffense=def;
	}
	
	public void Data() {
		if (hp > 0) {
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
}
	


