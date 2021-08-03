<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Cookie[] cookies = request.getCookies();
    // 로그인 창 만든 이후에 이미 로그인한 사람이 로그인창으로 오면
    // 바로 로그인 완료창으로 보내주기 위해 작성할 부분입니다.
    // "user_id" 쿠키 존재 여부를 따져서 리다이렉트 시킵니다.
	// cookie_welcome.jsp로 리다이렉트 시켜주세요.
	for(Cookie c : cookies){
		String cookieName = c.getName();
		if(cookieName.equals("user_id")){
			response.sendRedirect("cookie_welcome.jsp");
			// break  -> 실행된는 경우가 없음  response가 보내버려서 어차피 실행 안됨
		}
	}
    
    
    // 만약 아이디/비밀번호 기억하기가 체크되어 있는경우
    // 처리해주기 위해 쿠키에서 아이디/비밀번호 값을 추출하는 로직
    // 추출한 아이디 , 비밀번호를 콘솔창에 찍어주기
    String userId="";
    String userPw="";
    // cookies 변수에 쿠키가 여러개 들어있음
    // 반복문을 이용해 하나하나 c 에 번갈아 가면서 한번씩 대입하여 코드 진행
    
    for(Cookie c : cookies){
    	// 개별 쿠키의 이름을 cookieName 변수에 저장 
    	String cookieName=c.getName();
		// 저장한 쿠키의 이름이 "remember_id" 인 경우
    	if(cookieName.equals("remember_id")){
    		// userId 변수에 remember_id 변수에 저장해둔 로그인 아이디를 저장
    		userId=c.getValue();
    	}
		// 저장한 쿠키의 이름이 "remember_pw" 인 경우
    	if(cookieName.equals("remember_pw")){
    		// userId 변수에 remember_id 변수에 저장해둔 로그인 아이디를 저장
    		userPw=c.getValue();
    	}
    }
    // 저장 받은 아이디/ 패스워드가 실제로 들어오는 지 확인
    System.out.println(userId);
    System.out.println(userPw);
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 로그인폼에는 checkbox를 이용해 자동로그인 여부까지 체크함 -->
	<form action="cookie_login_ok.jsp" method="post" >
		<input type ="text" name="id" placeholder="네모속 ID" value="<%=userId%>"/>
		<input type ="checkbox"name="id_check"value="yes"/>
		아이디 기억하기<br/>
		
		<input type="password" name="pw" placeholder="네모속 password" value="<%=userPw%>"/>
		<input type="checkbox" name="pw_check" value="yes"/>
		비번 기억하기<br/>
		<input type="submit"value="로그인"/>
	</form>

</body>
</html>
