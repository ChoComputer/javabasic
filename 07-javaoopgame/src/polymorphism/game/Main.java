package polymorphism.game;

public class Main {
	public static void main(String[] args) {
		
		Archer a1=new Archer();
		Monster o=new Orc();
		Monster g=new Goul();
		a1.hunt(g);
		a1.hunt(g);
		a1.hunt(g);
		a1.hunt(g);
		a1.hunt(g);
		a1.showData();
		g.showM();
		
		
		
		
		
		
		
	}

}