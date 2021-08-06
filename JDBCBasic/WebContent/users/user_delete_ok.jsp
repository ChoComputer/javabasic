<%@page import="kr.co.ictedu.UsersDAO"%>
<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");

	// 세션쪽 아이디, 비밀번호, 그리고 사용자가 폼으로 보낸 비밀번호 얻기
	String dpw = request.getParameter("dpw");
	String sessionId = (String) session.getAttribute("s_id");
	String spw = (String) session.getAttribute("s_pw");
	// 1. DAO를 생성하고
	UsersDAO dao = UsersDAO.getInstance();
	
	// 2. UsersVO를 생성하되, spw, sessionId만 setter로 넣어주세요.
	UsersVO user = new UsersVO();
	user.setUid(sessionId);
	user.setUpw(spw);
	
	// 3. DAO의 usersDelete 기능을 호출하면서 파라미터로 적절한 자료를
	// 넘겨주세요.
	int deleteResultNum = dao.usersDelete(user, dpw);
	
	// 4. 결과에 따라 세션만 파기할지 redirect까지 해 줄지 결정
	if(deleteResultNum == 1){
		session.invalidate();
	} else if(deleteResultNum == 0){
		session.invalidate();
		response.sendRedirect("user_login_form.jsp");
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