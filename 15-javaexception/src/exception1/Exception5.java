package exception1;

public class Exception5 {
	public static void main(String[] args) {
		//예외 발생케이스5.
		// 숫자베이스가 아닌 문자를 숫자로 바꾸려할때 에러 발생
		String a ="123qwe";   //123만 잇음 가능
		int result = Integer.parseInt(a);
		System.out.println(result);
		
		
	}

}
