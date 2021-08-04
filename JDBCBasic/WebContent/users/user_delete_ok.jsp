<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	response.setCharacterEncoding("utf-8");
request.setCharacterEncoding("utf-8");
// 세션쪽 아이디, 비밀번호, 그리고 사용자가 폼으로 보낸 비밀번호 얻기
String pw = request.getParameter("pw");
String dbId = (String) session.getAttribute("s_id");
String dbPw = (String) session.getAttribute("s_pw");

Connection con = null;
PreparedStatement pstmt = null;
//ResultSet rs = null; SELECT 구문에 사용되기 때문에 여긴 필요 ㄴㄴ

if (pw.equals(dbPw)) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost/ict03";
		con = DriverManager.getConnection(url, "root", "mysql");
		
		// 1. SELECT 쿼리문 작성
		// 입력받은 id가 실제로 DB에 존재하는 지 조회하는 쿼리문 작성
		String sql = "Delete FROM users Where uid=?";
		
		// 2.쿼리문의 ? 자리에 적용할 변수를 집어넣습니다.
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, dbId);
		
		// 3. 쿼리문 실행
		pstmt.executeUpdate();
		
		// 세션 파기는 두 번 실행할 수 없으므로
		// 로직당 한번 만 실행되도록 배치한다.
		session.invalidate();

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
} else {
		session.invalidate();
	response.sendRedirect("user_logout.jsp");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>탈퇴완료</h2>
	<a href="user_join_form.jsp">회원가입창</a>
	<a href="user_login_form.jsp">로그인창</a>


</body>
</html>