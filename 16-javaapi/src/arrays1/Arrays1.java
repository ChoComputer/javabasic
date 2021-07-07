package arrays1;

import java.util.Arrays;

public class Arrays1 {
	
	public static void main(String[] args) {
		// 이진 탐색은 데이터가 오름 차순 으로 정렬 되어있으며 (배열의 절반을 잘라 절반에 위치한 값을 비교하여 탐색)
		// 배열 요소 내부에 중복되는 값이 없어야 최상의 성능을 보입니다.
		// 대신 조건을 모두 만족할 경우 속도가 가장 빠름
		
		// 정렬이 안된 상태의 배열을 탐색하지 못함
		int[]arr1= {5,7,6,1,3,9,0,12};
		
		int a= Arrays.binarySearch(arr1,0);
		System.out.println(a);
		
		// 정렬이 된 상태의
		
		int[]arr2= {0,2,4,5,6,7,8,9,11,12,13};
		
		int a1= Arrays.binarySearch(arr2,8);
		System.out.println(a1);
		
	}

}
