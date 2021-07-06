package stringbuilder1;

public class Builder8 {
	public static void main(String[] args) {
		// reverse()는 문자열을 인덱스 순으로 따졋을때
		// 역순으로 나열해 줍니다.
		StringBuilder str =new StringBuilder("zyxwvut");
		
		str.reverse();
		
		System.out.println(str);  // 단순히 배열을 거꾸로 해주는것뿐임 순서맞추거나 그런 기능은 없음
		
	}

}
