package polymorphism.game;

public class Main {
	public static void main(String[] args) {
		
		Person a1=new Archer();
		Person w1 =new Warrior();
		Monster o=new Orc();
		Monster g=new Goul();
		Monster t=new Troll();
		
		
		w1.hunt(t);
		w1.hunt(t);
		w1.hunt(t);
		w1.hunt(t);
		w1.Skill(t);
		w1.hunt(t);
		w1.showData();
		t.showM();
		
		
		
		
		
		
		
	}

}
