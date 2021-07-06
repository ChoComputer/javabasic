package stringbuilder1;

public class Builder1 {
	public static void main(String[] args) {
		// StringBuilder 는 String 클래스와 로직 차이로 인해
		// 속도 개선이 되었습니다. 일부 기능은 String 의 기능과 겹칩니다.
		StringBuilder a =new StringBuilder("abefgh");
		
		// 2번 이후의 모든 자료를 다 1칸씩 밀고 확보된 공간에 "cd" 입력
		a.insert(2,"cd");
		
		System.out.println(a);
		System.out.println(a.insert(2,"cd"));
		System.out.println(a);
		
		
	}

}
