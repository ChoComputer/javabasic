package heapmemory;

public class StringComparison {
	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello";
		System.out.println(str1);
		System.out.println(str2);
		//자바에서는 문자열의 일부 부분만 변경할 수 없다.
		//str1[1]="a"; str1의 1번째 문자인 e를 a로 바꾸고싶다 인데 안됨 자바 ,파이썬에서는
		
		// str1 과 str2의 주소 비교를 위해서는 ==를 씁니다.
		// str1 과 str2의 문자 비교를 위해서는 .equals()를 씁니다.
		// str1 과 str2의 주소는 같다
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		// new 키워드로 생성시 내용이 같은 문자열도
		// 별개 공간에 저장이되어 주소가 달라짐
		
		String str3 = new String("Hello");
		System.out.println(str2.equals(str3));  // 문자는 같다
		System.out.println(str1== str3);  // 주소가 다르다
	    
		
		
	}

}
