package day0529.loop;

public class Test03 {public static void main(String[] args) {
	/*
	 * 반복문 빠져나오기 (나머지 반복처리 구문을 스킵함)
	 * break
	 * 
	 * 현재 진행중인 반복 처리 구문만을 스킵함
	 * continue
	 */
	for (int i =1; i<11; i++) {
		if(i == 5 ) {   //==을 따른 <>등으로 바꿔서 확인하기
			break; // 즉시 반복문을 멈춰라
		}
		System.out.println(i);
		
	}
	System.out.println("break반복 빠져나옴");
	
	for (int i =1; i<11; i++) {
		if(i == 5 ) {    //==을 따른 <>등으로 바꿔서 확인하기
			continue; 
		}
		System.out.println(i);
	}	
		System.out.println("continue반복 빠져나옴");
	
	
	
}

}
