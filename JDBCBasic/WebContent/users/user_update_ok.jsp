<%@page import="kr.co.ictedu.UsersDAO"%>
<%@page import="kr.co.ictedu.UsersVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 1. 폼에서 던져준 데이터를 받습니다.
	response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	String uid = request.getParameter("id");
	String upw = request.getParameter("pw");
	String uname = request.getParameter("name");
	String email = request.getParameter("email");
	

	// 2. 던져준 데이터를 VO를 생성해 담습니다.
	UsersVO user = new UsersVO(uid, upw, uname, email);
	System.out.println("DB에 넘기기 전 : " + user);
	// 3. dao를 생성해 usersUpdate(); 메서드를 호출해줍니다.
	UsersDAO dao = UsersDAO.getInstance();

	// 4. 업데이트 성공시 1, 실패시 0을 리턴받고
	//	  0을 리턴받았을떄는 user_update_fail.jsp로 리다이렉트	
	//	  1을 리턴 받았을떄는 하단 body 태그내에 <계정명> 수정이 완료되었습니다.
	//    라는 메세지와 다시 로그인 폼으로 돌아가는 링크 띄우기
	int updateResultNum = dao.usersUpdate(user);
	if (updateResultNum == 0) {
		response.sendRedirect("user_update_fail.jsp");
	}
	// 5. user_update_fail.jsp은 body 태그 내에 
	// 	  수정이 실패 했습니다. 다시 시도해주세요
	//   라는 메세지와 그 아래에 로그인 폼으로 돌아가는 링크를 띄워줍니다.
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2><%= user.getUid() %>수정이 완료 되었습니다.</h2>
	<a href ="user_login_form.jsp">로그인창으로</a>
	

</body>
</html>