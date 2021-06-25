package Package01;

public class DataDouble {
	public static void main(String[] args) {
		/*
		 * 실수 표현을 할때는 float, double 자료형을 씁니다. 기본적으로 실수 숫자만 작성하면 double 입니다. 
		 * 만약 float 으로
		 * 실수 숫자를 표현한다면 숫자 가장 오른쪽에 f 라고 적어줍니다. float 4바이트, double은 8바이트 입니다.
		 */
		float a = (float) 1.1; // f 없으면 오류뜸 (float)1.1 == 1.1f 두개의 표현이 같은 표현이라는 뜻임
								// 둘중 암거나써도 같은거
		double b = 1.1;
		System.out.println(a);
		System.out.println(b);

	}

}
