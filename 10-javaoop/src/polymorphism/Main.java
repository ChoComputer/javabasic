package polymorphism;

public class Main {
	public static void main(String[] args) {

		// 부모타입인 Person만으로 양쪽 자료형을 모두 처리가능
		Person a1 = new Utuber("유튜버", 30, 2000000);
//		Utuber a2=new Utuber("겜돌이",60,60000000);
		Person s1 = new Student("급식충", 10, 1);
		// 단 메서드는 Person을
		// 베이스 객체는 Person에 정의된 메서드만 호출가능
		a1.showPerson();
//		
//		a1.showUtuber();   //showUtber showStudent는 실행안됨 오류뜸
//		
		s1.showPerson(); // ctrl 클릭하면 Person쪽으로 가는데 가상공간인 Student의 showPerson을 거치는거임 메인출력해보면 다른것을 알수잇다.
							// a1.showPerson과 비교해보삼 Utuber의 showPerson 주석처리하고 비교해야함
//		s1.showStudent(); // Person타입으로는 둘다 있는걸 부를수 있다 Person타입에는 showStudent가 없어서 오류가뜸

		Person f1 = new FoodFighter("먹짱", 23, "햄버거");

		f1.showPerson(); 
		
		
	}

}
