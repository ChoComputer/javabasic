package exception3;

public class Exception3 {
	// 다중 catch 블럭 내부 에서 여러유형의 예외가 발생할 수 있을 때
	// 각각 예외 유형을 다르게 처리할 떄 사용합니다.
	// 이때 catch 구문을 여러 번 사용할 수 있습니다.
public static int [] number = {1,2,3,4,5,0};
	public static void main(String[] args) {
		//int [] number = {1,2,3,4,5,0};   // 혹은 여기에 잇거나 같은거임 어차피 이메인만 쓸거고..
	
	try {
		for (int i=0; i<6; i++)		{
			System.out.println(number[i]);
		}System.out.println(number[4]/number[5]);
	}catch(ArrayIndexOutOfBoundsException a) {
		System.out.println("범위를 벗어난 인덱스 번호를 입력했습니다.");  // i>number.length 로 배열 범위 밖까지 확장했을시 오류
	}catch(ArithmeticException ae) {
		System.out.println("0으로 나눌수 없습니다.");
	}catch(Exception e) {
		System.out.println("이외의 예외가 발생하였습니다.");  // 얘가 위에 있으면 오류뜸 왜냐하면 위에 잇는 범위를 다 포함 하는 거라서 얘가 
		                                               // 위에있으면 아래 좁은 범위의 것들은 실행이안되서임
	}

}
}
