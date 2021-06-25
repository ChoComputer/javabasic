package pakage03;

public class PointStar {
public static void main(String[] args) {
	
	for(int i=0;i<4;i++){
		for(int j=0;j<3-i;j++){
			System.out.print(" "); 
		}
		for(int j=0;j<2*i+1;j++){
			System.out.print("*"); 
		}
		System.out.println("");
	}

                                 // for 문에서
                                 // for(1;2;3)에서 2가 의미하는건 몇번 실행할까임!!
	                             // 즉!! 별을 몇번 공백을 몇번 찍을까가 2에 해당하는거다!!
                                 
}
}