//(미완성. 입력하는 성적의 갯수가 정해져있지 않으니 임의의 갯수만큼도 받아야 한다고 가정하고 접근했었음.)

package ch04;
import java.util.Scanner;
import java.util.*;			//(java.util.Arrays.copyOf() 메서드 쓰기 위해)

public class HWArrayScores {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		int[] input_scores = new int[0];		//(null/없는 배열로는 크기 필드가 존재할 수 없어 에러(널 포인터 exception) 생기지만 크기 0 배열 생성은 문제 없다!)
		
		System.out.println("성적들을 한 줄로 입력하시오 (공백으로 구분): ");
		//cf (4번째 답변): https://stackoverflow.com/questions/23506429/how-to-read-multiple-integer-values-from-a-single-line-of-input-in-java
		while( scanner.hasNextInt() ) {			//(아무것도 입력하지 않았던 상태면 hasNextInt()는 입력 대기 상태. 남은 정수 없다면 false로 탈출: https://velog.io/@girean/Java-if-조건문-안에-hasNextInt )
			int temp_input = scanner.nextInt();	//(한 줄로 입력해도 알아서 공백 이후의 다음 숫자 가져옴.) 
//          System.out.println(temp_input);		//(동작 확인용)
            
			//(숫자 추가할 때 마다 그때그때 크기 +1한 새로운 배열로 옮기면서 끝에 입력값 추가. 이를 위해 또다른 임시 저장용 변수가 필요했음.)
//			int temp_arraySize = input_scores.length;	//(초기 배열의 크기를 알고있어야 하므로)
//			System.out.println(temp_arraySize);		//(맨 처음엔 0)
			
			
			//(1: Arrays.copyOf() 메소드 (책에서 같은 Ch에 없음)):			
			input_scores = Arrays.copyOf(input_scores, input_scores.length + 1);	//(원래 배열 크기+1의 새 배열로 기존 내용물들 복사한 새 배열(우항)로 바꿔 참조. -- 메소드 결과물이 복사본 배열 그 자체)
			input_scores[input_scores.length - 1] = temp_input;						//(length 필드에 대해 단항 연산자 쓰면 error: The final field array.length cannot be assigned)
			
			//(2: System.arraycopy() 메소드 사용 - 책 p.168~169):
			//System.arraycopy(input_scores, 0, input_scores, 0, input_scores.length);
			
			
       }

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
				run = !run;	break;		//(T/F 반전해서 저장)
			}
			System.out.println();
//			작성 위치 끝
		}

		System.out.println("프로그램 종료");
		
	}

}
