<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>태그퀴즈1</title>
</head>
<body>
	<%!public int count = 1;

	public String C1(double c) {
		return (c >= 0.33) ? ((c >= 0.66) ? "빨강" : "노랑") : "파랑";
	}%>
	<h2>Web프로그래밍</h2>
	<%
		int each = 0;
	count++;
	each++;
	out.print("페이지 누적 요청수" + count);
	out.print(", 페이지 개별 요청수 : " + each);
	double color = Math.random();
	int luckyNum = (int) (Math.random() * 10 + 1);
	%><br>
	<h2>오늘의 행운 숫자와 색깔</h2>
	행운의 숫자 :
	<b><%=luckyNum%></b>
	<br> 행운의 색깔 :
	<%=C1(color)%>



</body>
</html>