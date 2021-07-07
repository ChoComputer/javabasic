package math1;

public class Math3 {
	public static void main(String[] args) {
		// rint()는 현재 수에서 가장 가까운 정수를 실수형태로 구해줍니다.
		double a=3.500000000001;
		System.out.println(Math.rint(a));
		
		double b=-3.499999999999;
		System.out.println(Math.rint(b));
		
		// round() 역시 비슷한데 round()는 반올림 한값을 구해줍니다.
		System.out.println(Math.round(a));
		System.out.println(Math.round(b));
		
		
		
	}

}
