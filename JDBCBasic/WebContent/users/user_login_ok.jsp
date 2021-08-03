<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    response.setCharacterEncoding("utf-8");
    request.setCharacterEncoding("utf-8");
    String id=request.getParameter("id");
    String pw=request.getParameter("pw");
    String uid=request.getParameter("uid");
    String upw=request.getParameter("upw");
    String uname=request.getParameter("uname");
    String uemail=request.getParameter("email");
    
    if(id.equals("uid")&&pw.equals("upw")){
    	session.setAttribute("session_id", uid);
    	session.setAttribute("session_pw", upw);
    	session.setAttribute("session_name", uname);
    	session.setAttribute("session_email", uemail);
    }else{
    	response.sendRedirect("user_login_fail.jsp"	);
    }
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>