package Quiz;

public class Qcountinue01 {
	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적 입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62 , 42 , 68 , 31 , 80 , 77 , 45
		// com = 10 , 28 , 39 , 74 , 65 , 90 , 98
		// 각 과목별 평균 점수를 내되, 합격자 평균만 내주기 (탈락자 ㄴㄴ)
		// 합격 점수는 60점 이상

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/////////////////////////////생각선////////////////////////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int[] math = { 96, 23, 52, 82, 72, 31, 58 };
		int[] eng = { 62, 42, 68, 31, 80, 77, 45 };
		int[] com = { 10, 28, 39, 74, 65, 90, 98 };

		int mSum = 0;
		int eSum = 0;
		int cSum = 0;
//      범위가 수학 영어 컴퓨터는 같은 메인에 동등하게 잇기 때문에 세개로 나눌필요없이 total을 각각 쓸수있음  int toal=0; 이거로 하나만
//      만들면 각자 알아서 쓸수있음 3개나 만들 필요 없다 새개는 동등하기때문에
		int mcount = 0;
		int ecount = 0;
		int ccount = 0;
//      이것도 동일하게 int count=0; 으로 다 각기 쓸 수 있음
		for (int m : math) {
			if (m < 60) {
				continue;
			} else {
				mSum += m;
				mcount += 1;
			}
			
		}
		System.out.println("수학의 합격자 평균은 " + mSum / mcount);

		for (int e : eng) {
			if (e < 60) {
				continue;
			}
			eSum += e;
			ecount++;

		}
		System.out.println("영어의 합격자 평균은 " + eSum / ecount);

		for (int c : com) {
			if (c < 60) {
				continue;
			}
			cSum += c;
			ccount++;

		}
		System.out.println("컴퓨터의 합격자 평균은 " + cSum / ccount);

	}

}
