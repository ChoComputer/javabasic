package accessmodifier2;

public class Main {
	public static void main(String[] args) {
		
		// Parent 를 상속받은 Child 내부의 자료 조회
		Child child =new Child();
		
		//1.public 자료
		System.out.println(child.a);
		
		//2. protected 자료
		// 현재 Main.java와 !!같은 패키지 내부!!에 Parent, Child
		// 가 존재하므로 protected 접근가능
		// 자식 부모 로 !!상속!! 받아 가능 같은 패키지라 가능!! (c++에서는 상속일때만 가능 패키지 기능이 없다!!)
		System.out.println(child.b);
		
		//3. private 자료
		// 같은 소속이어야 가능함  가장 까다로움
		// c는 엄밀히 말하면 new Parent 소속임 new Child 소속이아님 
		// Parent내부에 선언되있음!! 그래서 Child에서 요구하면 안보여줌
	
	//	   System.out.println(child.c); 
		
		Parent child2 = new Parent();
		System.out.println(child2.getter());  //getter연습용
		
//		System.out.println(child.c);
//		안되는 이유 : Main 에서 직접 c를 요구한 거라서 안되는 거임
		
		//4. default 자료
		System.out.println(child.d);
		
		// Child에게 a~d 보고싶다고 요청하고 Child에서 판단함 
		
//			System.out.println(child.c);   // child에서 c 선언 및 초기화 한뒤 출력 확인용
		
	}

}
