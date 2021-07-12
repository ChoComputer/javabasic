package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String[] args) {
		// Map 자료형의 대표 자료형은 HashMap입니다.
		// 제네릭 내부에는<Key 자료형,Value자료형>으로 작성
		// HashMap으로 시작 해도 상관없음
		Map<String,String> map=new HashMap<>();
		
		map.put("cho","Java");
		map.put("hoon","JSP");
		map.put("hyun","V");
		System.out.println(map);
		
		// 자료조회시는 .get(키값)으로 조회합니다.
		// 무조건 키값을 넣어야함 value 값 넣어도 소용없음
		// 인덱스 번호도 존재하지 않는다.
		System.out.println(map.get("cho"));
		System.out.println(map.get(0));
		
		// 기본적으로 mpa 자료형은 조회도 Key중심으로 이뤄짐
		// .containsKey()는 해당 키값이 자료내에 존재하는지 확인합니다.
		System.out.println(map.containsKey("cho"));
		System.out.println(map.containsKey("V"));
		
		// remove 는 Key를 이용하여 Key=value 전체를 삭제합니다.
		map.remove("hyun");
		System.out.println(map);
		
		// .size()는 크기를 알려줍니다. 정수로 몇개의 key=value쌍이
		// 저장되있는지 알수있다.
		System.out.println(map.size());
		
	}

}
