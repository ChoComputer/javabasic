package buyandsell;

public class Seller {

	// 보유 최대 망고수
	// 보유금액
	// buyer의 망고수
	// buyer의 금액

	private int storeMango;
	private int storeMoney;

	public Seller(int sMg) {
		this.storeMango = sMg;
		this.storeMoney = 0;
	}
	
	public int getStoreMango() {
		return storeMango;
	}

	public void setStoreMango(int storeMango) {
		this.storeMango = storeMango;
	}

	public int getStoreMoney() {
		return storeMoney;
	}

	public void setStoreMoney(int storeMoney) {
		this.storeMoney = storeMoney;
	}

	public void SellMango(int sellMango) {
		if(sellMango>storeMango) {
			System.out.println("==============상점===================");
			System.out.println("망고를 "+sellMango+"개 구입 희망 하셨는데.");
			System.out.println("망고가 "+storeMango+"개 밖에 없어요.");
			System.out.println("ㅈㅅㅈㅅ 망고가 부족함. 우짜실레여?");
			System.out.println("=================================");
			return;
		}
		this.storeMoney += sellMango * 1000;
		this.storeMango -= sellMango;
		System.out.println("-----------------------------------");
	    System.out.println("망고를 "+sellMango+"개 만큼 팔았습니다.");
	    System.out.println("-----------------------------------");

	}

	// 상호작용
	// public void SellMango() {
//		
//		this.storeMoney=getMango()*1000;
//		this.storeMango=sMg-getMango()
//	}

	public void showSeller() {
		System.out.println("---------------------------");
		System.out.println("[[과일상점]]");
		System.out.println("상점 보유 망고 수 : " + storeMango + "개");
		System.out.println("상점 보유 금액 : " + storeMoney + "원");
		System.out.println("---------------------------");
	}

}
