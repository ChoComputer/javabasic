package bStructure;

public class DogClass {
	public static void main(String[] args) {
		
		Dog a=new Dog();
		
		a.name="왈숙이";
		a.age=3;
		a.type="진돗개";
		a.eat=true;
		
		Dog b=new Dog();
		
		b.name="치타";
		b.age=6;
		b.type="포메리안";
		b.eat=true;
 
		Dog c=new Dog();
		
		c.name="록타";
		c.age=20;
		c.type="나후아";
		c.eat=false;
		
		a.getInfo();
		b.getInfo();
		c.getInfo();
		
		
		
	}

}
