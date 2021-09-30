//열거 타입  메소드들
package ch05;

import java.util.Scanner;

public class EnumMethodExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();		//열거 타입 상수 -> String 타입으로 변환
		System.out.println(name);
		
//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);//0 - 2
		int result2 = day2.compareTo(day1);//2 - 0
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드 : String -> 열거
		System.out.print("요일을 열거상수 형식으로 입력해주세요: ");
		String strDay = scanner.next();
		Week weekDay = Week.valueOf(strDay);// 스캐너로 입력받은 문자열을 -> Week상수로 변환
		
//(1: if-else 문으로 분류)
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {	//(enum 상수 바로 비교)
			System.out.println("주말 이네요.");
		} else {
			System.out.println("평일 이네요.");
		}
//(2: switch 문을 써서 분류: ordinal() 메소드가 정수를 리턴하므로 switch의 조건과 case에 활용 가능!)
		switch ( weekDay.ordinal() )	{
		case 0: case 1: case 2: case 3:
		case 4:			System.out.println("평일 이군요."); break;
		case 5:	case 6:	System.out.println("주말 이군요."); break;
		}
		System.out.println("------------");
		
//vaules() 메소드 
		Week[] days = Week.values();
		
		for(int i=0;i<days.length;i++)
			System.out.print(days[i]+" ");
		System.out.println();
		
		//(향상된 for문으로도 가능)
		for(Week d:days)			//enum 타입 변수, enum 타입 배열
			System.out.print(d+" ");
		System.out.println();
	}
}
