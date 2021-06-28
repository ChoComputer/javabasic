package casting;

public class MainInstanceof {
	
	
	public static void main(String[] args) {
		Animal c1= new Cat("냥냥이",3,9);
		//현재 Animal 타입인 c1의 근본자료형이 Cat인지 검사
		System.out.println(c1 instanceof Cat);
		//현재 Animal 타입인 c1의 근본자료형이 Dog인지 검사
		System.out.println(c1 instanceof Dog);
		//현재 Animal 타입인 c1의 근본자료형이 Animal인지 검사
		System.out.println(c1 instanceof Animal);
		//파라미터로 넣었을때 받을 수 있는지 없는지로 보면됨
		// 간혹가다 쓰임 이런 키워드가 있다 정도로 알아두기
		
		
		
		
		
	}

}
