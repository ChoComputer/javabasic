package thiskeyword;

public class Main {
	public static void main(String[] args) {
		// this가 적용된 Person 생성하기
		// 생성시 Ctrl +space 누르면 입력하 요소 가 출력됨
		Person p1= new Person("나이하",40,4000,"외국어\n");
		p1.getInfo();
		
		//Person 객체 하나 임의로 생성
		
		Person p2=new Person("가나다",30,5024,"물리학\n");
		p2.getInfo();
	}

}
