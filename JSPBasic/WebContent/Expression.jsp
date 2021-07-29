<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현식!!Expression</title>
</head>
<body>
		<%! public String name ="김철수";
		public int age =20;
		
		// 아래에 원 넓이를 구하는 areaCircle을 선언해 주시고
		// 아래쪽에 표현식 내부에서 호출하도록하기
		// 반지름을 입력받아서 (반지름 제곱*Math.PI);를 실행해서
		// 리턴하는 함수
		public double areaCircle(double halfRound){
			return Math.pow(halfRound,2)*Math.PI ;
		}
		
		%>
		<% 
		out.println("이름 : "+name +"<br/>");
		out.println("나이 : "+age +"<br/>");
		%>

이름: <%= name %><br/>
나이: <%= age %><br/>

원넓이 : <%= Math.round(areaCircle(5)) %><br/>
</body>
</html>