<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	// 서버에서 발급한 전체 쿠키목록을 가져오는 코드를 완성하기
 	Cookie[]cookies=request.getCookies();
 
 	String userId=null;
 	
 	// 항상된 for문을 이용해서도 처리가능
 	for(Cookie c : cookies){
 		// 쿠키 이름을 변수 s 에 저장
 		String s=c.getName();
 		
 		if(s.equals("user_id")){
 			// 쿠키이름이 user_id인 경우 쿠키의 값을
 			// user_id변수에 저장하기
 			userId=c.getValue();
 			break;
 		}
 	}
 	if(userId != null){
 		out.println(userId+" 님 환영합니다.");
 	}else{
 		out.println("시간이 지나 자동 로그아웃 되셨습니다.");
 		out.println("<a href=\"cookie_login.jsp\">다시로그인</a>");
 	}
 %>