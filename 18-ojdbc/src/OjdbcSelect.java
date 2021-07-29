import java.sql.*;

public class OjdbcSelect {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// Oracle SQL과 연동할것임을 나타냄.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 접속 URL도 Oracle SQL에 맞춰서 적습니다.
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			
			con = DriverManager.getConnection(url, "hr", "hr");
			
			stmt = con.createStatement();
			
			String sql = "SELECT employee_id, first_name, hire_date, "
					+ "job_id, salary FROM employees";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int emp_id = rs.getInt(1);
				String f_name = rs.getString(2);
				Date h_date = rs.getDate(3);
				String job_id = rs.getString(4);
				int salary = rs.getInt(5);
				System.out.println("아이디 : " + emp_id + 
									", 성 : " + f_name +
									", 입사일 : " + h_date +
									", 직무명 : " + job_id +
									", 연봉 : " + salary);
			}
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch(SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
