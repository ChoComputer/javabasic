package accessmodifier2;

public class Parent {
	
	public int a;
	protected int b;
	private int c;
	// default 혹은 package friendly
	// 같은 패키지 내부에서만 접근 가능 , protected 와 private 의 중간
	int d;
	// default 임
	// 같은 패키지 내이면 다 사용가능 protected가되면 얜 자동을 된다고 생각하면됨
	
	//생성자 Parent()
	public Parent() {
		this.a =1;
		this.b =2;
		this.c =3;
		this.d =4;
	}
	
	//getter 연습용
	
	public int getter() {
		
		return (this.c);
		
	}
	public int Tgetter() {
		
		return (this.b);
		
	}

}
