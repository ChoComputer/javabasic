package date210623.method;

public class Test {

	private int height;
	private int weight;

	// 생산자
	public Test() {
		// getter setter 상관없음
		// setter은 어차피 변수를 넣을거고 그렇게 되서 값이 변할꺼니까 생산자는 배경이라 생각하자
		// setter은 휘발성으로 값을 넣고 계산끝나면 날라감

		this.height = 180;
		this.weight = 80;
	}

	// getter 메인에서는 이 private된 getter값을 바라만 볼 수 밖에 없다.
	public double getterBMI() {
		// getter은 휘발성이라 void 안쓰고 자료형을 int 같은거 쓰나?
		return (this.weight / (this.height * 0.01 * this.height * 0.01));

	}

	// setter 값을 그때그떄 넣어서 값이 나오고 휘발됨
	public void setterBMI(int h, int w) {

		this.height = h;
		this.weight = w;

		System.out.println(weight / (height * 0.01 * height * 0.01));

	}

}
