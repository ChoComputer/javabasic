package abstract1;

// 추상 클래스.
// abstract 선언이 붙은 클래스는 new를 이용한 
// 객체 생성이 불가능하다.
// 자기자신을 new라는 키워드로 생성 불가능 Parent p= new Parent 이거 안됨
// 상속용으로만 만들은거임 이것들을 실행할시 오류가 뜨거나 원하는 대로 안되니까 애당초 못실행하게 가상키워드를 주는거임
public abstract class Parent {

	public int a;
	public Parent() {
		this.a=5;
	}
	
	// 추상 메서드 , 아래와 같이 실행문 없이 작성한다.
	// 실재가 없는 메서드 실행문이 없어도 가상이라 상관없다는 뜻
	// 추상 클래스 추상 메서드는 상호적으로 가는것 둘이 같이 있어야 함
	// 상속하려고 만든거니까 실제실행은 자식에서 해라 불완전해도 어차피 상속용 으로 눈가림하는거니까 상관하지말라~  는 식임 
	// 얜 자식이 오버라이딩 반드시 무조건 해야함
	public abstract void getA();
	
	// 추상 클래스 내부의 일반 메서드는 그냥 평범하게 작성
	// 오버라이딩은 해도되고 안해도되고
	public void getInfo() {
		
		System.out.println("일반 메서드 입니다.");
		
	}
	
}
