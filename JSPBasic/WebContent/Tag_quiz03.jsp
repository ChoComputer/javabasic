<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Integer> lotto = new ArrayList<>();
	int getLotto = 0;
	while (lotto.size() != 6) {
		int getNum = (int) (Math.random() * 45 + 1);
		if (!lotto.contains(getNum)) {
			lotto.add(getNum);
		}
	}
	Collections.sort(lotto);
	%>
	<h1>로또 번호 생성 결과</h1>
	<p>
		이번주 로또는 이번호다~!!<br>
		<%
		for(Integer num : lotto){
			out.println(num+"&nbsp;");
			Thread.sleep(700);  // CPU를 잠시멈추는 메서드 0.7초 멈춤
			out.flush(); // 브라우저의 출려버퍼를 비우는 메서드
		}
		out.println("<br>추첨된 번호 : " + lotto);
	%>
	</p>


</body>
</html>