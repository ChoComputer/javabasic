<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//세션 파기
    	session.invalidate();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>로그아웃이 완료되었습니다</h1>
		<a href="user_get_all.jsp">전체회원목록 링크</a><br/>
		<a href ="user_login_form.jsp">로그인 창으로 돌아가기</a>
</body>
</html>