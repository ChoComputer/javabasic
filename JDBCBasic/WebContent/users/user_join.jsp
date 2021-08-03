<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// db 연동 이전에 먼저 join_form에서 날려주는 데이터를 받아서 저장해준다
response.setCharacterEncoding("utf-8");
request.setCharacterEncoding("utf-8");
String uid = request.getParameter("uid");
String upw = request.getParameter("upw");
String uname = request.getParameter("uname");
String email = request.getParameter("email");

// Connection 객체 생성
Connection con = null;
//쿼리문 실행을 위한 Preparedstatement객체생성
PreparedStatement pstmt = null;

try {
	// MySQL 과 연동할것임을 나타냄.
	Class.forName("com.mysql.cj.jdbc.Driver");

	// 접속 URL은 jdbc:mysql://localhost/db명
	String url = "jdbc:mysql://localhost/ict03";

	// 접속 주소, 계정, 비밀번호를 이용해 접속요청을 넣습니다.
	con = DriverManager.getConnection(url, "root", "mysql");
	
	// 1. INSERT 쿼리문을 작성합니다.
	String sql="INSERT INTO users VALUES (?,?,?,?)";
	
	// 2. 만든 쿼리문의 ? 자리에 적용할 자바 변수를 집어 넣는다.
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1, uid);
	pstmt.setString(2, upw);
	pstmt.setString(3, uname);
	pstmt.setString(4, email);
			
	// 3. 만든 쿼리문 실행하기
	pstmt.executeUpdate();
			
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
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<h1> 회원가입을 축하합니다.!</h1>
 <a href="user_login_form.jsp">로그인 하러가기</a>

</body>
</html>