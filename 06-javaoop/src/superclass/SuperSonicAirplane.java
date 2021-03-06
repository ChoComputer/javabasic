package superclass;

// 초음속 비행기는 비행기를 상속합니다.
public class SuperSonicAirplane extends Airplane {
	// 초음속 비행기도 일반 비행기처럼 속도를 사용함
	// 따라서 변수는 추가로 정의하지 않는다.

	public SuperSonicAirplane(int s) {
		// Airplane의 생성자는 상속되지 않는다.
		// 따라서 부모쪽의 생정자라는 의미로
		// super();를 사용하며 이 때 부모쪽에 넘겨줄 수치값도
		// 함께 받아서 처리
		super(s);
		// Airplane(300); 와 동일함 여기서 300은 Main2에서 넣은값임  부모를 나타낸거임!
		// 의미상 같은거지 저거를 대신 쓴다고 실행되지않음 오류뜸 슈퍼 대신 넣으면 c++에선된다.
	}

	public void fly() {
		// 일반 비행(부모클래스의fly)는 super.fly();
		// 를 이용하여 호출가능
		// 속도가 900이하 인 경우 일반비행모드를 호출
		// 속도가 900이상1300이하인경우 초음속비행
		// 호출하도록 로직 작성

		//답안지
		if(speed + 500<=900) {
			super.fly();
		}else {
			// 속도 900이상 1300이하인경우 초음속비행으로 호출
			if(speed+500>=1300) {
				speed =1300;
			}else {
				speed+=500;
			}
		System.out.println("초음속 비행 속도: " + speed + "km/m");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//겁나 고민했는데 틀린풀이
//		if (1300 <= speed + 500) {
//			speed = 1300;
//		}else if(900< speed+500) {
//			speed+=500;
//		}
//		System.out.println("초음속 비행 속도: " + speed + "km/m");
//                       // 이게 틀림 일반 비행모드에서도 나옴 개같은
		
//		if (900 >speed + 500) {
//			super.fly();
//		}

	}

}
