package ch02;

public class IdentifierExam1 {

	public static void main(String[] args) {
		//변수 선언
		/*
		String @myName = "홍길동";	// 특수문자(@ 등)로 시작하거나
		int n!ce = 30;				// ...그냥 변수명으로 쓰는 것도 안 됨.
		*/
		
		String _name = "일지매";
		int $mon = 1000;
		
//		int 1stJob = 1;			// 숫자로 시작하는 변수명은 안됨
		int job1st = 1;			// 중간에 들어가는 숫자는 허용
		/*
		int my count = 10;		// 변수명 내 (사이) 공백 있으면 안됨
		int your	turn = 2;	// tab도 마찬가지
		*/
		
		// 변수 길이에는 제한 없음
		// coding convention (관례) : 변수명은 소문자로 시작
		// 단어와 단어가 합쳐진 합성어인 경우 합쳐지는 뒤 단어의 첫 글자는 대문자, 나머지는 소문자로 표시
		// (이런 표기법을:) 카멜 표기법 (대소 표시가 낙타 등같아 보인다고 하여)
		String myCountryNameAndMyCityNameAndMyDongIs = "대한민국서울강남";
		
//		String null = "아무것도 없다";	// 'null' 식별자로 사용 불가
		
		// 변수(식별자)는 대소문자 구분. test와 Test는 전혀 다른 변수임.
		int Test = 10;
		int test = 20;
		
		
		
	}
}
