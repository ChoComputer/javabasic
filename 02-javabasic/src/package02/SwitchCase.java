package package02;


public class SwitchCase {
	public static void main(String[] args) {
		// switch~case 구문은 변수에 들어가 있는 자료가 case 문에 제시된 자료와 일치하는지 여부로 논리식을 실행합니다.
		// switch (변수) {
		//         case 값1:
		//             실행문;
		//         case 값2:
		//             실행문;
		//              ....
	    //              ....
		//             }
		// 와 같이 작성합니다. 
		// 마지막에 default 문을 작성시 if~else문의 else처럼 기능함
		
		int a=3;
		switch(a) {
		case 1:
			System.out.println("one");
			break; //case 별로 작성해야 코드가 줄줄이 실행되지를 않는다
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("????");
		}
		
	}

}
