package pakage04;

public class Method05 {
	
	public static void plus2(int c, int num) {
		
		System.out.println(c+num);
		int a = 1; //여기있는 a의 값을 void main에서 가져올수가 없다.
	}
	
	public static void main(String[] args) {
		// 중괄호 여닫는 내부를 "지역"이라 함
		// 중괄호가 닫히면 해당 "지역" 과 지역내 자료들은 모두 소멸
		
		plus2(10,20);
		//사용이 끝나고 데이터가 사라짐 c num의 값이 사라짐

//		System.out.println(c);
//		System.out.println(num);
//       위에 두개 실행 안됨  값이 사라졌기때문에 		

		int a=5;
		System.out.println(a);
	}

}
