package polymorphism;

public class FoodFighter extends Person {
	
	private String menu;
	
	public FoodFighter(String n,int ag,String m) {
		super(n,ag);
		this.menu=m;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("주종목 : "+this.menu);
		System.out.println("--------------------");
	}

}
