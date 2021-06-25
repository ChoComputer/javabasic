package constructor;

public class BasketballPlayer {
	
	public int height;
	public int jumpPower;
	
	//힙의 영역에 있는것! 힙은 태양이라 생각하자 공공재임 딴 폴더(패키지)에서도 쓸수있음 주소만 제대로 찍으면 
	
	
	public BasketballPlayer(int h ,int j) {

		height = h;
		jumpPower = j;
		
	}
	
	public void dunkShoot() {
		
		if(height+jumpPower >=300) {
			System.out.printf("키 : %d , 점프력 : %d%n",height,jumpPower);
			System.out.println("덩크슛에 성공했습니다");
			System.out.println("-------------------");
		} else if(0<height+jumpPower) {
			System.out.printf("키 : %d , 점프력 : %d%n",height,jumpPower);
		   System.out.println("골대에 닿지 않습니다");
		   System.out.println("--------------------");
		}else {
			System.out.println("다시 한번 입력해 주세요\n");
		}
		
	}
}

