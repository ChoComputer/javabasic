package accessmodifier.game;

public class ProtectedMain1 {
	public static void main(String[] args) {
//		ProtectedWarrior w = new ProtectedWarrior();
//		// w.exp=100000; //protected라 이게됨
//		w.getAllData();
//		w.hunt();
//		w.doubleAttack();
//		w.hunt();
//		w.getAllData();
//
//		
//		ProtectedMagician m = new ProtectedMagician();
//		m.getAllData();
//		m.hunt();
//		m.fireBall();
//		m.hunt();
//		m.hunt();
//		m.fireBall();
//		m.fireBall();
//		m.hunt();
//		m.getAllData();

		Paladin H = new Paladin();
		H.getAllData();
		H.Heal();
		H.HolyAttack();
		H.hunt();
		H.hunt();
		H.HolyAttack();
		H.Heal();
		H.getAllData();

	}

}
