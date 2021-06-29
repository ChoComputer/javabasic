package mission;

public class Mission {
	public static void main(String[] args) {

		// 로또 번호 6개 추첨 (중복있을수도?)
		
		for (int i = 0; i < 6; i++) {

			int b = (int) (Math.random() * 45);
			System.out.println(b+1);
		}
		
		
		// 로또번호 6개 추첨 중복없이 ??
		
		int a[]=new int[6];
		System.out.println(a);
		
		for (int j =0; j<6;j++) {
			int c = (int) (Math.random() * 45)+1;
			for( c ==  c) {
			
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	
}