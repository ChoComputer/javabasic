package collection1;

import java.util.ArrayList;
import java.util.List;

public class Lotto2 {
	public static void main(String[] args) {
		// List 역시 참조형 변수 이기 때문에 비교시 주소값 끼리 비교합니다.
		// 따라서 단순 == 비교가 아닌 리스트1.equals(리스트2)
		// 를 이용해 주소값이 아닌 주소값으로 이동했을때 나온 실제 자료 비교를
		// 해줘야 로또 복권 추첨 시뮬레이터를 만들 수 있다.
		// equals는 내부 요소 순서까지 고려해서 true/false를 판단.
		
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		System.out.println("주소값 비교 : "+(l1==l2));
		System.out.println("내부 요소간 비교 : "+(l1.equals(l2)));
		
		// l1 과 l2에 각각 요소 입력하되, 순서에 따른 결과 확인
		l1.add(1);
		l1.add(2);
		l2.add(2);
		l2.add(1);
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println("---------------------------------");
		// l1,l2,비교
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l1.equals(l2));
		
		
	}

}
