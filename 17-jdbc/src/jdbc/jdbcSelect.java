package jdbc;

import java.sql.*;

public class jdbcSelect {

	// mysql의 employees와 연결해주세요

	public static void main(String[] args) {
		Connection con = null;
		// 쿼리문을 날리기 위해 먼저 구문 객체를 생성합니다.
		Statement stmt = null;
		// SELECT 문은 결과물이 존재하기 때무에
		// 결과 데이터를 받아줄 ResultSet 도 필요합니다.
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost/sqldb";

			con = DriverManager.getConnection(url, "root", "mysql");
			
			
			// 쿼리를 실행하는 stmt 객체처리
			// con 변수가 url,id,pwd 정보를 가지고 있기 때문에
			// con 변수의 정보를 stmt에게 넘기는 것임
			stmt = con.createStatement();

			// SQL쿼리를 작성한뒤 stmt의 파라미터로 제공합니다.
			// 쿼리 작성법
			// 1) JDBC에서는 가장 마지막 ;를 생략합니다.
			// 2) *로 컬럼지정하면 전체데이터를 가져오고, 컬럼명을 적으면 일부만 가져옵니다.
			String sql ="SELECT emp_no FROM employees.employees limit 2"; 
			                                // limit 숫자를 통해 몇개를 볼지 한계를 정할수잇음 

			// 작성된 커리를 수행시킵니다.
			// 결과물은 위의 rs 변수에 저장합니다.
			rs =stmt.executeQuery(sql);
			
			// rs는 커서라는 개념을 사용합니다.
			// rs는 인덱스 -1 부터 시작합니다.
			// rs의 길이는 로우갯수만큼 생성됩니다.
			// (SELECT문의 결과가 로우1개면 길이1 / 로우10개면 길이 10
			// 커서를 옮기는 방법은 rs.next()를 호출하면 된다 
			// rs.next()는 커서 옮기는 기능과 더불어, 다음자료가 조회되면 true, 아니면 false를 출력함.
			
			// 첫호출에 따라 인덱스 -1에서 0번으로 옮겨짐
			rs.next();   // -1번에서 0번 으로 넘어오면서 조회가 가능하게됨
			
			// rs.get자료형(컬럼번호); 를 통해 자료를 받아올 수 있다.
			// !!! 컬럼번호는 1번부터 시작한다 !!!
			// rs.get자료형("컬럼이름"); 을 대신 사용할 수 있다.
			System.out.println(rs.getInt(1));
			System.out.println(rs.getInt("emp_no"));
			
			// 하단에 10002번도 조회해서 콘솔에 찍어주기
			rs.next();   // 0 -> 1 번자리로 넘어옴
			System.out.println(rs.getInt(1));
			System.out.println(rs.getInt("emp_no"));

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
