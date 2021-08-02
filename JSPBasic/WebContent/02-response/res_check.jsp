<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String age = request.getParameter("age"); 
    int ag = Integer.parseInt(age);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if(ag > 19){
	response.sendRedirect("res_ok.jsp");
}else if(ag>0){response.sendRedirect("res_no.jsp");}
else{%>
<h2>제정신은 아니신거 같네요</h2>
<%} %>


</body>
</html>