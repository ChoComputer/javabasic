package package02;

public class Birnary02 {public static void main(String[] args) {
	// 비교 연산자는 크게 대소비교와 단순 비교로 나뉩니다.
	// 단순비교는 == , != 이며 모든 자료형간 비교가 가능합니다.
	// 대소비교는 > ,< ,<= ,>= 이며
	// 숫자끼리만 비교가 가능합니다.
	//컴퓨터는 비교연산자를 명제로 인식하여
	// 참(true) 거짓(false)를 판단하여 결과를 보여줍니다.
	System.out.println(3>5);
	System.out.println(12<=12);
	System.out.println('a'>=13); 
	// 아스키 코드 라됨 a==97
    //System.out.println('a'<="13");
	// 문자취급한 13 이라 비교안됨
	System.out.println("a" != "b");
	System.out.println("a"=="a");
	// 문자열이라 숫자(아스키코드)로 비교한게아님
	System.out.println(5==5.0);
		
}

}
