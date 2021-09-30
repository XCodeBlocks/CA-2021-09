package exercise;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
//(여기서부터 각 분기에 대한 내용 채우기)
			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				//(향상된 for문 사용 불가: 대입 필요 (향상된 for문은 읽은 요소에 대입 불가) + (아래의 이유도 해당).)
				for (int x = 0; x < studentNum; x++) {
					System.out.print("scores["+ x +"]> ");
					scores[x] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				//(향상된 for문 사용 불가: 실행 결과대로면 index 값을 출력해야 해서)
				for (int x = 0; x < studentNum; x++) {
					System.out.println( "scores[" + x + "]:" + scores[x] );
				}
			} else if (selectNo == 4) {		//<Exercise08 코드 참고>
//				double avg = 0;		//(0.0 이렇게 안해도 일단 문제는 없는 듯? 상수라 그런가..?)
				int sum = 0, max = 0;		//(avg 변수 사용이 의무가 아니라서 그건 직접 아래에서 연산식으로 바로 해결.)
				
				for (int score : scores) {	//(향상된 for문 이용):
					sum += score;
					if (max < score)	max = score;	//(최대값 갱신)
				}	//(이미 평균 계산에 필요한 학생수는 1번 메뉴에서 받아 저장된 상태이므로 따로 카운트할 필요 X)
				
				System.out.println("최고 점수: "+ max);
				System.out.println("평균 점수: "+ (double) sum / studentNum );		//(avg)
				
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
