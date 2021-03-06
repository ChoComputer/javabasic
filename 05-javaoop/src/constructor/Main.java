package constructor;

public class Main {
	public static void main(String[] args) {
		// constructor 패키지 내부에 소속된 Car를 호출할때는
		// 같은 영역이기 때문에 constructor.Car로 호출해도 되고
		// 그냥 Car 해도 됨
		// 다른 패키지의 Car를 호출할때는 앞에 패키지.Car로 주소를 정확히 해야함
		
		Car car1=new Car(0, 0, "아스라다");
		
		//자동차 정보조회
		car1.getInfo();
		car1.accelSpeed();
		car1.breakSpeed();
		
		// 같은 패키지 내부에 중복된 이름이 없는 외부클래스라고 해도 
		// 호출시에는 반드시 패키지명을 입력해야 호출이 된다~!
		//bjavaStructure.PersonClass p1= new bjavaStructure.PersonClass();
		
		// 두번째 방법은 아예 문서 상단에 import 구문을 이용하여 
		// 현재 패키지의 personClass는 bjavaStructure의 클래스 임을 명시하는 방법이 있다.
		// 명시 방법은 클래스명을 적고 ctrl +space 를 이용하여 자동입력을 하거나
		// 직접 import 를 적어주는 방법이 있다.
		// 그러나 이경우에 만약 동일 패키지에 같은 이름의 클래스가 잇을 경우는 가까운것이 적용됨 
		
		
		
		
	}

}
