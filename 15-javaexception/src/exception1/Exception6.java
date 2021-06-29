package exception1;

public class Exception6 {
	public static void main(String[] args) {
		// 예외 발생 케이스 6.
		// 상속관계가 있는 자료는 부모가 동일하다면 논리적으로는
		// 부모 자료형이 어떤 형태로든 자식자료형을 가질수 있기때문에
		// 부모 자료형에서 어떤 자료형으로도 형 변환이 가능하다.
		// 그러나 그것이 반드시 작동됨은 보장 하지 않음
		// Object자료형은 자바 모든 클래스의 부모 클래스이다.
		
		
		String str="3";
		Object obj=str;
		// 클래스 만들때 부터 부모클래스로 정해져있음 오브젝트는 최상위 부모임 모든자료형을 다받을 수가 있다.
		
		Integer integer=(Integer)obj;
		//


	
	
	
	
	}

}
