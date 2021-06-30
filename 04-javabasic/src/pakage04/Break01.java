package pakage04;

public class Break01 {
	public static void main(String[] args) {
		// break 문은 반복문 내부에서 실행될 경우 즉시 반복문을 종료시킵니다.
		// break 문은 중첩 반복문에서 사용시 전체 반복문을 종료 시키지 않고
		// break 문이 속해있는 영역까지만 종료시킵니다.
		
		int a=1;
		int [] arr =new int [8];       //{9,8,7,6,1,2,3,4,5,};
		arr[5]=1;
		for(int num:arr) {
			if(a==num) {
				System.out.println("1이 나와서 종료함");
				break;
			}
			System.out.println("이번 숫자는 "+num+".");
		}
		
	}

}
