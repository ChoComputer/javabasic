package casting;

public class Cat extends Animal{
	private int cute;
	public Cat(String name,int age,int cute) {
		super(name,age);
		this.cute =cute;
	}
	
	public void sit() {
		System.out.println("냥냥냥거리며 ");
		super.sit();
		
	}
	
	public void Jump() {
		System.out.println("냥냥이가 뜁니다");
	}

}
