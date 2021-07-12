package collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lotto3 {
	public static void main(String[] args) {
		// 로또 복권 당첨 시뮬레이터 만들기
		// 1.당첨번호 6개 뽑기
		// 2.추첨번호 6개를 뽑는다
		// 3.당첨번호와 추첨 번호를 일치하면 반복 중지
		// 4.3에서 일치 않으면 반복횟수를 1더하고 다시 추첨번호6개 뽑아서 비교 일치여부검사

		int count = 0;

		List<Integer> lotto = new ArrayList<>();
		List<Integer> getNums = new ArrayList<>();

		int getNum = 0;
		while (lotto.size() != 2) {
			getNum = (int) (Math.random() * 45) + 1;
			if (!lotto.contains(getNum)) {
				lotto.add(getNum);
			}
		}
			Collections.sort(lotto);
			System.out.println("추첨된 번호 : "+lotto);

		while(!lotto.equals(getNums));{
		count++;
		getNums.clear();
		while(getNums.size() !=2) {
			 getNum =(int)(Math.random()*45)+1;
			if(!getNums.contains(getNum)) {
				getNums.add(getNum);
			}
		}
		Collections.sort(getNums);
		System.out.println("이번에 뽑힌 번호 : "+getNums);
		}
		System.out.println("추첨번호 : "+lotto);
		System.out.println("당첨번호 : "+getNums);
		System.out.println("총 로또 복권을 : "+((long)count*1000)+"원을 샀습니다.");
	}

}
