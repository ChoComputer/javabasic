package date210623.method;

public class GetBMI {
	//getBMI메서드 생성
	//리턴자료형은 double
	// 입력은 double height, double weight를 받습니다.
	//bmi 공식은 몸무게/키(미터)^2 입니다.
	//175cm경우 1.45M입니다.
	// 메서드를 여기에 작성한다음 메인내부에
	//getBMI를 syou~으로 감싸서 결과나오게 하기
	
		
	
	public static double getBMI (double h, double w) {
		
		
		return w/(h*0.01*h * 0.01);
		
		
	}
	
	public static void main(String[] args) {
		
				
		System.out.println(getBMI(175,64));
		
		//getter
		Test t=new Test();
		System.out.println(t.getterBMI());
		// getter은 어차피 값이 정해져있고 손댈수 없고 
		// main은 바라만볼수밖에 없는거임
		
		//setter
		Test t1=new Test();
		t1.setterBMI(160,80);
		
	}

}
