package day0529.loop;

public class Quiz11 {
	public static void main(String[] args) {
		for (int i =1; i <11; i++) {
			if(i%2==0){
			System.out.println(i);
		}
	}
		for (int i =1; i <11; i++) {
			if(i%2==1){
				continue;
			}
			System.out.println(i);
		}
	
		
		
	}

}
