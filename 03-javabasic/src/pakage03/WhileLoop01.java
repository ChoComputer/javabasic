package pakage03;

public class WhileLoop01 {
	public static void main(String[] args) {
		// while문은 타겟이 되는 실행문을 반복해서 실행하는 구문
		// while문은 실행여부를 조건식 비교를 통해 결정함.
		// 한 번 실행하기로 결정 되면 모든 타겟 실행문을 실행
		// 실행이 끝나면 다시 while 구문으로 복귀함
		// 추가 비교를 통해 실행/탈출  여부가 결정됨
		
		int a=0;
		while(a <2){
			a +=1;
			System.out.println(a+" 번째 실행.");
		}
		System.out.println(a); 
		//돌고돌아 우선 a가 2가되면 while문은 작동안하지만(조건만족이안되서a<2) a는 2인상태이다
	
	}

}
