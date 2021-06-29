package casting;

public class Animal {
	
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name=name;
		this.age=age;
	}
	// 동물의 행동을  아무거나 메서드로 만들어 주세요
	
	public void sit() {
		System.out.println("앉아!!");
		System.out.println("-----------------");		
	}
	
	public void hand() {
		System.out.println("손!!");
	}

}
