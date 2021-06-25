package polymorphism;

public class Utuber extends Person {

	private int personCount;

	public Utuber(String n, int a, int pC) {
		super(n,a);

		this.personCount = pC;
	}

	public void showUtuber() {
		super.showPerson();
		System.out.println("구독자수 : "+ (this.personCount/10000)+"만 명" );
		System.out.println("-----------------");
		
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("구독자수 : "+ (this.personCount/10000)+"만 명" );
		System.out.println("-----------------");
		
	}

}
