package string1;

public class String2 {
	
	public static void main(String[] args) {
		// indexOf() 는 특정 문자열의 시작 인덱스 값을 반환합니다.
		// 만약 특정 문자열이 포함되어 있지 않다면 -1을 리턴합니다.
		String tomato="tomato";
		int get =tomato.indexOf("to");  // to 가 몇번째에 있음?
		System.out.println(get);
		
		
		// 중복 문자 처리
		get =tomato.indexOf("to",1);  // 숫자는 몇번부터 조회할지를 정하는 거임 0번이아닌 1번부터 찾아라~ 란의미
		System.out.println(get);
		
		
		// 없는 문자열 처리
		get=tomato.indexOf("banana");
		System.out.println(get);
		
		
		
		
	}

}
