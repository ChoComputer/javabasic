package buyandsell;

public class Main1 {
	public static void main(String[] args) {

		Buyer b = new Buyer(300000);
		Seller s=new Seller(1000);
		Seller s1=new Seller(3);
		AppleSeller a=new AppleSeller(40);
		
		
		s.showSeller();
		b.ShowBuyer();
		b.BuyMango(300,0, s,a);
		b.BuyMango(300,0, s,a);

	}
}
