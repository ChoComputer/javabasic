package string1;

public class String6 {
	public static void main(String[] args) {
		// substring() 은 인덱스 기준으로 앞 문자열을 삭제합니다.
		// 인덱스 번호를 두개 주면 처음 인덱스 번호~ 두번째 인덱스 번호 사이만 남겨줍니다.
		
		String str ="자바자바JSPJSP스프링스프링";
		String result=str.substring(5);  // 5번째의 인덱스 부터 시작한다는 의미
		System.out.println(result);
		
		result =str.substring(10,15);  // 15번부터 또 생략 직전이라고 생각하면 됨 직전까지만 나옴
		System.out.println(result);
		
		System.out.println(str.substring(5,9));
		
		
		
	}

}
