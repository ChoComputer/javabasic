package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto1 {

	public static void main(String[] args) {
		// 로또 복권 추첨기 만들기
		// 로또복권 추첨기는 1이상 45이하의 범위에 겹치는 숫자 없이
		// 6개 숫자 뽑기
		// 순서를 정렬하여 출력하도록 만들기
		// ArrayList 의 정렬은 .sort() 대신
		// Collections.sort(리스트);를 이용해 정렬

		Random r = new Random();
		List<Integer> lottoList = new ArrayList<>();
		

		for (int i = 0; i < 6; i++) {

			int lottoNum = r.nextInt(45) + 1;
			lottoList.add(lottoNum);

		}
		Collections.sort(lottoList);
		System.out.println("추첨번호 : "+lottoList);
		System.out.println("2등 당첨 번호 : "+(r.nextInt(45)+1));

	}

}
