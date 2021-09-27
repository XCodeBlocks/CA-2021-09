package exercise;
import java.util.Scanner;
public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
//			작성 위치
			//(메뉴를 위한 입력값은 다른 용도가 없으니, 별도 변수 없이 이 값의 재사용이 가능한 조건문은 switch)
			switch ( scanner.nextInt() ) {		//(int로 나오는 부분이기에 가능)
			case 1:
				System.out.print("예금액>");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				//(아래는 마이너스통장이 아닌 일반적인 계좌라고 가정하고 코딩)
				int temp = scanner.nextInt();				//(잘못 재입력 받지 않게 하려면 값을 임시 저장하는 곳이 필요함.(메소드째 그대로 쓰면 다시 입력 받음) -- 연산결과를 2번 비교해야 해서 필요)
				if   ( (balance -  temp) < 0 )	System.out.println("error:계좌에 충분한 잔액이 없습니다!");
				else	balance -= temp;		//(위에서는 실제 연산은 하지 않고, 메세지만 출력했음. -잔고가 아닌 경우, 이렇게 실제 반영.)
				break;		//(temp 변수는 switch 문의 지역변수라, 나가면 없어짐.)
			case 3:
				System.out.printf("잔고>%d", balance);	break;
			case 4:
				run = false;	break;
			}
			System.out.println();
//			작성 위치 끝
		}

		System.out.println("프로그램 종료");

	}
}
