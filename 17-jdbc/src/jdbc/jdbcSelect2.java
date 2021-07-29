package jdbc;

import java.sql.*;
import java.util.Scanner;

public class jdbcSelect2 {
	public static void main(String[] args) {
		// 1. 커넥터 연결을 해주세요. employees DB연결
		// 2. 조회 구문은 SELECT emp_no,first_name FROM employees limit 10;
		// 3. 위 조회 구문으로 조회한 결과물을 while문을 활용해서
		// 콘솔창에 사번 : emp_no, 성 : first_name 과 같은 형태로 10줄 출력하도록 처리해주세요.
		// hint ) while(rs.next())를 조건식으로 잡으면 정확하게 resultSet에 저장된 만큼만 반복하고 끝납니다.

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇명까지 볼까? : ");
		int limitNum = sc.nextInt();   // 몇명 볼건지 넣을수있음
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/employees";
			con = DriverManager.getConnection(url, "root", "mysql");
			stmt = con.createStatement();
			String sql = "SELECT emp_no,first_name,hire_date  FROM employees limit "+limitNum ;
			rs = stmt.executeQuery(sql);

			while (rs.next()) {   // rs.next() 가 자료가 있을떄는 true 이기때문에 while문이 돌아감
				int empNo = rs.getInt(1);
				String fName = rs.getString(2);
				Date Hdate =rs.getDate(3);
				System.out.printf("사번 : %d , 성 : %12s , 고용일 : %tY년%tm월%td일 %n",empNo,fName,Hdate,Hdate,Hdate);
//				System.out.printf("%tY년%tm월%td일 %n",Hdate,Hdate,Hdate);
			}

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