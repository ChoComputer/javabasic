package garbage;

public class Item {
	public int num;
	
	public Item(int n) {
		num=n;
		System.out.println(num+"번 객체 생성");
	}
	
	// 소멸자 finallize(){}
	// 생성자는 객체가 생설 될 때 반드시 호출이 되고
	// 소멸자는 객체가 소멸 될 떄 호출된다.
	
	protected void finallize() {
		System.out.println(num+"객체 삭제");
	}
// 이파트는 신경 쓰지 않아도 됨
}
