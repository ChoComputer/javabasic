<%@page import="kr.co.ictedu.UsersDAO"%>
<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	String uid = request.getParameter("uid");
	String upw = request.getParameter("upw");  
	// getParameter은 버튼눌러 여기온 그 전창의 입력된값을 가져오는거임 . 그전창에 입력된 값이 없으면 null이됨!
	String uname = request.getParameter("uname");
	String email = request.getParameter("email");
	
	
	// 세션이 존재할 떄는 DB에서 데이터를 가져오는 로직을 생략하기
	String idSession =(String)session.getAttribute("s_id");
	String sessionPw=(String)session.getAttribute("s_pw");

	if(idSession!=null){
		uid=idSession;
	}else{
		// 1.DAO 생성
		UsersDAO dao =UsersDAO.getInstance();
		
		// 2. DAO로 로그인 검사
		UsersVO user = new UsersVO(); // 위의 변수 와 같은 변수여야함
		user.setUid(uid);
		user.setUpw(upw);
		
		int loginResultNum = dao.usersLogin(user);
		System.out.println("결과코드 : "+loginResultNum);
		
		if(loginResultNum==1){
			session.setAttribute("s_id", uid);
			session.setAttribute("s_pw", upw);
			}else if(loginResultNum==0){
			response.sendRedirect("user_login_fail.jsp");
			}
	}

	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 style="color: green"><%=uid%>님의 로그인을 환영 합니다.</h2>
	<h2>로그인 완료	</h2>
	<a href="user_logout.jsp">로그아웃 하기</a><br/>
	<a href="user_update_form.jsp">회원정보수정</a>
	<a href="user_delete_form.jsp">회원탈퇴</a><br/>
	<a href="user_get_all.jsp">전체회원목록 링크</a><br/>
	

</body>
</html>