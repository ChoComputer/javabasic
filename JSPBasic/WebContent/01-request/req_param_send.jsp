<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  form 내부에 input 4개 만들기
 	  input 태크의 type 속성은 하나는 text 하나는 pasword
 	  name 속성은 하나는 apple 하나는 banana로 하기
 	  제출 버튼 리셋 버튼 각기 하나씩 만들기 -->
 	  
 	  <!--  form 태그의 action은 데이터가 전달될 목적지 입니다.
 	    	현재 , req_Param_getpost로 날릴 예정 -->
 	<form action="req_param_getpost.jsp" method="post">  <!--  안적으면 자동으로 get post는 적어야함 -->
 	 <input type ="text" name ="id"/>아이디<br/>            <!--  post적으면 한글 인코딩이 안됨 깨짐 request.setCharacterEncoding("utf-8"); 을 상단에 올려야 안깨짐 -->
 	 <input type ="text" name="nick"/>닉네임<br/>
 	 <input type ="pasword" name="pw"/>비밀번호<br/>
 	 
 	 <!--  체크박스 -->
 	 취미 :
 	 <input type ="checkbox" name="hobby" value="cook"/>요리&nbsp;
 	 <input type ="checkbox" name="hobby" value="working"/>운동&nbsp;<br/>
 	 
 	 특기 :
 	 <input type="checkbox" name="good" value="breath"/>숨쉬기
 	 <input type="checkbox" name="good" value="eat"/>먹기
 	 <input type="checkbox" name="good" value="sleep"/>자기
 	 <input type="checkbox" name="good" value="work"/>걷기
 	 <input type="checkbox" name="good" value="run"/>달리기<br/>
 	 
 	 <!-- 성별은 하나만 골라야하므로 radio를 사용합니다.-->
 	 성별 :
 	 <input type="radio" name = "gender" value="male">male&nbsp;
 	 <input type="radio" name = "gender" value="female">female&nbsp;<br/>
 	 전공 :
 	 <input type="radio" name = "major" value="이공계">이공계&nbsp;
 	 <input type="radio" name = "major" value="문학계">문학계&nbsp;<br/>
 	 
 	 <!-- select태그는 선택지를 드롭박스로 줍니다. -->
 	 <select name="region">
 	 <option>서울</option>
 	 <option>경기</option>
 	 <option>충정</option>
 	 <option>전라</option>
 	 <option>경상</option>
 	 <option>강원</option>
 	 <option>제주</option>
 	 </select>
 	 <br/>
 	 <input type ="submit" />
 	 <input type ="reset" /><br/>
</form>
</body>
</html>