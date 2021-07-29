<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언부!</title>
</head>
<body>

<%!

public boolean TrueOrFalse(int a, int b){
	return (a >= b) ? true : false;
}
%>
<%out.println("스크립트로 출력 : <b>"+TrueOrFalse(5,3)+"</b>"); %><br>
표현식으로 출력된값 : <b><%= TrueOrFalse(3,5) %></b>
</body>
</html>