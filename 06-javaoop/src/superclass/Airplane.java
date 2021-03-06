package superclass;

public class Airplane {
	// 비행기는 속도를가짐
	public int speed;

	// 생성자는 속도를 입력한 값으로 맞춰줌
	public Airplane(int s) {
		speed = s;
	}
	// 요 Airplane 은 paksge6의 바스켓볼선수 에서 쓴방법
	// 얘네가없으면 Main1에서 a1.speed=300; 활용가능

	// fly()매서드를 수행하면 속도가 500붙는다.
	// 단 , 일반비행기를 속도가 900이상될수없다.

	public void fly() {
		// 속도를 조건식으로 체크 해서 최대 속도는 900을 못넘고
		// 최대속도 미만에서 500씩 더해주는 로직작성
		// 강사님이 푸신거 이런식으로 깔끔하게 할생각하자
		if (speed + 500 > 900) {
			speed = 900;
		} else {
			speed += 500;
		}
		System.out.println("시속" + speed + "km/h로 비행중.");

//		내가푼거
//		speed += 500;
//		if (900 > speed) {
//			System.out.println("시속" + speed + "km/h로 비행중.");
//		} else if (900 == speed) {
//			System.out.println(speed + "는 법정 최고속도입니다.");
//		} else {
//			System.out.println("최고속도라 더이상 추진이 불가능합니다.");
//		}
//		
	}
	// breakSpeed()메서드를 수행하면 속도가 100씩감속
	// 단 브레이크 연산의 최저선은 0이다

	public void breakSpeed() {
		// 속도를 조건식으로 체크 0미만으로 내려갈수 없다 100씩감소
		// 강사님이 푸신거
		if (speed - 100 < 0) {
			speed = 0;
		} else {
			speed -= 100;
		}
		System.out.println("감속결과 시속" + speed + "km/h입니다.");

		// 내가푼거
		// speed -= 100;
//		if (0 < speed) {
//			System.out.println("감속결과 시속" + speed + "km/h입니다.");
//		}else {
//			System.out.println("추진력이 0입니다.");
//		}

	}

}
