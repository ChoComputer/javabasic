package polymorphism;

// 부모 클래스를 Person으로 가지는 클래스
public class Student extends Person {

	private int grade;
	
	// super()을 이용해 초기화 하는 생성자 작성
	public Student(String n, int ag,int g) {
		// 부모쪽의 생성자에게 넘겨주기위하여 생성자 내부에 super()를 사용함
		// 자식쪽 생성자에 super(전달자료 1, 전달자료2,,,,,,); 를 사용하면 부모 생성자에게 전달이 된다.
//		super("메인에서 이게나온다 학생", 19); // Main에서 Utuber랑 비교하기 생성자에 기입해두면 Main에서 적어봣자임
		super(n, ag); 
		this.grade=g; 
	}
	// 상속받은 showPerson을 활용한 showStudent작성
	public void showStudent() {
		super.showPerson();
		System.out.println("grade : "+this.grade);
		System.out.println("--------------");
	}
	public void showPerson() {
		super.showPerson();  // super 해야 자기자신이 안됨 부모에있는거를 가져오겟다고 콕집어 말하는거임
		                     // super없으면 자기자신을 호출하는거라 22로갓다가 23가서 다시 22로 가는 무한 실행이됨 메소드가 종료되지 않아
		                     // 스택에서 메소드가 사라지질 않아서 남아있는데 계속 쌓여서 결국 스택공간이 터짐
		System.out.println("grade : "+this.grade);
		System.out.println("--------------");
	}
	
	// super.name 같은것도됨 일종의 getter임!!!
	

}
