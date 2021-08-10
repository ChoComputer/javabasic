<%@page import="kr.co.ictedu.board.model.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="kr.co.ictedu.board.model.BoardDAO"%>
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
	<h1>게시물목록</h1>
	<!--  테이블 형태로 작성해보기
	출력할 자료들은
	
	글번호, 글제목,글쓴이,글쓴날짜,조회수 순으로 테이블에 출력하기
	JSTL의 forEach구문을 쓰되 items속성에 "${boardList }"를 넣어주면됨
-->
	<table border="1">
		<thead>
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>글쓴이</th>
				<th>쓴날자</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${boardList}">
				<tr>
					<td>${board.bId }</td>
					<td><a href ="#">${board.bTitle }</a></td>
					<td>${board.bName }</td>
					<td>${board.bDate }</td>
					<td>${board.bHit }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>