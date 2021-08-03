<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<hr>
<%
/*
	aplication은 aplication객체를 사용해서 저장하거나
	데이터값을 받아올 수 있습니다.
	
	getAttribute() 매서드와
	setAttribute() 메서드를 사용할 수 있으며
	
	application 객체에 저장된 값은 어떤 브라우저에서 접근해도
	같은 값을 줍니다.
	
	application 객체에 한 번 저장된 데이터는
	서버르 끄기 전 까지 유지가 됩니다.
	
*/

	int visitCnt =0;
	
	Integer temp=(Integer)application.getAttribute("visit"); 
	if(temp !=null){
		visitCnt=temp;
		}
	visitCnt++;
	
	application.setAttribute("visit",visitCnt);
%>
<hr/>
<h3> 방문자수 : <%=visitCnt %> </h3>