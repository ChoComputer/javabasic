<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 구현</title>
</head>
<body>
<form action="req_login.jsp" method="post">
		<h1>로그인 창입니다.</h1>
		아이디 입력 : <input type="text" name="id"><br/>
		비밀번호 입력 : <input type="password" name="pw"><br/>
		<input type="submit" value="로그인">
		<input type="reset" value="초기화"><br/>
		<a href="req_join_form.jsp">회원가입</a>
		
		
		
</form>

</body>
</html>