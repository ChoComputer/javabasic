package calendar1;

import java.util.Calendar;

public class Calendar1 {
	public static void main(String[] args) {
		// Calendar는 현재 시간을 일반 시간이 아닌 요일 이나 오전/오후 등으로 
		// 달력을 기준으로 표기해 주는 방식 입니다.
		// import사용 Calendar.getInstance()를 이용
		Calendar now =Calendar.getInstance();
		
		System.out.println("년도 : "+now.get(Calendar.YEAR));
		// 월은 0이 1월 ,11이 12월 이므로 1으 ㄹ반드시 더해야함
		System.out.println("월 : "+(now.get(Calendar.MONTH)+1));
		System.out.println("일 : "+now.get(Calendar.DAY_OF_MONTH));
		//1이 일요일 7이 토요일 0은 없다.
		System.out.println("요일 : "+now.get(Calendar.DAY_OF_WEEK));
		System.out.println("오전오후 : "+now.get(Calendar.AM_PM));
		System.out.println("시 : "+now.get(Calendar.HOUR));
		System.out.println("분 : "+now.get(Calendar.MINUTE));
		System.out.println("초 : "+now.get(Calendar.SECOND));
		
		// 공휴일은 직접 \\쳐서 넣어야한다
		
		
		
	}

}
