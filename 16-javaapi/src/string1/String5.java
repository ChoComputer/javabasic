package string1;

import java.util.Scanner;

public class String5 {
	
	public static void main(String[] args) {
		//.length() 와 charAt()을 활용해 입력된 전체 문자열을
		// 한글자씩 한줄씩 출력하는 로직 작성
		// 문자열은 Scanner로 입력받는다
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("문자열 입력 : ");
		
		String str= sc.nextLine();
		
		for(int i =0; i< str.length();i++) {
//			char get = str.charAt(i);
//			System.out.println(get);
			System.out.println(str.charAt(i));   // 두개 하나로 이게 편함	
		}
		
		
		
		
	}

}
