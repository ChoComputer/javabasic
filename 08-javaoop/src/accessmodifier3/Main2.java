package accessmodifier3;

public class Main2 {
	public static void main(String[] args) {
		// 다른 패키지에서 상속받은 Child2를 확인해 보겠다.
		Child2 child2 = new Child2();

		// 1. public 접근 제한자
//		System.out.println(child2.a);
//
//		// 1-2. child2내부의 e값 변경및 접근
//		child2.e = -5;
//		System.out.println(child2.e);
//
////		//2. protected 접근제한자
////		// protected는 같은 패키지, 혹은 !!다른패키지라면 상속관계일때 접근가능!!
////		System.out.println(child2.b);  //이건안됨
		child2.getB(); // 조회가 가능한 이유
		child2.setB(8); //b값 수정가능 힙에서 영역이 같아서 간접적으로 요구하는거임 acc~2.Parent에서 상속받은 acc~3.Child2에게 메인이 부탁한거임
		                //메인에서 직접적으로 하는게 아님!
		
		System.out.println(child2.getBInt());
		// 이 형태를 가장 많이 씀

//		//3. default 접근 제한자
//		// 같은 package이면 접근가능
//		System.out.println(child2.d);

		// private 접근제한자
		// 얜 뭐 안되는게 당연하지
//		System.out.println(child2.c);

		child2.setB(5);
		System.out.println(child2.getBInt());
		
		System.out.println(child2.Tgetter()); // ascc~2.parent 에 있는건데 getter가안된다..?  자식이 우선이라그런가...? 
		                                      // 다이렉트로 가져오는거 실패

	}

}
