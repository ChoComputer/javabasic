<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>디테일 폼 창</h1><!-- bDate 같이 VO에 있는 거로만 됨 -->
	<table border="1">
		<tr>
			<td>글번호</td>
			<td>${board.bId }</td>
			<td>조회수</td>
			<td>${board.bHit}</td>
		</tr>
		<tr>
			<td>쓴 날짜</td>
			<td>${board.bDate}</td>
		</tr>
		<tr>
			<td>글 제목</td>
			<td><textarea row="20" cols="30"readonly>${board.bTitle}</textarea></td>
		</tr>
		<tr>
			<td>본문</td>
			<td><textarea row="20" cols="30"readonly>${board.bContent}</textarea></td>
		</tr>
		<tr>
			<td>글쓴이</td>
			<td>${board.bName}</td>
		</tr>
	</table>
			<a href="/MyFirstWeb/boardselect.do"><input type="button"value="리스트로 돌아가기"></a>
			
			<form action="/MyFirstWeb/boardupdate.do" method="post">
			<input type="hidden" value="${board.bId}"name="bId">
			<input type="submit" value="수정하기"></form>
			
			<form action="/MyFirstWeb/boarddelete.do"method="post">
			<input type="hidden" value="${board.bId }"name="bId"><!--  사용자 눈에ㅐ는 안보임 -->
			<input type="submit" value="삭제하기">
			<a href="/MyFirstWeb/userlogout.do"><input type="button" value="로그아웃"></a>
	</form>
			

</body>
</html>