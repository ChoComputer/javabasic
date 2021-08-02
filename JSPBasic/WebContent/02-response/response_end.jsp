<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// response.sendRedirect("주소")
	// 는 해당 코드가 실행될 경우 바로
	// 파라미터로 입력된 주소로 보냅니다.
	// 50%의 확률로 네이버로 보내는 코드 작성
	int a = (int)(Math.random()*2);
	if(a ==1){
	response.sendRedirect("https://www.naver.com");}
	else { out.println("힝 속앗지");}
%>
		<h1>이거안보임 네이버로가면 </h1>
</body>
</html>