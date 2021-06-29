package static2;

public class Main {
	public static void main(String[] args) {
		//Asean 조원 없이도 Asean 조별점수는 조회가능
		
//		System.out.println(Asean.mission);  //private을 바꺼서 출력안됨
		
		Asean a1=new Asean(20,20,20);
		Asean a2=new Asean(30,30,30);
		Asean a3=new Asean(40,40,40);
		Asean a4=new Asean(50,50,50);
		
		a1.showAseanIfo();
		a2.showAseanIfo();
		a3.showAseanIfo();
		a4.showAseanIfo();
		
		
		
		
	}

}
