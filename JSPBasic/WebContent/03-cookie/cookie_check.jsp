<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 클라이언트에 저장된 쿠키를 조회하는 방법
	// request.getCookie(); 호출시 response.addCookie()로 발급된
	// 쿠키 중 해당 서버가 발급한 쿠키 전체목록을 불러옵니다.
	Cookie[] cookies =request.getCookies();
	
	String str =null;
	
	boolean flag = false;
	for(int i = 0; i <cookies.length; i++){
		str = cookies[i].getName(); // 쿠키이름을 얻어오는 메서드
		System.out.println(str);
		
		if(str.equals("peanut_cookie")){
			out.println("땅콩 쿠키가 존재합니다.<br/>");
			String value = cookies[i].getValue(); // value = 사과맛 땅콩맛
			out.println("저장된자료는"+value+"입니다.");
			flag =true;
			break;
		}
	}
	if(!flag){
		out.println("땅콩쿠키가 사라졌습니다.<br/>");
	}
%>