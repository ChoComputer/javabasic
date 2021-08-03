<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% // 작동은 하지만 매번 이렇게 넣는다면 미쵸... 이게 기본적인 1번재 방법임
    try{
    	int a=3/1;
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 나눗셈의 결과는 <%=a %>입니다
</body>
</html>
<%}catch(Exception e){
	out.println("에러가 났습니다.");
	}

%>