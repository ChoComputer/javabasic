package accessmodifier3;

import accessmodifier2.Parent;
//accessmodifier2 에 있는  Parent를 상속 받기 위해서 사용

// Child2는 accessmodifier3 패키지 소속
// Parent는 accessmodifier2 패키지 소속으로 
// 부모자식간 클래스 소속이 다르다.
public class Child2 extends Parent {
	protected int e;

	// Child2의 getB 메서드는 Parent의 b에 접근합니다.
	// getB()와 같이 내부요소를 조회만 할수 있고
	// 수정은 할 수 없게 제한하는 메서드를
	// getter라고 합니다.
	public void getB() {
		System.out.println(b);
		// 직접적으로 메인에서 요구한게 아니고 같은 힙에 위치한 자식 Child2.getB에서 부모인 acc~2.Parent에 요구
	}
	// getter는 위의 getB()처럼 특정 변수의 수치를
	// 콘솔에 찍어주는 유형도 있지만
	// 좀더 많이 사용 하는 유형은 해당 변수의 값을
	// return 구문을 이용하여 호출 위치로 가져다 두는 형태를 많이씀
	// int를 리턴자료로 가지는 getBInt()를 추가로 아래에 작성
	// Main2에서 getBInt()를 이용해 조회한 값을 콘솔에 출력
	
	public int getBInt() {
		return this.b;
	}

	// b변수의 값을 변경 할수 있도록 도와주는
	// setB(int)메서드 작성
	// b값은 음수가 될수 없다.

	public void setB(int B) {
		// setter는 사용자의 선택폭을 제한할때 사용함.
		if (B >= 0) {
			// B(메인에서 주입받은 숫자)가 0이상일때는
			// 주입받은 B값을 this.b(acce~2.Parent의 b)대신에 쓴다는거임
			// 휘발성임 다른 숫자 들어가면 바뀌는 휘발성 숫자
			this.b = B;
			System.out.println(B);
		}
	}


}
