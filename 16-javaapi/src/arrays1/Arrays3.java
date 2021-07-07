package arrays1;

import java.util.Arrays;

public class Arrays3 {
	public static void main(String[] args) {
		// Arrays.copyOfRange()는 copyOf()와 비슷하지만
		// 시작지점까지 같이 지정해서 복사할 수 있습니다.
		// 단 이경우도 시작지점은 입력한 값으로,
		// 끝 지점은 입력한 값 직전까지로 잡힙니다.
		int[] arr= {0,1,2,3,4,5,6,7,8,9,10};
		int[] arrCopy= Arrays.copyOfRange(arr,3,7);   // 3번 부터 7번 직전까지임
		System.out.println(Arrays.toString(arrCopy));
		System.out.println(arrCopy);
		
		int[] arrCopy2= Arrays.copyOfRange(arr,5, 15);
		System.out.println(Arrays.toString(arrCopy2));
		
	}

}
