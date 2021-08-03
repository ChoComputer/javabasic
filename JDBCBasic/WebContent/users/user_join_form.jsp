<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  아이디 비밀번호 이름 이메일 4개요소를 users_join.jsp로 보내는 form을 작성하기
	    보내는 input 태그의 name 속성은 컬럼명과 일치 시켜 주세요.	 -->
	    <h1>회원가입 창입니다.</h1>
	<form action="user_join.jsp" method="post">
		<input type="text" name="uid" placeholder="id"> <br/>
		<input type="password" name="upw" placeholder="pw"> <br/>
		<input type="text" name="uname"placeholder="name"> <br/>
		<input type="email" name="email" placeholder="eamil"><br/>
		<input type="submit" value="제출">
	</form>
</body>
</html>