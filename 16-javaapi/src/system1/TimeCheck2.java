package system1;

public class TimeCheck2 {
	public static void main(String[] args) {
		// try catch 구문의 소요시간을 구하기
		
		
		long start=System.currentTimeMillis();
		
		String a= "ditke"; 
		
		try {
			int result = Integer.parseInt(a);
			System.out.println(a);
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해라");
		} finally {
			System.out.println("코드 끝");
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
