package buyandsell;

public class AppleSeller {
	public int money;
	public int Apple;
	
	public AppleSeller(int a ) {
		this.Apple=a;
		this.money=0;
	}
//여기에 값대응시 왈가불가 하는게 조음 공급자 쪽이 좋은듯??
	public void SellApple(int sellApple) {
		if(sellApple>Apple) {
			System.out.println("==============상점===================");
			System.out.println("사과를 "+sellApple+"개 구입 희망 하셨는데.");
			System.out.println("사과가 "+Apple+"개 밖에 없어요.");
			System.out.println("ㅈㅅㅈㅅ 사과가 부족함. 우짜실레여?");
			System.out.println("=================================");
			return;
		}
		this.money += sellApple * 1000;
		this.Apple -= sellApple;
		System.out.println("-----------------------------------");
		System.out.println("[[사과상점]]");
	    System.out.println("사과를 "+sellApple+"개 만큼 팔았습니다.");
		System.out.println("상점 보유 사과 수 : " + this.Apple + "개");
		System.out.println("상점 보유 금액 : " + this.money + "원");
		System.out.println("---------------------------");
	    System.out.println("-----------------------------------");

	}
	
	
	
	
}
