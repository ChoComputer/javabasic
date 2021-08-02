<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
		<h2>회원가입 양식</h2>
		<form action="req_join.jsp" method="post">
		<!--  아이디 , 비밀번호, 제출버틍, 초기화 버튼 말들기 -->
		<!--  아이디는 joinId 비밀번호는 joinPw에 담겨서 전송 -->
		Id : <input type="text" name="joinId" ><br/>
		Pw : <input type="pasword" name="joinPw" ><br/>
		<input type="submit" value="회원가입 전송">&nbsp; <!-- 띄어쓰기 기능도 있음 -->
		<input type="reset" value="초기화"><br/>
		
		
		</form>

</body>
</html>