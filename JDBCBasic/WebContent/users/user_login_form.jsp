<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 세션이 존재하면 바로 user_login_ok.jsp로 보내주는 로직을 작성해주세요.
    	String idSession= (String)session.getAttribute("s_id");
    	if(idSession!=null){
    		response.sendRedirect("user_login_ok.jsp");
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인창</title>
</head>
<body>
<h2>로그인</h2>
	<form action="user_login_ok.jsp" method="post">
		<input type="text" name="uid" placeholder="id"><br/>
		<input type="password" name="upw" placeholder="pw"><br/>
		<input type="submit" value="로그인"><br/>
		
		<a href ="user_join_form.jsp">회원가입</a>
		
	</form>

</body>
</html>