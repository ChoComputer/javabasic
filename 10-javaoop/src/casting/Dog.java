package casting;

public class Dog extends Animal{
	private int cute;
	public Dog(int cute) {
		super("멍뭉이",2);
		this.cute =cute;
	}
	
	public void bowWow() {
		System.out.println("개가 짖는다!!");
	}
	public void sit() {
		System.out.println("개가 앉는다!!");
	}

}
