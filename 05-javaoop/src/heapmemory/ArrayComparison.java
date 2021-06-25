package heapmemory;

import java.util.Arrays;

public class ArrayComparison {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1;
		int[] arr3 = {1,2,3,4,5};
		arr1[0] =10; //문자랑 다르게 일부 수정가능
		             // arr1 과 arr2는 동기화가 되어 주소 숫자가 다같다. arr3는 숫자가 같지만 새로운 주소가 가짐  
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		// 주소값을 보면 알수잇음
		
		//주소값이 아닌 전체 배열 데이터를 보고싶다면
		// Arrays.toString(배열); 문법을 사용합니다.
        System.out.println(Arrays.toString(arr1));				
        System.out.println(Arrays.toString(arr2));				
        System.out.println(Arrays.toString(arr3));				
		
	}

}
