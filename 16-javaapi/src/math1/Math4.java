package math1;

public class Math4 {
	
	public static void main(String[] args) {
		
		// Math.random()은 0이상 1미만인 난수를 구해줍니다.
		double a =Math.random();
		System.out.println(a);
		
		// 범위를 제한하고 싶은경우(0이상6미만)
		int b=(int)(Math.random()*6);
		System.out.println(b); 
		
		
	}

}
