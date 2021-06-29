package casting;

public class Main {
	public static void main(String[] args) {

		// Animal 타입은 어떤 자료형이건 받을 수있다.
		Animal c = new Cat("냥냥이", 4, 7);
		Animal d = new Dog(9);
		Animal a = new Animal("동물", 99);

		a.sit();
		d.hand();
		d.sit();
		c.sit();
		c.hand();
	//	c.jump();   // 이상황 에서는 자식만의 고유 메소드는 호출 불가능
//		d.bowWow();
		// 자식타입을 베이스로 만든 부모타입 변수는 
		//자식타입으로 강제로 바꿀수 있다.
		Cat cat=(Cat)c;
		// 원타입으로 돌려놓으면 원타입만의 메서드도 호출가능 오버라이딩 된것도가능임
		cat.Jump();
		Dog dog=(Dog)d;
		dog.bowWow();
		c.sit(); //오버라이딩 된거로 나옴~! 오버라이딩 것도 된다는거임
		
		//근본이 Animal인 경우는 다른 타입으로 변형이 안됨
		Cat cat2=(Cat)a;
		cat2.Jump();   //오류가 안떠 되는것같지만 출력하면 오류뜸
		c.sit();    // 이건 안됨 변형이 안된다 Animal은 애당초 캣을 가질수가없음 cat을 다 바꾸는듯
		

	}

}
