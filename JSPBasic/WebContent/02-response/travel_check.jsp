<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
String travel = request.getParameter("travel");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		
	switch (travel) {
	case "hong":
		response.sendRedirect("travel_hong.jsp");
		break;
	case "pe":
		response.sendRedirect("travel_pe.jsp");
		break;
	case "pa":
		response.sendRedirect("travel_pa.jsp");
		break;
	default:
		response.sendRedirect("travel_we.jsp");
		break;
	}
	
	%>

</body>
</html>