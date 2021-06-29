package interface1;

// 인터페이스를 구현 (상속이라 말하지 않는다!) 하기위해서는 
// implements (extends 가 아님) 키워드를 사용
// 인터페이스 내부의 추상 메서드는 무조건 구형해 줘야함
public class Car implements Vehicle{
	// 자동차라면 가져야할 변수 설정
	// 현재 속도, 현재 연료량, 차주
	private int speed;
	private int gas;
	private String owner;
	
	
	
	// 생성자를 만들기 차주만 입력받고 나머지 요소는 현재속도 0, 연료량 100 으로 대입
	
	public Car(String o) {
		this.owner=o;
		this.speed=0;
		this.gas= MAX_GAS;
	}

	public void accel() {
		// 한번 가속시 속도가 10씩 늘어나도록
		// 연료는 한번에 1씩 소비
		// 속도제한은 200초과 안됨
		if(this.speed +10<= 200) {
			this.speed +=10;
			System.out.println("가자 아스라다!!");
		}else {
			this.speed=200;
			System.out.println("최대 속도입니다.");
		}
		this.gas -=1;  // 가속이 불가능 하던지 되던지 어차피 메소드 실행시마다 연료는 쓰는거임
	}

	
	public void breakSpeed() {
		// 한번 감속시 속도가 -10 속도는 0미만은 안됨 
		if(this.speed-10>=0) {
			this.speed -=10;
			System.out.println("감속 중입니다.");
		}else {
			this.speed=0;
			System.out.println("정지하였습니다.");
		}
		
	}

	public void reFuel() {
		// 연료를 다시 채울경우 30씩 채워줍니다.
		// 단 연료 최대값은 상수 MAX_GAS를 이용해서 측정해 주세요.
		if(this.gas+30 <= MAX_GAS) {
			this.gas +=30;
			System.out.println("연료가 들어간다 쭉주쭈쭈쭊쭈꾺쭈꾺");
		}else {
			this.gas=MAX_GAS;
			
			System.out.println("연료를 가득 주유 했습니다.");
		}
		
	}

	public void showStatus() {
//		System.out.println(this.owner +   this.gas +  this.speed);
		System.out.printf("차주 : %s\n속력 : %d\n연료 : %d\n",this.owner,this.speed,this.gas);
	}

}
