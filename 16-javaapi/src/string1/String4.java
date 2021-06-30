package string1;

public class String4 {
	public static void main(String[] args) {
		// length()는 문자열의 길이를 알 수 있습니다.
		// 정수로 몇글자인지 알려줍니다.
		String name = "김수한무거북이와 두루미 삼천갑자 동박삭 치치카포 사리사리센타";
		System.out.println(name.length()); // 띄어쓰기도 카운트함

		// replace는 찾아 바꾸기
		// .replace("찾을단어","바꿀단어"); 순으로 입력
		String report = "안녕하세요 . 리포트 보고자는 김영수, 김영수 입니다.";
		System.out.println(report.replace("김영수", "랄라라"));  // 일시적임 int a=5; -> sysou~(a+3); 이 8임 하지만 a값은 5임 이런느낌
		System.out.println(report); // 밑 처럼 안하면 휘발임 그냥 리포트.~하면 메인영역에 지역이 안만들어짐
		report = report.replace("김영수", "랄라라");
		// 위의 형태와 같다 : report="안녕하세요. 리포트보고자는 랄라라, 랄라라 입니다."          replace는 return 을 가지고 있음    
		System.out.println(report);
		// report는 참조형임 이유: 변수하나에 값이 여러개 들어가서 (글자여러개)
		
	}

}
