<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 1. 세션을 통해 아이디를 가져옵니다.
    	//    만약 로그인 상태가 아니면 로그인창으로 리다이렉트합니다.
    	String idSession=(String)session.getAttribute("s_id");
    	//String nameSession=(String)session.getAttribute("s_name");
    	//String emailSession=(String)session.getAttribute("s_email");
    
    if(idSession == null){
    	response.sendRedirect("user_login_form.jsp");
    }
    	
        // 2. DAO를 통해  UsersVO를 가지고 와야합니다.
    	UsersDAO dao = UsersDAO.getInstance();
    	UsersVO user=new UsersVO();
		user.setUid(idSession);    	
       	
    	// 3. 들고온 UsersVO를 통해 아래 html태그의 value속성에
    	//	  UsersVO의 아이디 , 이름 , 이메일을 기입하게 만들어 줍니다.
    	UsersVO resultData=dao.getUserInfo(user);
    	
    	
    	if(resultData.getUid()==null){
    		session.invalidate();
    		response.sendRedirect("users_login_form.jsp");
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="user_update_ok.jsp" method="post">
		<input type="text" name="id" value="<%=resultData.getUid() %>" readonly="true"><br/> <%-- disable는 모이기만하고 전송 ㄴㄴ --%>
		<input type="password" name="pw" placeholder="pw"><br/>
		<input type="text" name="name" value="<%= resultData.getUname() %>"><br/>
		<input type="email" name="email" value="<%= resultData.getEmail() %>"><br/>
		<input type="submit" value ="수정" ><br/>
		
	</form>

</body>
</html>