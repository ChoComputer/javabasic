package superTest;

public class Sun extends SuperMom {

	// 상속시 자식이 부모를 선택 하는거임 현실이랑 다르게
	// extends SuperMom으로써 자식이 어느 부모를 지목할지를 보여줌
	// 부모자리에 자식을 넣을 수 있지만
	// 자식자리에 부모를 넣을 수 었다.
	
	public Sun() {
		super(5, 0, 50, 30);

	}

	public void Data() {
		//오버라이징으로 엄니상태창가져오고
		// 아들만의 data 추가
		System.out.print("아들");
//		System.out.println(arr[0]);
		super.Data();

	}

}
