package io1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileIo1 {
	public static void main(String[] args) throws IOException {
		// 외부에 텍스트 파일을 만들기 위해서 FileOutputStream을 사용합니다.
		// 변수를 만들고 거기에 파일 경로를 적습니다.
		// main메서드에 반드시 throws IOException 을 작성해야합니다.
		//FileOutputStream output= new FileOutputStream("c:/io/test.txt");
		
		// 간편한 사용을 위해 FileOutputStream자료형 대신
		// FileWriter 자료형을 쓸수가 있다.
		FileWriter output =new FileWriter("c:/io/test.txt");
		
		// .write("내용") 을 이용해 메모장 내부에 필기를 할수가 있다.
		// 단, 줄바꿈이 자동으로 안되기 때문에 줄바꿈이 필요한 부분에 \n 을 붙여야 한다
		
		output.write("쓰고픈것");
		output.write("포코코코로롱");
		
		
		
		
	}

}
