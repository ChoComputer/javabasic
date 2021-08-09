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
	<c:choose>
		<c:when test="${param.g>=90 && param.g<=100 }">
			<p>"A" 학점 입니다.</p>
		</c:when>
		<c:when test="${param.g>=80 && param.g<=100}">
			<p>"B" 학점 입니다.</p>
		</c:when>
		<c:when test="${param.g>=70 && param.g<=100}">
			<p>"C" 학점 입니다.</p>
		</c:when>
		<c:when test="${param.g>=60 && param.g<=100}">
			<p>"D" 학점 입니다.</p>
		</c:when>
		<c:when test="${param.g<60 && param.g>=0 }">
			<p>"F" 학점 입니다.</p>
		</c:when>
		<c:otherwise>
			<p>잘못된 점수 입력입니다.</p>
		</c:otherwise>
		
	</c:choose>

</body>
</html>