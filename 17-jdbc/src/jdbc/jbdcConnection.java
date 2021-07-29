package jdbc;
        
import java.sql.*;

public class jbdcConnection {
	public static void main(String[] args) {
		// JAVA와 DB를 연동하기 위해서 JDBC라는 API가 필요합니다.
		// MySQL은 그중에서도 Connector J 라는 라이브러리를 사용합니다.
		// Connector J 는 MySQL 공식홈페이지에서 다운받을수 있고
		// 아니면 jar파일만 구해서 바로적용할 수 도 있습니다.
		// 공식홈페이지 루트는
		// 1. mysql 홈페이지접속
		// 2. download탭에서 하단의 mysql communith(GPL) 선택
		// 3. 해당하는os 버전 선택 ( mysql installer 선택)
		// 4. 상단의 2메가 바이트 짜리 업데이트 파일
		// 5. connector j 설치
		// 6. program files(x86) -> mysql -> connector j폴더
		// 내부의 .jar 파일을 확인하면 됩니다.

		// 이제 jar파일을 어떤 경로로든 구하셨다면, 사용할 프로젝트에
		// jar 파일을 추가해줘야함
		// 프로젝트별로 계속 추가해야한다
		// 1. 프로젝트 우클릭 -> properties
		// 2. 상단 탭의 libraries 선택 후 우측의 Add library 선택
		// 3. user library 선택후 우측 user libraries 선택
		// 4. 우측 new 버튼 누르고 임의로 입력 ( 현재 jdbc connection )
		// 5. Add External Jar 선택 후 connector j 폴더로 이동
		// 6. jar 파일 선택후 apply and close 선택

		// DB 연동 코드 작성
		// 위쪽의 모든 작업이 끝났다면 본격적으로 코드를 작성해 보겠습니다.
		// 기본 적으로 import java.sql.*; 을 1번라인에 입력하고 시작함

		// 연결은 Connection 자료형으로 진행
		Connection con = null;

		// DB 연결에 관련된 로직은 무조건 try~catch 구문을 활용하도록 강요받습니다.
		try {
			// MySQL DB 와 연동할걸 나타냄
			Class.forName("com.mysql.jdbc.Driver");

			// 접속 url 은 jdbc:mysql://localhost/db명 입니다.
			String url = "jdbc:mysql://localhost/sqldb";

			// 접속주소, 계정 ,비밀번호를 이용해 접속요청을 넣습니다.
			con = DriverManager.getConnection(url, "root", "mysql");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if (con != null && !con.isClosed()) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
