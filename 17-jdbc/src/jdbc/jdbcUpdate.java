package jdbc;

import java.sql.*;
import java.util.Scanner;

public class jdbcUpdate {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num =sc.nextInt();
		System.out.print("문자 : ");
		String input =sc.next();
		sc.close();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			con =DriverManager.getConnection(url,"root","mysql");
			stmt = con.createStatement();
			String sql = "UPDATE JDBCInsert SET str='" + input +"' WHERE num ="+num;
			
			// SELECT문은 executeQuery(sql구문); 형식으로 호출하지만 
			// 이외 구문은 executeUpdate(sql구문); 으로 호출합니다.
			stmt.executeUpdate(sql);
			System.out.println(sql);

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