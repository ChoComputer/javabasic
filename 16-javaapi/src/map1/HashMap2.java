package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
	public static void main(String[] args) {
		// 식당 매뉴판 만들기
		// key는 음식이름 , value는 가격(정수) 로 저장
		// 메뉴는 5개 이상
		// 메뉴 3개 조회하여 출력
		
		HashMap<String,Integer> menu =new HashMap<>();
		
		menu.put("치킨",15000);
		menu.put("통닭",12000);
		menu.put("골뱅이",8000);
		menu.put("사이다",2000);
		menu.put("맥주",5000);
		
		System.out.println(menu);
		
		System.out.println("치킨 : "+menu.get("치킨"));
		System.out.println(menu.get("맥주"));
		System.out.println(menu.get("골뱅이"));
		
	
		
	}

}
