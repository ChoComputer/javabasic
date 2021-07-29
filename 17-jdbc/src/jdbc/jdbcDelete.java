package jdbc;

import java.util.Scanner;
import java.sql.*;
public class jdbcDelete {
public static void main(String[] args) {
	Connection con =null;
	Statement stmt =null;
	ResultSet rs = null;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("삭제할 번호 : ");
	int Dnum=sc.nextInt();
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost/sqldb";
		con = DriverManager.getConnection(url,"root","mysql");
		stmt = con.createStatement();
		String sql = "Delete FROM JDBCInsert Where num="+Dnum;
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