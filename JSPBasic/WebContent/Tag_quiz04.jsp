<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>태그퀴즈4</title>
</head>
<body>

	<%!// 선언부에 작성한 변수들은 단 한번만 선언됩니다.
	// 선언부에 작성한 변수들은 전역변수로 취급되어 외부어디서건 호출 가능
	List<String> fJob = new ArrayList<>();
	String jobName;%>
	<%
		int getNum = (int) (Math.random() * 5);
	switch (getNum) {
	case 0:
		jobName = "전사";
		break;
	case 1:
		jobName = "마법사";
		break;
	case 2:
		jobName = "도적";
		break;
	case 3:
		jobName = "사냥꾼";
		break;
	default:
		jobName = "사제";
		break;
	}
	fJob.add(jobName);

	//여기 생각 ... 못풀음 파티에 같은 직업이 몇명있는지 찾는작업
	int cnt = 0;
	for (String player : fJob) {
		if (jobName.equals(player)) {
			cnt += 1;
		}
	}
	%>
	<h2>당신의 역활</h2>
	<p>
		당신에게 부여된 역활은 <b>[<%=jobName%>]
		</b>입니다. 현재 파티에 당신과 같은 역활을 가진 플레이어는
		<%=cnt%>명 입니다.
	</p>

	현재 파티구성
	<p>
		[<%=fJob.toString()%>](<%=fJob.size()%>명 참가중)
	</p>
	<%
		if (fJob.size() == 10) {
		fJob.clear();
	}
	%>


</body>
</html>