package Static2;

public class Asean {
	// 중간 고사 기말고사 출석 조별과제 점수를 변수로 정의
	// 단 조별과제는 모든 객체가 공유하는 점수이며
	// 나머지는 개별객체가 가지는 변수임
	public int mid;
	public int fin;
	public int check;
	
	// public 시 일반메서드에서 score 조회가능
	// private시 출력이 안됨 static 내에서만 출력됨??? 이버전에서는 됨????? 이거 잘모르겟음 어쨌든 출력됨
	private static int mission=80;
	//static은 별도의 공간을 가지고 있다는걸 염두해두자

	// 생성자는 객체 생성시 중간고사 기말고사 출석점수를 받습니다.
	
	public Asean(int m,int f,int c) {
		this.mid=m;
		this.fin=f;
		this.check=c;
		
				
	}
	// showAseanInfo()를 정의
	// 이메서드는 중간고사 기말고사 출결 조별과제 성적을 콘솔에 출력
	
	public void showAseanIfo() {
		
		System.out.print(mid+",");
		System.out.print(fin+",");
		System.out.print(check+",");
		System.out.println(mission);
		
	}


	// Main.java 생성 메인메서드 내부에 구성인원 최소 4인으로 생성

}
