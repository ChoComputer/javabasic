package overloading;

public class OverTest {

	private String a;
	private int b;
	
	// main 메서드가 없는 java class 파일에는
	// static을 붙이지 않는다.
	// 생성자 문법
	// 메서드 처럼 작성하지만, 리턴자료형을 기입하지 않고
	// 이름은 무조건 해당 클래스의 이름과 정확히 같게 만든다.
	// 오버라이딩에 비해 확연히 덜씀
	

	public OverTest() {
		this.a = "0";
		this.b = 1;
	}

	public OverTest(String a) {
		this.a = a;
		this.b = 2;

	}

	public OverTest(int b) {
		this.a = "3";
		this.b = b;

	}

	public OverTest(String a, int b) {
		this.a = a;
		this.b = b;

	}
	// 출력을 위해서 이게 있어야함 이거 못써서 Main쪽 출력오류났엇음
	// 이거 인지 잘해두자
	public void showData() {
		System.out.println("A의 값 :" +this.a);
		System.out.println("B의 값 :" +this.b);
		System.out.println("-----------------" );	}
	

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	

}
