package day0522.operator;

public class Quiz03 {
	public static void main(String[] args) {
		
		String name ="아이유";
		int age =29;
		// 올해 마지막 20대인 아이유는 5억을 기부했다.
		//+연산자를 이용하여 출력 : println
		//문자는 %s임 %n은 줄넘기의 의미임 \n과 같음
	
		//내가한거 (실패)
		//System.out.printf("올해 마지막 20대인 %d살 %d는 5억을 기부했다", age ,name );
		
		System.out.println("올해 마지막 20대인 " + age + "살 " + name + "는 5억을 기부");
		
		//답
		System.out.printf("올해 마지막 20대인 %d살 %s는 5억을 기부했다%n",age ,name);
	}

}
