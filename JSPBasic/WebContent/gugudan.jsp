<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단!</title>
</head>
<body>


	<%
		for (int i = 2; i < 10; i++) {
	%>
	<p>
	<h2>
	<% if(i%2 != 0){ %>
		<%
			out.print("<h2>구구단" + i + "단</h2><hr>");
		%>
	</h2>
	
	<%
		for (int j = 1; j < 10; j++) {
		out.println(i + "*" + j + "=" + (j * i) + "</br>");
	}
	%>
	<%}else{continue;} %>
	</p>
	<%
		}
	%>

</body>
</html>