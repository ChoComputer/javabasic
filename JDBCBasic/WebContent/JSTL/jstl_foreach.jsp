<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>1부터 100 까지의 합</h4>
	<c:set var ="sum" value="0"/>	<%-- int sum =0; --%>
	<c:forEach var ="n" begin="1" end="100">
		<c:set var="sum" value="${sum+n }"/>
	</c:forEach>
	
	<%-- 		for(int i=1; i<=100; i++){
	  				sum=sum+1;
	  		            }          				
	  		            밑의 것은 출력용 구문들--%>
				${sum}</br>
				<c:out value ="${sum }"/></br>
				
				
	<h4>1부터 100 까지의 홀수 합</h4>
	<c:set var ="sum" value="0"/>	<%-- int sum =0; --%>
	<c:forEach var ="n" begin="1" end="100" step="2">  <%-- step 은 아무것도 안적엇을시 1임 i += 1; 임 --%>
		<c:set var="sum" value="${sum+n }"/>
	</c:forEach>
	
	<%-- 		for(int i=1; i<=100; i++){
	  				sum=sum+1;
	  		            }          				
	  		            밑의 것은 출력용 구문들--%>
				${sum}</br>
				<c:out value ="${sum }"/>
</body>
</html>