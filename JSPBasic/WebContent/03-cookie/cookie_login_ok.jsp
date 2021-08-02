<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 0. post방식 받아오기 처리
	response.setCharacterEncoding("utf-8");

	// 1. 아이디 비밀번호 받아오기
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	// 2. checkbox가 체크되었는지 여부도 받아옵니다.
	String checkId = request.getParameter("id_check");
	String checkPw = request.getParameter("pw_check");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 아이디는 abc1234, 비밀번호는 aaa1111로 처리합니다.

	if (id.equals("abc1234") && pw.equals("aaa1111")) {
		// 로그인 처리를 위한 쿠키 발급
		// 쿠키이름은 "user_id", 쿠키값은 로그인할때 사용한id
		//지속시간은 20초
		//완성후 쿠키발송까지 아래에 작성.
		Cookie idCookie = new Cookie("user_id", id);
		idCookie.setMaxAge(20);
		response.addCookie(idCookie);

		// 체크박스가 체크되어있을경우, 아이디 비밀번호 자동입력을 위한 쿠키를 발급하기
		// 쿠키를 발급하기 (20초)
		//"remember_id","remember_pw"를 쿠키이름으로
		// id, pw 를 쿠키값으로 가지는 쿠키 2개 생성하여 발송
		// 단, 쿠키발급은 checkId 혹은 checkPw값이 yes인 경우에만 발급합니다.
		
		//id 체크박스
		if(checkId!=null &&checkId.equals("yes")){
			Cookie idMemory=new Cookie("remember_id",id);
			idMemory.setMaxAge(20);
			response.addCookie(idMemory);
		}
		//pw체크박스
		if(checkPw!=null &&checkPw.equals("yes")){
			Cookie pwMemory=new Cookie("remember_pw",pw);
			pwMemory.setMaxAge(20);
			response.addCookie(pwMemory);
		}
		
		// 로그인 성공시 cookie_welcome.jsp로 보내고
		response.sendRedirect("cookie_welcome.jsp");

	} else {
		// 로그인 실패시 "로그인에 실패하셨습니다." 라고 브라우저에 띄우기
		out.println("로그인에 실패하셨습니다.<br/>");
		out.println("<a href=\"cookie_login.jsp\">다시로그인</a>");
	}
	%>


</body>
</html>