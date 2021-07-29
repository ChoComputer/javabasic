<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HTML JAVA 콜라보</title>
</head>
<body>
<% for(int i=1; i<=3; i++){ %>
	<h2>이클립스와 톰캣으로 HTML 렌더링하기</h2>
	<p>
		안녕하세요. 오늘은 2021년 7월 29일 목요일 입니다.<br/> 
		개발환경 설정후 HTML 실행을 테스트 중입니다.
		<% out.println("<h2>브라우저에 찍히는 123</h2>"); %> 
		<% System.out.println("<h2>콘솔에 찍히는 456</h2>"); %> 
		</p>
		<% } %>
</body>
</html>