<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>취미/관심사 안내 페이지</title>
</head>
<body>
<%-- 1. 폼을 만들기 . 폼은 travel_check.jsp를 목적지로 가진다
     2. post방식으로 데이터를 전송
     3. radio 버튼으로 관심사에 대한 항목 나열(최소 4개)
     4. radio 버튼을 클릭하면 submit을 누르면 각 radio의 value값을 분석해 
        travel_check.jsp 내부로직이 travel_도시이름.jsp로 리다이렉트 해주기
     5. travel_도시이름.jsp 결과 페이지는 관련도시의 유튜브 동영상을 게시하기
      --%>
      
<form action="travel_check.jsp" method="post">
<h1>여행지 선택</h1>
	<input type ="radio" name="travel" value="hong">홍콩<br/>
	<input type ="radio" name="travel" value="pa">파리<br/>
	<input type ="radio" name="travel" value="pe">스페인<br/>
	<input type ="radio" name="travel"value="we">스위스<br/>
	<input type ="submit" value="제출">

</form>



</body>
</html>