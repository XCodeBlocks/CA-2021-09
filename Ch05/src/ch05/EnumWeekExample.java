package ch05;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {

		// 열거타입 변수 선언
		Week today = null;
		
		// 칼랜다타입의 변수 선언, 칼랜다타입 객체 생성(클래스명.getInstance()) 대입
		Calendar cal = Calendar.getInstance();		// 칼랜다객체 생성
		int week = cal.get(Calendar.DAY_OF_WEEK);	// get(현재의 요일값 : Calendar.DAY_OF_Week)
		System.out.println(week);

		// calendar로 부터 읽은 요일 숫자값에 따라 요일 출력
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘은 :" + today);

		// 열거상수 비교
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");

		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
		
	}
}
