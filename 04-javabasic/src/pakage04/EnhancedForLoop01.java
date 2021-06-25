package pakage04;

public class EnhancedForLoop01 {
	public static void main(String[] args) {
		// 향상된 for 문은 반복문 진행시 타겟으로 배열을 넣는다.
		// 이 경우 반복 실행 횟수는 배열의 내부요소 갯수만큼이다.

		int[] arr1 = { 100, 211, 339, 475, 591 };

		for (int a : arr1) {
			System.out.println(a);
		}  
		// 위 아래 동일한 구문임  but 위는 a에 100 211 339 475 가 다이렉트로 들어간다는의미  밑의 arr1[i]는 i에 0~ 이런 개들어가는거임
		
		System.out.println("------------------");
		
		for(int i=0; i<arr1.length;i++) 
			// 유지 보수적 측면으로 arr1.length는 arr1주소의 배열수 를 의 함 즉 int []arr1 에 변동이 있을시  그게 바로 반영이됨
		{
			System.out.println(arr1[i]);
		}

	}

}
