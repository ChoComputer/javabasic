<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String id =(String)session.getAttribute("session_id");
       String nick =(String)session.getAttribute("session_nick");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%=nick %>(<%=id %>) 님 환영합니다. </h3>
<h5><a href="session_logout.jsp">로그아웃</a></h5>

	<%-- 페이지 include : 다른 페이지의 소스코드를 그대로 현재 페이지에 붙여넣어줄때 쓰는문법 --%>
	
	<%@ include file="application_basic.jsp" %>

</body>
</html>