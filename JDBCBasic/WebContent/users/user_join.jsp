<%@page import="kr.co.ictedu.UsersDAO"%>
<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// db 연동 이전에 먼저 join_form에서 날려주는 데이터를 받아서 저장해준다
	response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	String uid = request.getParameter("uid");
	String upw = request.getParameter("upw");
	String uname = request.getParameter("uname");
	String email = request.getParameter("email");

  // 기존의 로직 UserDAO로 이관
  // DAo 클래스 받아오기
  UsersDAO dao =UsersDAO.getInstance(); // 컨트롤 스페이스로 위의 임폴틀
  
  // VO객체 생성 및 uid, uname, email setter 로 입력하기 컨트롤 스페이스 임포트!!
  UsersVO user = new UsersVO(uid, upw, uname, email); // 위의 변수 와 같은 변수여야함
  dao.joinUsers(user);
  
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<h1> 회원가입을 축하합니다.!</h1>
 <a href="user_login_form.jsp">로그인 하러가기</a>

</body>
</html>