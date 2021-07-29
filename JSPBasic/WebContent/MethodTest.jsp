<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>화씨온도구하기 선언!</title>
</head>
<body><%!public double Celcius = 33;

	double CtoF(double Celcius) {
		return (Celcius * 1.8 + 32);
	}%>
	<h2>오늘 현재 홍대입구의 온도</h2>
	<%
		out.println("섭씨온도 : " + "<b>"+Celcius+"</b>" + "</br>");
	out.println("화씨온도 : " + "<b>"+CtoF(Celcius)+"</b>"); // <b> 볼드체 </b>
	%>

</body>
</html>