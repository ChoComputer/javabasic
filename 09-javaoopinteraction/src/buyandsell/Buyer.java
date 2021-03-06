package buyandsell;

public class Buyer {
	
	
	
	
	
	// 구매자
	// 구매자는 돈 , 망고 갯수를 멤버 변수로 가짐
	// private로 처리

	// 생성자는 (int money)를 받아 돈을 초기화함
	// 망고는 자동으로 0을 대입

	// BuyMango는 망고를 산다.
	// (int mango)로 망고 갯수를 입력받으면 , 망고 *1000만큼 돈을 차감후 갯수 증가

	// ShowBuyer은 구매자 상태를 보여줌
	// money mango 수치를 콘솔에 찍어준다
	

	private int money;
	private int mango;

	public Buyer(int m) {
		this.money = m;

	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMango() {
		return mango;
	}

	public void setMango(int mango) {
		this.mango = mango;
	}

	public void BuyMango(int mg,int ap, Seller s,AppleSeller a) {
		// Seller s 는 Main1에 있는 Seller s =new Seller(); 로 Seller.class의 변수들을 가져온다고 생각하자
		// 현실에서 망고를 구매할 때 가게어서 구매자를 고르는게 아니라구매자가 가게를 고르듯이
		// Seller 변수를 Buyer가 고를 수있도록 파라미터 설정을 합니다.
		// 이경우 망고를 파는 Seller바께 못씀 1:1만됨 
		a.SellApple(ap);  // 보니까 상점에다가 밑의 금액 왈가불가를 적는게 조은듯

//		s.SellMango(mg);   // 밑에꺼 대신 사용 가능 상점에 만들어 놓는게 좋음
		if (money < mg * 1000 || s.getStoreMango() < mg) {
			System.out.println("===============================================================");
			System.out.println("망고를 " + mg + "개 구입 희망 하셨는데.");
			if (money < mg * 1000) {
				System.out.println(mg + "개는 " + mg * 1000 + "원 입니다.");
				System.out.println("구매자의 현재 보유 금액은  " + money + "원 가지고 있습니다.");
				System.out.println("금액이 " + (mg * 1000 - money) + "원 만큼 부족합니다.");
			}
			if (mg > s.getStoreMango()) {
				System.out.println("상점에는 " + s.getStoreMango() + "개만 보유하고 있어 수량이 부족합니다.");
			}
			System.out.println("===============================================================");
			return;
		} else {
			mango += mg;
			money -= mg * 1000;
			s.setStoreMango(s.getStoreMango() - mg);
			s.setStoreMoney(s.getStoreMoney() + mg * 1000);
			System.out.println("************현재상황****************");
			System.out.println("망고 " + mg + "개를 구매하였습니다.");
			System.out.println("현재 손님 망고 갯수 : " + mango);
			System.out.println("현재 손님 보유 금액 : " + money);
			System.out.println("현재 상점 망고 갯수 : " + s.getStoreMango());
			System.out.println("현재 상점 보유 금액 : " + s.getStoreMoney());
		}
	}

	public void ShowBuyer() {
		System.out.println("-------------------------");
		System.out.println("[[손님]]");
		System.out.println("보유금액 : " + this.money);
		System.out.println("보유 망고수: " + this.mango);
		System.out.println("-------------------------");
	}

}
