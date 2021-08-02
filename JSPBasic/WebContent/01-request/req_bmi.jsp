<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 사용자의 키(height)와 체중 (weight)를 입력받아 BMI 지수를 계산해 출력하는 form 및 출력페이지를 만들기

	1. 사용자의 입력값을 서버로 전송할때는 form태그 사용
	2. input 태그에 name속성으로 요청자료를 부를 명칭을 정할 수가 있다.
	3. submit 버튼을 사용하여 action= 에 지정한 페이지로 자료가 전송
	          	req_bmi.jsp ===> req_bmi_result.jsp
	 --%>
		<form action="req_bmi_result.jsp" method="post">
		키 :  <input type="text" name="height"size="10px">cm<br/>
		체중 : <input type="test" name="weight"size="10px">kg<br/>
		<input type="submit" name="submit">제출
		<input type="reset" name="reset">초기화<br/>
		
		</form>
</body>
</html>