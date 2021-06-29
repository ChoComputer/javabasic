package Package01;

public class DataString {
	public static void main(String[] args) {
		/*
		 * 문자 자료형은 크게 두가지로 단일문자인 char ('문자') 문자 배열인 String ("문자열") 이 존재합니다. 그러나 보통
		 * String을 사용합니다.
		 */
		byte a = 'a'; // 영어 대소문자는 총 52개 1byte로 표현 가능 0 == 48 / A == 65 / a == 97 / Enter = 13
//		 char a = 'a';
		String b = "문자열입니다.";
//		char c = "문자열"; // 문자열과 단일문자는
//		String d = 'd'; // 서로 다른 자료형으로 간주됨
		int c = '3'; // 아스키 코드 사용한거 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
