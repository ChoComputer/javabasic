<%@page import="java.sql.*"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	String uid = request.getParameter("uid");
	String upw = request.getParameter("upw");  
	// getParameter은 버튼눌러 여기온 그 전창의 입력된값을 가져오는거임 . 그전창에 입력된 값이 없으면 null이됨!

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null; // select 구문이라 반드시 필요
	
	// if~else문으로 try~catch~fainally 를 감싸서
	// 세션이 존재할 떄는 DB에서 데이터를 가져오는 로직을 생략하기
	String idSession =(String)session.getAttribute("s_id");
	if(idSession!=null){
		uid=idSession;
	}else{

// DB 연결 로직을 집어넣어 주세요
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = "jdbc:mysql://localhost/ict03";
	con = DriverManager.getConnection(url, "root", "mysql"); //검색만 할거라 select 권한만 가지고 있는 계정을 넣음 (회사는)

	// 1.SELECT 쿼리문을 작성합니다.
	// 입력받은 id가 실제로 DB에 존재하는지 조회하는 쿼리문을 작성해주세요
	String sql = "SELECT * FROM users WHERE uid=?"; // 로그인창에 적은 아이디가 ? 표에 넣어서 users에 그id가있는지 서치해보는 거임

	// 2. 쿼리문의 ? 자리에 적용할 변수를 집어넣습니다.
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1, uid);

	// 3. 쿼리문 실행 및 데이터 받아오기
	rs = pstmt.executeQuery();

	// rs.next()를 통해 데이터가 들어왔는지 안들어왔는지 확인 true false로 
	// rs.next() 가 db에 내가친 아이디가 있나 없나 확인하는용도임 있으면 true 없으면 false
	if (rs.next()) {

		// 들어왔다면 DB쪽 데이터 받기
		String dbId = rs.getString("uid");
		String dbPw = rs.getString("upw");

		// 얻어온 DB내 정보를 콘솔에 찍어봅니다.
		/* System.out.println("조회된 아이디 : "+dbId);
		System.out.println("조회된 비밀번호 : "+dbPw);
		out.println("조회된 아이디 : "+dbId);
		out.println("조회된 비밀번호 : "+dbPw);
		 */

		// 폼에서 보낸 데이터와 DB쪽 데이터간 아이디(위의where에서 걸려지긴해서 여기선 비교 안해도되지만..)  
		// 비밀번호 일치여부 비교해서 아이디와 비밀번호 모두 일치시 세션 발급 및 body 태그에 id 출력
		// 비밀번호가 틀린경우 역시 user_login_fail.jsp로 보내줌.
		// 여기 주의해서 보기  혼자서는 계속 실패함 "" 넣어서 실패함 ""는 써있는text일떄 쓰는거
		if (uid.equals(dbId) && upw.equals(dbPw)) {
			session.setAttribute("s_id", uid);
			session.setAttribute("s_pw", upw);
			} else {
				// 비밀번호가 틀린경우
			response.sendRedirect("user_login_fail.jsp");
			}
	}else{ 
		// DB데이터가 들어오지 않는 경우
		response.sendRedirect("user_login_fail.jsp");
	}
} catch (SQLException e) {
	e.printStackTrace();
} finally {
	// 연결 끊기
	try {
		if (con != null && !con.isClosed()) {
	con.close();
		}
		if (pstmt != null && !pstmt.isClosed()) {
	pstmt.close();
		}
		if (rs != null && !rs.isClosed()) {
	rs.close();
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 style="color: green"><%=uid%>님의 로그인을 환영 합니다.</h2>
	<h2>로그인 완료	</h2>
	<a href="user_logout.jsp">로그아웃 하기</a><br/>
	<a href="user_delete_form.jsp">회원탈퇴</a>
	

</body>
</html>