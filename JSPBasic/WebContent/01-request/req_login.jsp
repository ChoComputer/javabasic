<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8");
    String Id =request.getParameter("id");
    String Pw =request.getParameter("pw"); %>
<!DOCTYPE html>
<html>
<%if(Id.equals("abcd")&&Pw.equals("1234")){ 
%>
<head>
<meta charset="UTF-8">
<title>로그인을 환영합니다.</title>
</head>
<body>
    <b>돌아오신 것을 환영합니다. <%= Id%>님.</b>
</body>
<%}else if(Id!="abcd"){ %>
<head>
<meta charset="UTF-8">
<title>로그인에 실패하셨습니다.</title>
</head>
<body>
	<h2>존재하지않는 ID입니다.</h2>
    <b>ID 와  Password를 다시한번 확인해 주세요<br/>
    <p>&#60;/hr&#62;</p>
   	<a href="req_login_form.jsp">로그인창으로 돌아가기</a></b>
</body>
<%} %>
</html>