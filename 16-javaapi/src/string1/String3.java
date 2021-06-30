package string1;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		// Scanner 를 통해서 전체 문장을 입력 받으시오
		// 다음으로 문장내에서 찾고 싶은 단어 입력받기
		// 문장내에 있는 단어들의 인덱스 번화호와 , 몇개가 검출되었는지
		// 풀력해주는 코드를 작성해 보시오

		Scanner sc = new Scanner(System.in);
		System.out.println("전체 문장을 입력해 주세요.");
		String all = sc.nextLine();
		System.out.println("문장내에서 카운트할 단어를 입력해 주세요.");
		String voca = sc.nextLine();

		// 답 while 로 하는게 for보다 효율적
		// 갯수 카운팅
		int count = 0;
		// 반복문 실행여부
		boolean bool = true;
		
		// 마지막 으로 발견된 지점
		int fidx = -1;
		
		while(bool) {
			int get =all.indexOf(voca,fidx+1);
			if(get==-1) {
				bool=false;
			}else {
				fidx=get;  // 그냥 단순히 all.indexOf의 배열의 자리수를 조절하기 위한 것임
				count++;
				System.out.println( get+"번에서 "+count+"번쨰 ["+voca+"]이(가) 검출되었습니다." );
				
			}
		}
		System.out.println("[["+voca+"]]는 총 "+count+"번 나왔습니다.");		
		
		
		

		// 내풀이...  미완 몇번 출현 횟수(count대입) 와 
		// 일치 안될때의 출현하는 -1 없애는거 못함 (여기서 get값은 숫자라 -1이 나오면 그냥 -1 된것들을 멈추면 됨)
//		for (int i = 0; i <= all.length(); i++) {
//			int get = all.indexOf(voca, i);
//			if (i<get) {
//				continue;
//				//이밑으로 못하고 있다 도움받아 함ㅠㅠ (일치안할때 나오는 -1 없애는거) 
//			}else if(get==-1) {
//				break;
//			}
//			count++;
//			System.out.println( get+"번에서 "+count+"번쨰 ["+voca+"]이(가) 검출되었습니다." );
//		}
//		System.out.println("[["+voca+"]]는 총 "+count+"번 나왔습니다.");		

	}

}
