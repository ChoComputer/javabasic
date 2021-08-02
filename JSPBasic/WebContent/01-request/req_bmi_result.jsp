<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("utf-8");
    String hei=request.getParameter("height");
    String wei=request.getParameter("weight");
    double h =Double.parseDouble(hei);
    double w =Double.parseDouble(wei);
    double bmi = w/((h*h)/100);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=bmi %>
	키 : <b><%=hei %></b><br/>
	체중 : <b><%=wei %></b><br/>
	BMI : <b><% if(bmi > 23){ out.println("당신은 과체중입니다.");} 
				else if(bmi<18.5){out.println("당신은 저체중입니다.");}
				else{out.println("당신은 정상체중입니다.");}
	%></b>
	

</body>
</html>