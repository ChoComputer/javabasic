package buyandsell;

public class Main2 {
	
	public static void main(String[] args) {
		//상인 2개 만들기
		Seller s1=new Seller(30);
		Seller s2=new Seller(50);
		AppleSeller a=new AppleSeller(40);
		
		
		//구매자 1개 만들기
		Buyer b= new Buyer(16000);
		
		
//		//구매자 정보확인
//		b.ShowBuyer();
//		
//		//1번상인정보
//		s1.showSeller();
//		
//		//2번상인정보
//		s2.showSeller();
//		
		//1번상인에게 구매자가 망고구매
		b.BuyMango(10,20, s1,a);
		
//		//구매자 정보확인
//		b.ShowBuyer();
//		
//		//1번상인 정보확인
//		s1.showSeller();
//		
//		//2번상인정보확인
//		s2.showSeller();
	}

}
