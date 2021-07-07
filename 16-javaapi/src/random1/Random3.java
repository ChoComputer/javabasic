package random1;

import java.util.Random;

public class Random3 {
	public static void main(String[] args) {
		// Random 클래스의 nextInt()는 나올 숫자범위를 지정할수 있습니다.
		// 바로 정수로 나오기 때문에 코드가 좀더 간결함
		Random random=new Random();
		//범위 입력을 안 하는 경우 그냥정수 아무거나 나옴
		int result = random.nextInt();
		
		System.out.println(result);
		
		// 따라서 정수 숫자 하나(n)를 파라미터로 넣어줘야 0 <= 결과값 < n 이나온다
		int result2=random.nextInt(5)+1;
		System.out.println(result2);
		
		
		
	}

}
