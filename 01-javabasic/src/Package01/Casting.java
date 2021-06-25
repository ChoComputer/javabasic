package Package01;

public class Casting {
	public static void main(String[] args) {
		/*
		 * 데이터의 크기 byte(1) < short(2) < int(4) < long(8) < float(4) < double(8) 강제 형 변환
		 * 서로 다른 자료형 간에는 원래 연산이 불가능함. 
		 * 그렇지만 편의상 컴퓨터가 자동으로 자료형을 
		 * 보정하여 주는 경우가 있는데 이것을 자료형 변환이라고 함 
		 * 자동 형 변환인 promotion과 강 제형 변환인 casting 이 있다 
		 * 자동형 변환은 작은범위를 큰범위에 맞출때 발생하고
		 * 강제형 변환은 큰 데이터를 작은 범위에 맞출때 사용합니다.
		 */

		int a = 5;
		double b = 7.12;
		System.out.println(a + b);  //2진수로 표현할수 있는 12.12에 최대한 가까운수
		// (자동) int -> double
		System.out.println(a + (int) b);
		// (강제) double -> int
		byte c = (byte) 85469822653L;//L 붙여서 Long으로 변환시킨거임
	    System.out.println(c);

	}

}
