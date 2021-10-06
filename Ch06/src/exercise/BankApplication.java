package exercise;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 |3. 예금 | 4. 출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
//작성 위치
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		
		//(원래는 객체 생성하면서 바로 입력값 받게 할 수 있지만, 예시 출력에서 일일이 출력해야 하므로 그렇게 할 수 없음.)
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		for (int n = 0; n < accountArray.length; n++) {
			if (accountArray[n] == null) {		//(아직 안 만든 계정인 경우 - 할당하고 종료)
				accountArray[n] = new Account(ano, owner, balance);	//(위에서의 입력값들)
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;	//(빈 항목 탐색 종료)
			}
		}
		//(예시 출력에는 없지만 추가로 넣어봄.):
		//이 부분에 계좌 수가 100개 이상 넘었을때 동작. 끝까지 다 돌고도 break 없이 완전히 돌면 여기까지 오므로
		System.out.println("ERROR: 계좌 수가 100개를 초과했습니다. 더 이상 추가할 수 없습니다.");
	}

	// 계좌목록보기
	private static void accountList() {
//작성 위치
		//(향상된 for문 사용):
		for (Account current_account : accountArray) {
			if (current_account == null)	break;	//(읽을 항목이 없다면 나머지 루프 생략)
			
			System.out.print(current_account.getAno());
			System.out.print("\t");
			System.out.print(current_account.getOwner());
			System.out.print("\t");
			System.out.print(current_account.getBalance());
		}
	}

	// 예금하기
	private static void deposit() {
//작성 위치
		System.out.println("---------------");
		System.out.println("예금");
		System.out.println("---------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int balance = scanner.nextInt();

		Account account = findAccount(ano);	//(양 분기에서 다 활용하므로)
		if (account == null) {
			System.out.println("결과: 계좌가 존재하지 않습니다.");
			return;		//(break; 와 유사)
		}
		account.setBalance(account.getBalance() + balance);
		System.out.println("결과: 예금이 성공되었습니다.");
	}

	// 출금하기
	private static void withdraw() {
//작성 위치
		System.out.println("---------------");
		System.out.println("출금");
		System.out.println("---------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);	//(양 분기에서 다 활용하므로)
		if (account == null) {
			System.out.println("결과: 계좌가 존재하지 않습니다.");
			return;		//(break; 와 유사)
		}
		if (account.getBalance() < balance) {
			System.out.println("ERROR: 잔고가 부족합니다.");
			return;		//(break; 와 유사)
		}
		account.setBalance(account.getBalance() - balance);
		System.out.println("결과: 출금이 성공되었습니다.");
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
//작성 위치
		for (Account current_account : accountArray) {
			if (current_account == null)	break;	// (읽을 항목이 없다면 나머지 루프 생략)
			if (current_account.getAno().equals(ano)) {
				return current_account;		//(break의 역활도 겸함.)
			}
		}
		return null;	//(이때까지 계좌 찾지 못한 것이므로)
	}
}
