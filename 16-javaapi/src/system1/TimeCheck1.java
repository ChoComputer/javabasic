package system1;

public class TimeCheck1 {
	
	public static void main(String[] args) {
		// currentTimeMills의 자료는 long 형에 저장함
		// 시작 지점 
		long start =System.currentTimeMillis();
		System.out.println(start);
		
		// 시간 잴 실행문
		long all=0;
		
		for(int i=0; i<2000000000;i++) {
			all +=i;
		}
				
		// 끝나는 시점
		long end = System.currentTimeMillis();
		System.out.println(end);
		// 소요시간 츨정  시차 구함
		
		
		
	}

}
