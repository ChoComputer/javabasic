package bjavaStructure;

public class Main {
	public static void main(String[] args) {
		// personclass가 먼저만들고 요고임 ! 
		// Person 2명만들기

		PersonClass person1 = new PersonClass();
		PersonClass person2 = new PersonClass();
		// 정보 기입
		
		person1.name="골골";
		person1.age=3;
		person1.pNum="010-000-0000";
		person1.address="갈갈국";
		person1.glasses= true;
 
		person2.name="억억억";
		person2.age=7;
		person2.pNum="000-1110-0111";
		person2.address="냑냑국";
		person2.glasses= false;
		//정보를 조회하면
		
		person1.getInfo();
		person2.getInfo();
		// 뒤에 가면 peson1.getInfo에서 펄슨이 왜 붙는지 알게됨 펄슨 붙은거랑 안붙은거랑 다른거임!
		// 같은지역이라 getInfo(person1)을 안해도됨 자기 자신의 지역이니까 personclass꺼보면서 
		// 이해하자 헷갈린다 자기지역내라 소속명시를 안하는거임!
		
		
	}

}
