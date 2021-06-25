package thiskeyword;

public class Person {
	//사람의 정보를 여기에 기입합니다.
	public String name;
	public int age;
	public int money;
	public String major;
	
	// 생성자를 활용합니다.
	
	public Person(String name, int age, int money,String major) {
		
		this.name=name;
		this.age=age;
		this.money=money;
		this.major=major;
		
		//왼쪽내용은 class person 위의잇는거에 해당
		// this는 자기자신의 주소를 의미 자기자신의 ~ name..... 
		//자기자신이라는 것을 확실히하는것
		
	}
	
	
	// getInfo()를 이용해 조회함

	public void getInfo() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("소지금액 : "+ money);
		System.out.println("전공: "+ major);
	}
	
}
