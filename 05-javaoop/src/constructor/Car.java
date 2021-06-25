package constructor;

public class Car {

	// 자동차 속성(변수)(상태)

	public int gas;
	public int speed;
	public String owner;

	// 자동차 생성자 (new 키워드로 자동차 생성시 실행될 메서드)
	// 리턴타입 기입 ㄴㄴ
	// 클래스 이름인 Car로 메서드명 정하기
	// 생성시 자동으로 호출되기 때문에 무시하고 넘어갈수가 없다.
	// 생성자는 이름이 고정됨 여기서는 class명인 Car임
	public Car(int g, int s, String o) {// Car()면 그냥 실행됨 지정하는게 없으니까 g s o 넣으면 이 정보들을 넘겨라
										// 정보가 없으면 오류가 난다! 정보 기입시 g s o 하나 라도 없으면 기입이 안됨
										// 까먹고 빼먹고 올리는게 불가능해짐
	                                    // public 없어도 작동가능 나중에 다시생각
		// g s o 정보 변수에 대입
		gas = g;
		speed = s;
		owner = o;

		//System.out.println("자동차 생성 완료!!!");
		//System.out.println("연료: " + gas + ", 속도: " + speed + ", 주인: " + owner);
         // 이렇게 하면 밑에 getInfo처럼 여러거 안적어도됨 한방에 됨!
		 // a.name="sdf"; a.age=3; ....... 이렇게 따로 안적어도됨 편하게 (sdf,3,....) 간단히됨
		// 생산자와 동사 메소드들을 같은 Class 에 묶는다고 보면 좀 편함
	}

	// 자동차 동작 추가
	public void getInfo() {
		System.out.println("현재 연료량: " + gas);
		System.out.println("현재 속도: " + speed);
		System.out.println("현재 주인: " + owner);
		System.out.println("-----------------------");
	}
	
	// 자동차 운전 기능 추가하기!!
	public void accelSpeed() {
		gas -=2;
		speed += 10;
		getInfo();
	}
	// 자동차 브레이크 기능 추가하기
	public void breakSpeed() {
		speed -=20;
		
		getInfo();
		
	}
	
}
