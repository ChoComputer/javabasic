package polymorphism;
// 오버라이딩 관련 패키지

public class Person {
	// 사람을 나타내는 클래스
	// 상속만을 목적으로 하는 클래스
	// Person 을 상속받은 자식들은 전부
	// Person 을 요구하는 자리에 대입될수있다.

	private String name;
	private int age;

	public Person(String n, int ag) {

		this.name = n;
		this.age = ag; 

	}
	// Person 클래스의 전체 데이터를 콘솔에 찍어주는 showPerson() 작성
	// Person 타입으로 호출했을때 유일하게 호출가능한 메서드
	// 이 메서드를 자식쪽에 오버라이딩 하면 부모타입으로도 자식쪽의 showPerson()을 호출할 수 있다.
	// 부모타입 자료형으로도 자식의 메소드 호출가능 c++언어는 이게안되서 버츄얼 어쩌구 로 가상상속을 해야함 자바처럼 오버라이딩 안됨

	public void showPerson() {
		System.out.println("===================");
		System.out.println("name : " + this.name);
		System.out.println("age : " + this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
