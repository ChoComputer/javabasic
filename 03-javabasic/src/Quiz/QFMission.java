package Quiz;

public class QFMission {
	public static void main(String[] args) {
		//// 19*19단 만들기

		int gunum;

		for (gunum = 1; gunum < 20; gunum++) {
			for(int i=1; i<20;i++) {
				System.out.printf("%2d*%d=%3d// ",gunum,i,gunum*i);
				
			}System.out.println();
			
		}
	}

}
