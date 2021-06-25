package pakage04;

public class EnhancedForLoop02 {
	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적 입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62 , 42 , 68 , 31 , 80 , 77 , 45
		// com = 10 , 28 , 39 , 74 , 65 , 90 , 98
		// 위 3개의 명칭으로 array를 만든다음
		// 과목별 평균점수를 enhanced for문을 이용해 구한다음 출력

		
		int[] array1 = { 96, 23, 52, 82, 72, 31, 58 };
		int[] array2 = { 62, 42, 68, 31, 80, 77, 45 };
		int[] array3 = { 10, 28, 39, 74, 65, 90, 98 };

		int mathSum = 0;
		int engSum = 0;
		int comSum = 0;

		for (int math = 0; math < array1.length; math++) {
			mathSum += array1[math];
		}

		System.out.println("수학 평균 : " + mathSum / array1.length);

		for (int eng = 0; eng < array2.length; eng++) {
			engSum += array2[eng];
		}

		System.out.println("영어 평균 : " + engSum / array2.length);

		for (int com = 0; com < array3.length; com++) {
			comSum += array3[com];

			// for(int com : array3){ 이게 안되는 이유는 이렇게 될시 com이 10 28 74 등이 오는거임 따라서
//			     comSum += array3[com];  요 com 자리에 숫자 10 28등이 오게 되서 오류가 뜸!~!!
//	                쓰려면 밑에 처럼 해야함!!com 에 값이 오기 때문에~
//			for (int com:array3 ) {
//				comSum +=com;  }
//			System.out.println("컴퓨터 평균 : " + comSum / array1.length);
		}

		System.out.println("컴퓨터 평균 : " + comSum / array3.length);

	}

}
