package bjavaStructure;

public class PersonClass {
	// 사람정보를 Person 처럼 정의
	// 추가하고 싶은 특성 하나 더 더하기
	// 힙에 저장하는거임 메소드 없이
	public String name;
	public int age;
	public String pNum;
	public String address;
	public boolean glasses;
	
	//추가로 아까의 조회 메서드 생성
	// 클래스 내부에 생성할 때는 static필요 ㄴㄴ
	// 클래스는 자기 와 같은 지역에 있는 요소를 소속명시 없이 조회가 가능하다.
	
	public void getInfo() {// getInfo( PersonClass p) 안적는 이유는 같은 지역이라
				           //  getInfo가 누구꺼라는 거를 안지정해도됨
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(pNum);
		System.out.println(address);
		System.out.println("안경쓰니?? : "+glasses);
		
		// 위의 PersonClass와 같은 지역에 있기때문에 p.name으로 p를 표시 안해도됨
		// 여기의 name age는 같은지역의 name등을 말하는 거라 다른동네가아니라 name하면 같은
		// 지역의 name을 당연히 앎
	}
		
	
	

}
