package package02;

public class LogicalOperator02 {
	public static void main(String[] args) {
		// &&, || 는 short circuit(단축검정) 연산자 입니다.
		// &, | 와 똑같이 작동하되, 왼쪽 조건식만으로 최종결과가 확정되는 경우
		// 추가연산을 하지않는다
		System.out.println((1+3>4) && (0<3/0));
		System.out.println((5>4) || (0< 2/0));
		//왼쪽 조건문만으로도 전체 참거짓이 나와서 오른쪽 조건문을 계산할 필요가 없다.
		// &, | 하나일경우 결과가 나와도 양쪽 조건문 계산
		
	}

}
