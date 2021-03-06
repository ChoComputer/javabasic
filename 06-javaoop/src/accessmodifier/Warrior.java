package accessmodifier;

public class Warrior {
	// hp atk level exp 속성추가
//	public int hp;
//	public int atk;
//	public int level;
//	public int exp;
//	public String id;
	// 사용자가 main에서 임의로 수치를 고치는것을 막기위해
	// public 대신 private으로 수정
	private int hp;
	private int atk;
	private int level;
	private int exp;
	private String id;
	
	//메서드는 아무리 사용해도 개발자 의도대로만 사용되도록
	// 제한하기 수월하기 때문에 일반적으로 public으로 설정함
	
	public Warrior (String id) {
		//체력공격력은 생성시 20 ,3
		this.hp=20;
		this.atk=3;
		// 렙 경치는 생성시 1 0으로
		this.level=1;
		this.exp=0;
		//id는 사용자가 입력한 대로
		this.id=id;
	}
	public void hunt() {
		hp-=(int) (Math.random() * 6);;
		exp+=10;
		if(hp>0) {
			System.out.println("사냥의 시간이 돌아왔다.");
		System.out.println("사냥 결과 체력은 "+hp+"가 되었고");
		System.out.println("누적 경험치는 "+exp+"가 되었습니다.");
		System.out.println("-----------------------------");
	}else if(hp<=0) {
		System.out.println("You die");
	}
	}
}
