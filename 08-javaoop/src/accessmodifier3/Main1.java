package accessmodifier3;

import accessmodifier2.Child;

public class Main1 {
	public static void main(String[] args) {
		// 패키지가 다른 (accessmodifier2의) child 를 생성
		// 패키지가 다른곳의 것을 가져오는거라 import 실행
		
		Child child =new Child();
		
//		//1. public 접근 제한자
//		System.out.println(child.a);
//		
//		//2. protected 접근제한자
//		// acc~3에 Child class를 하나 만들면 이건 접근가능
//		System.out.println(child.b);
//		
//		//3. private 접근제한자
//		System.out.println(child.c);  // 이건 안됨
//		System.out.println(child.getter());   // acce~2.Parent 의 getter 로 접근한거 패키지가 달라도 된다!! 
//		
//		//4. default 접근 제한자
//		// 지역(package)이달라서 안됨
//		System.out.println(child.d);

		
	}
	

}
