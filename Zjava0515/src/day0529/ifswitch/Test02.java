package day0529.ifswitch;

public class Test02 {
	public static void main(String[] args) {
		/*
		 * 조건 제어물 에서 참 거짓 일경우 각자 출력
		 * 
		 * if (참or거짓) {
		 *   참일경우
		 *   }
		 *   else {
		 *   거짓일 경우 처리 .. 참일경우 제외한 경우 나오는 값 else 혼자는 못씀 if랑 같이씀 . 위가 참이 아닐시 란 의미가 들어감
		 *      }
		 */
		
		int age =1;
		if (age >=18) { 
			System.out.println("투표가능합니다");
		}else { 
			System.out.println("투표가 안됩니다");
		}
		
	}

}
