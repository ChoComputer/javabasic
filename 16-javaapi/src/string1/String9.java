package string1;

public class String9 {
	public static void main(String[] args) {
		
		// 요건 많이씀
		
		// 기본적으로 문자열은 참조형 변수 이기 때문에
		// 비교를 할 때 주소값 비교가 일어 납니다.
		String a = new String("테스트1");
		String b = new String("테스트1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);  // 문자는 같은 문자이지만 주소값이 다르기 때문에 같지 않다라고 인식을 함
		// .equals() 를 이용하면 주소값이 아닌
		// 문자열간 비교가 가능함
		
		System.out.println(a.equals(b));
	}

}
