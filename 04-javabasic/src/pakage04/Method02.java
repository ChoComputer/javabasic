package pakage04;

public class Method02 {
	
	public static int add2(int a) {
		return a+1;
	//	System.out.println(a+1);
	}
	
	public static void main(String[] args) {
		// 반환 자료가 void가 아닌 경우는 호출위치에
		// return문 오른쪽 자료를 그대로 갖다 놓습니다.
		// 자료를 반환하는것이 꼭 console창에 표시됨을 의미하지는 않는다.
		int b=add2(10); //호출위치 add2();
		System.out.println(b); 
		
	}

}
