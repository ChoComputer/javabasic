<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
    
    // 로그인 상태에서만 이 페이지를 볼수 있도록 처리하는것
    String sessionId=(String)session.getAttribute("s_id");
    if(sessionId==null){
    	response.sendRedirect("user_login_form.jsp");
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
</head>
<body>
 	<h2> <%=sessionId %> 회원 탈퇴를 진행합니다. 비밀번호를 한번더 입력해주세요</h2>
	<form action ="user_delete_ok.jsp" method="post">
			<input type="password" name="dpw" placeholder="비밀번호"><br/>
			<input type="submit" value="제출">
	</form>

</body>
</html>