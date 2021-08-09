<%@page import="java.util.ArrayList"%>
<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%
    
    // 로그인 하지 않은 사용자 처리
    String idSession= (String)session.getAttribute("s_id");
	if(idSession==null){
		response.sendRedirect("user_login_form.jsp");
	}
    
    	// DB에서 전체 회원 데이터를 들고 나옴
    	// 1. getAllUser()메서드를 dao를 이용해 호출 
    	//    호출시 리턴되는 ArrayList를 변수에 담아주기
    	
    	
    	UsersDAO dao = UsersDAO.getInstance();
		ArrayList<UsersVO> userList = dao.getAllUser(); // dao 유저 정보 유저리스트에 저장
    	System.out.println(userList);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 전체 회원 목록</h1>
<table border="1">
	<thead>	
		<tr>
			<th>회원아이디</th>
			<th>회원이름</th>
			<th>회원이메일</th>
		</tr>
	</thead>
	<tbody>	
		<%-- userList는 VO의 집합이고,여기서 UsersVO를 하나하나 순차적으로
		          뽑아서 출력해야 하므로 향상된 for문 사용함  --%>
		<%--<%for(UsersVO user : userList){ 
		<tr>
			<th> <%=user.getUid();%></th>
			<th><%=user.getUname();%></th>
			<th><%=user.getEmail();%></th>
		</tr>
		<% } %> --%>
		<%--JSTL 적용버전  
		forEach 구문은 반복문이고, Items에 향상된 for 문의 우측요소 그리고 var에 왼쪽요소를 집어넣어 주면 됩니다.
	--%>
		<c:forEach var="user" items="<%= userList %>" >  
	        	   <%-- items에는 표현식<%= %>으로 넣어야함  --%>
			<tr>
				<th>${user.uid}</th>
				<th>${user.uname}</th>
				<th>${user.email}</th>
			</tr>
		</c:forEach>
	</tbody>
</table>
	<a href="user_logout.jsp">로그아웃 하기</a><br/>
</body>
</html>