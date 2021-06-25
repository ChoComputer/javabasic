package superTest;

public class SuperMom {

	
	
	private int level;
	private int exp;
	private int hp;
	private int mp;

	public SuperMom() {
		level = 50;
		exp = 0;
		hp = 10000;
		mp = 10000;
	}

	public SuperMom(int level, int exp, int hp, int mp) {

		this.level = level;
		this.exp = exp;
		this.hp = hp;
		this.mp = mp;
	}

	String[] arr = new String[6];
	{
		arr[0] = "상태창";
		arr[1] = "레벨 : " + this.level;
		arr[2] = "경험치 : " + this.exp;
		arr[3] = "체력 : " + this.hp;
		arr[4] = "마력 : " + this.mp;
		arr[5] = "----------------";
	}

	public void Data() {

		System.out.println("상태창");
		System.out.println("레벨 : " + level);
		System.out.println("경험치 : " + exp);
		System.out.println("체력 : " + hp);
		System.out.println("마력 : " + mp);
		System.out.println("----------------");
	}

	public void setter(int a, int b, int c, int d) {
		this.level = a;
		this.exp = a;
		this.hp = a;
		this.mp = a;
	}

}
