package string1;

public class String8 {
	public static void main(String[] args) {
		// trim()은 공백이 아닌 문자가 시작하기 직전 모든 지점과
		// 공백이 아닌 문자로 끝난 이후 지점의 모든 공백을 제거합니다.

		String str = "                 Hello   Java       ";
		System.out.println(str.trim());
		System.out.println(str);

		// replace()를 이용해서 공백 전체를 없애보세요.
		String result = str.replace(" ", "");
		System.out.println(result);

		// trim()과 replace()를 이용해 단어사이의 공백 한칸만 남기기
		System.out.println(str.trim().replace("  ", ""));
		// 빈칸의 짝 홀수 에 따라 한계가 있음 명령을 연달아 걸수가 있다 왼쪽에서 오른쪽으로 실행 "메서드 체이닝" 이라 부른다.
	}

}
