package abstract1;

public class Main {
	public static void main(String[] args) {
		// Parent 타입을 직접 생성 불가 불완전하기때문에
		// new는 힙에 만든다는 의미(실제자료영역) 인데 Parent는 힙에 저장 불가능 스택엔 저장가능(주소만 남기니까)
//		Parent p1 =new Parent();
		
		// 단 Parent 를 상속받아 getA 메서드로 구체화시킨
		// Child 타입으로는 객체 생성 및 사용이 가능함
		Child c= new Child();  
//		Parent c =new Child(); // 얜 가능 Parent를 어디가면 볼수 있다는 표지판(스택)(주소) 역활만 하는거라 가능 
		c.getA();
		//추가로 오버라이딩 없이 상속받은 일반 메서드도 호출이 가능
		c.getInfo();
	}

}
