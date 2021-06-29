package interface1;

// 인터페이스 는 interface 선언을 사용합니다.
// 내부에는 상수 변수, 추상 메서드만을 선언할 수있습니다.
// 애초에 구현 (implements)을 전제로 설계되기 때문에
// 일반변수, 메서드를 내부에 선언할 수 없습니다.
// 다형성은 인터페이스로 사용함 거의
public interface Vehicle {
	// 최대 연료량
	int MAX_GAS =100;
	
	// 탈 것 이라면 가지고 있을 공통적 기능을 전부추상 메서드로 작성
	//{
	// 실행문...
	// }
	// 부분 없이 작성 분완전하게
	
	public void accel();           // 가속
	public void breakSpeed();      // 감속
	public void reFuel();          // 주유
	public void showStatus();      // 계기판 조회
	

}
