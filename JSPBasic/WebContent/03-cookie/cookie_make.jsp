<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    // 쿠키생성 방법 
    // 1. 쿠키객체 생성-생성자의 파라미터로
    // 쿠키의 이름및 저장할 데이터 입력
    Cookie apple =new Cookie("apple_cookie","사과맛");
    Cookie peanut =new Cookie("peanut_cookie","땅콩맛");
    
    // 2. 쿠키 클래스의 setter 메서드로 쿠키의 속성들 설정.
    apple.setMaxAge(60*60); // 쿠키의 유효 시간 설정 ->1 시간 (60*60)
    peanut.setMaxAge(20); // 초단위로 설정 -> 20초
    
    // 3. http응답시 response 객체에 생성된 쿠키를 탑재하여
    // 클라이언트로 전송까지 마춰줘야 pc에 해당정보 저장된다
    response.addCookie(apple);
    response.addCookie(peanut);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="cookie_check.jsp">쿠키 직접 확인해 보기</a>

</body>
</html>