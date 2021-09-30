//(무한반복 하는 for문 이용하여 좀 더 깔끔하게 했음. 기존의 코드는 이전 커밋 참고!)

package HW;

import java.util.Scanner;

public class HWLogin {

	public static void main(String[] args) {
		/*  ID / PW 입력 받고
		 *  만약 틀리면 다시 입력 받음.
		 *  5회 연속으로 틀리면
		 *  강제로 프로그램 종료
		 */
		
		//설정된 로그인 정보
		String id = "sample";
		String password = "HW1";
		
		System.out.println("로그인 하려면 다음 정보들을 입력하세요.");		//(맨 처음 1번만 띄울 문구라 반복문 밖/이전)
		
		//(어짜피 실패하면 계속 돌거니까 실패한 횟수 저장용 변수 따로 만들어 여기서만 사용)
		for (int failedAttempt = 1 ;  ; failedAttempt++ ) {		//(가운데 조건부를 비우면 true 취급해 무한반복!)	//(break로 탈출할 거기 때문에 굳이 for문 머리 부분에 조건을 넣을 필요 없음.) 
			
//[공통부: 기본적인 기능]
			Scanner sc = new Scanner(System.in);	//(이 블록 내에서만 필요)
			String input_id, input_password;
			
			System.out.print("ID: ");
			input_id = sc.nextLine();
			System.out.print("PW: ");
			input_password = sc.nextLine();
			
			//(성공하면 탈출/반복문 종료, 실패하면 실패 횟수 증가 + 반복)
			if ( id.equals(input_id) && password.equals(input_password) ) {
				System.out.println("로그인 성공!");
				break;		//(for문 탈출)
			}
			
//[실패했을 경우]: 실패했을때만 여기까지 오므로 맨 처음(1회)째라도 위에서 성공했다면 아래는 볼 수 없음.
			System.out.print("("+ failedAttempt +"/5)번째 로그인 실패했습니다.");	//(for문 헤더의 카운터 증가 부분에 넣을 수도 있음. <- 맨 처음 for문 들어왔을 때는 아직 실행하지 않으므로)
	//(횟수에 따른 분기):
			//[5번째 실패하고 온 경우 (for문 전체 반복은 4번째 돌았고 5번째 상태)]:
			if (failedAttempt == 5) {
				System.out.println("\n오류 횟수 초과로 종료합니다. 처음부터 다시 시작해주세요.");	//(그냥 시각적으로 깔끔하게 보이게 하기 위한 맨 앞의 개행.)
				break;				//(다시 입력 받지 않을 것이므로 다른 문구 출력하고 반복문 종료)
			}	//(여기의 'else는 생략 가능: 오로지 반복문 탈출용으로만 위에 if문 사용했으므로.)
			System.out.println(" 다시 입력해 주세요.");							//(이전의 출력에서 이어짐. 최종 출력 형태: 'N번째 로그인 실패~. 다시 입력~.')
			
		}
		/* 여기는 공통부, for 문을 언제 탈출했든 무조건 실행되는 부분이라
			for문 밖에서 선언해서 for문 탈출해도 저장되는 변수를 쓰지 않았으면 어떻게 탈출했는지 구별할 방법이 없으므로 이 부분에는 안 씀.
			만약 프로그램을 강제로 종료하는 메소드를 썼다면 다르게 했을 수도 있음.
		*/
	}
}
