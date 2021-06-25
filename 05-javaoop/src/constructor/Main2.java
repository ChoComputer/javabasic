package constructor;

public class Main2 {
	public static void main(String[] args) {
		food F=new food("맥도날드","버거","양식",false,"광대");
		food F2=new food("돼지나라","삼겹살","한식",true,"오크");
		// ctrl + food 좌클릭 해보면 food  가 어디에 연결되있느지 알려줌
		
		F.getInfo();
		F2.getInfo();  // 생성자는 넣으면 무조건 실행이라 getInfo를 만들어서 
		               // 이 메소드에만 입력시 실행되게 만드는게 조음 생성자에
		               // 한번에 실행 까지 안하는거임
	
	}

}
