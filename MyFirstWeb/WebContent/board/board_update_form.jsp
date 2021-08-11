<%@page import="kr.co.ictedu.board.model.BoardDAO"%>
<%@page import="kr.co.ictedu.board.model.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 수정창에 데이터는 기본적으로 모두 입력이 되어있어야하고
         수정가능한 요소들과 수정안되는 요소로 나눠야함
         여기 form에 detail처럼 db 에서 가져오고 그다음 .jsp파일로 전송해서 form  내부를 채워주기
     DAO에 이미 특정 글번호를 입력하면 그 글의 전체정보를 가져오는 로직이 있으므로
         새로만들지 않고 그 기능을 가지고 와서 작성하기 패턴에서 작성하면됨 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>업데이트 수정창 입니다.</h1>
  <form action="http://localhost:8181/MyFirstWeb/boardupdateok.do" method="post">
  
  <!-- hidden 태그를 이용해 나머지 요소들도 다 첨부해 주세요 -->
  <input type="hidden" value="${board.bId }"name="bId">
  <input type="hidden" value="${board.bHit }"name="bHit">
  <input type="hidden" value="${board.bDate }"name="bDate">
  <input type="hidden" value="${board.bName }"name="bName">
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
			<td><textarea style="resize:none;"name="bTitle">${board.bTitle}</textarea></td> <!-- resize:none 사이즈고정  -->
		</tr>
		<tr>
			<td>본문</td>
			<td><textarea row="20" cols="30" name="bContent">${board.bContent}</textarea></td>
		</tr>
		<tr>
			<td>글쓴이</td>
			<td>${board.bName}</td>
		</tr>
		
			
	</table>
			<a href="/MyFirstWeb/boardselect.do"><input type="button"value="리스트로 돌아가기"></a>
			<input type="submit" value="수정하기">
			<input type="reset" value="초기화">
			</form>
</body>
</html>