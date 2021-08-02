<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String protocol = request.getProtocol();
    String conPath = request.getContextPath();
    StringBuffer reqUrl = request.getRequestURL();
    String reqUri = request.getRequestURI();
    int serverPort = request.getServerPort();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request 객체 테스트 1</title>
</head>
<body>
	요청 프로토콜 : <%=protocol %><br/>
	요청 컨텍스트 경로 : <%=conPath %><br/>
	요청 URL : <%= reqUrl %><br/>
	요청 URI : <%= reqUri %><br/>
	서버포트 : <%=serverPort %><br/>
</body>
</html>