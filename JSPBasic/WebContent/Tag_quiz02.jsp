<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>태그퀴즈2</title>
</head>
<body>
	<%!public int count;%>
	<%
		count++;
	int randomgugu = (int) (Math.random() * 8 + 2);

	out.println("페이지 누적 요청수 : " + count + "<br>");
	out.println("매 10번째 방문자에게는 기프티콘을 드립니다 <br>");
	if (count % 10 == 0) {
		out.println("당첨되셨습니다!!!<br>");
	} 
	%><br>
	<hr>

	<h2>
		랜덤구구단(<%=randomgugu%>단)
	</h2>
	<p>
		이번에 나온 구구단은
		<%=randomgugu%>단 입니다
	</p>

	<%
		for (int i = 1; i < 10; i++) {
		out.println(randomgugu + " X " + i + "=" + randomgugu * i + "<br>");
	}
	%>


</body>
</html>