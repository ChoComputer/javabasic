package accessmodifier;

public class Main1 {
	public static void main(String[] args) {
		// 전사를 하나 만들고 사냥을 3번하기
        // 사냥 3번후 전체 상태를 sysou~를 이용해 출력
		
		Warrior w=new Warrior("칼있수마훈");
		
		w.hunt();
		w.hunt();
		w.hunt();
        
//		w1.hp=9999999999;  // private 으로 수정 불가능!
//		System.out.println("레벨: "+w.level);
//		System.out.println("경험치: "+w.exp);
//		System.out.println("아이디: "+w.id);
//		System.out.println("체력: "+w.hp);
//		System.out.println("공격력: "+w.atk);
//	     private해서 이거 하면 오류뜸
		
//		Warrior w1=new Warrior("칼없구마훈");
//		
//		w1.hunt();
//		w1.hunt();
//		w1.hunt();
		
		
		
	}

}
