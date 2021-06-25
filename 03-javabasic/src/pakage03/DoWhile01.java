package pakage03;

public class DoWhile01 {
	public static void main(String[] args) {
		// do~while문은 while문과 기본적으로 똑같습니다.
		// 단, 첫 번째 바퀴만큼은 조건 비교 없이 바로 실행하고
		// 이후  두 번째 바퀴 부터 비교를 통해 추가 실행여부를 결정함.
		
		int a= 1;
		
		do {//do구문부터 씀
			a +=2;
			System.out.println("a는 5보다 작다?");
		}while (a<10); // 일반 while문과 달리 마지막에 ; 가 붙는다!! 
			
		
	}

}
