package polymorphism.game;

public class Main {
	public static void main(String[] args) {
		
		Archer a1=new Archer();
		Monster o=new Orc();
		a1.hunt(o);
		a1.hunt(o);
		a1.hunt(o);
		a1.hunt(o);
		a1.hunt(o);
		a1.showData();
		o.showM();
		
		
		
		
		
		
		
	}

}
