//(강사 모범답안 바탕으로 약간 변형)
package HW_bank_generic__sample;

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
기존 BankApplication 코드에서
array(배열) 대신 컬렉션(collection)의 List 계열을 쓰는 코드로 변경
+ transfer() : (계좌간) 이체 메소드도 추가할 것
*/

public class BankApplication {
	//[List로 변경]
	static List<Account> accountList = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			//printMenu();
			switch( menuInit()/*sc.nextInt()*/ ){		//(입력: 메소드화)
			case 1: createAccount();	break;
			case 2: accountList();		break;
			case 3: deposit();			break;
			case 4: withdraw();			break;
			case 5: transfer();			break;
			case 6: run = false;//		break;
			}
		}
		System.out.println("프로그램 종료");
	}

//[클래스 메소드]
/*	private static void printMenu() {
		System.out.println("---------------------------------------------------");
		System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.이체 | 6.종료");
		System.out.println("---------------------------------------------------");
		System.out.print("선택> ");
	}
(기존)*/
	private static int menuInit() {		//(개인적으로 추가: switch-case문 안 건들고 해보기)
		System.out.println("---------------------------------------------------");
		System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.이체 | 6.종료");
		System.out.println("---------------------------------------------------");
		System.out.print("선택> ");
	//(예외처리로 숫자 아닌 입력을 안 받게 함. 대신 int로 return 해야함.)
		try {	//(분기처럼 활용 가능)
			return sc.nextInt();
		} catch (InputMismatchException e) {
			//System.out.println(e);
			System.out.println("오류: 잘못된 입력값입니다. 다시 입력하세요.");	//(이걸 생략하면 화면에 아무것도 안 뜨고 그냥 다음 반복(루프).)
			sc.nextLine();	//(버퍼 비우기용: 이것을 (먼저) 하지 않으면 위의 switch-case 문에서 무한루프!)
			return 0;	//(return 값은 필요하므로, 메뉴의 값이 아닌 임의의 int 값으로 했음 -> 이때는 그냥 (정상적으로) 루프 또 도므로 (그리고 입력을 다시 물으므로) 문제 없음.)
		}
	}
	
//[1:계좌 생성하기]:
	private static void createAccount() {
		System.out.println("-------");
		System.out.println("계좌 생성:");
		System.out.println("-------");
	//입력
		System.out.print("계좌주> ");
		String owner = sc.next();
		System.out.print("초기 입금액> ");
		int balance = sc.nextInt();
		
	//계좌 생성
		Account acc = new Account(owner, balance);
	//리스트에 담기
		accountList.add(acc);
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
//[2:계좌 목록 보기]:
	private static void accountList() {
		System.out.println("-------");
		System.out.println("계좌 목록:");
		System.out.println("-------");
		
	/*/(일반 for문 버전):
		//List에 저장된 객체 갯수: size()
		//List에서 index 번호에 해당하는 객체 얻기: get(index)
		for (int n = 0 ; n < accountList.size() ; n++) {
			Account account = accountList.get(n);		//cf: accountList[n] :(배열(array)에서)
			System.out.println(account);
		}
	/*/
	//(향상된 for문 버전) - (size(), get() 메소드들이 불필요해짐):
		for (Account search : accountList) {	//(알아서 끝을 찾고...)
			System.out.println(search);			//(알아서 내용물(객체)을 가져와 주니까.)	//(override한 toString() 때문에 이렇게만 해도 계좌 정보로 출력됨.)
		}	//*/
	}
	
//[3:예금하기]:
	private static void deposit() {
		System.out.println("-------");
		System.out.println("예금:");
		System.out.println("-------");
	//입력
		System.out.print("계좌번호> ");
		String ano = sc.next();
		System.out.print("예금액> ");
		int amount = sc.nextInt();
		
	//해당 계좌번호 찾기
		Account acc = findAccount(ano);
		System.out.println("조회결과: " + acc);
	//해당계좌 존재 여부확인
		if (acc != null) {
			acc.setBalance(acc.getBalance() + amount);
			System.out.println("성공: 예금이 완료되었습니다.");
		} else {
			System.out.println("오류: 계좌번호를 확인해주세요.");
		}
	}
	
//[4:출금하기]:
	private static void withdraw() {
		System.out.println("-------");
		System.out.println("출금:");
		System.out.println("-------");
	//입력
		System.out.print("계좌번호> ");
		String ano = sc.next();
		System.out.print("출금액> ");
		int amount = sc.nextInt();
		
	//계좌정보 조회
		Account acc = findAccount(ano);
	//계좌 존재확인
		if (acc != null) {
			if (acc.getBalance() - amount >= 0) {		//(잔액이 있어야 출금하므로)
				acc.setBalance(acc.getBalance() - amount);
				System.out.println("성공: 출금이 완료되었습니다.");
			} else {
				System.out.println("오류: 잔고가 부족합니다.");
			}
		} else {	//(재확인요청)
			System.out.println("오류: 계좌번호를 확인해주세요.");
		}
	}
	
//[5:이체하기]:
// 1번계좌의 balance-=amount, 2번계좌의 balance+=amount;
	private static void transfer() {
		System.out.println("-------");
		System.out.println("이체:");
		System.out.println("-------");
	//보내는 계좌:
		System.out.print("보내는 계좌번호> ");
		String ano1 = sc.next();
	//받는 계좌:
		System.out.print("받는 계좌번호> ");
		String ano2 = sc.next();
	//이체 금액:
		System.out.print("이체액> ");
		int amount = sc.nextInt();
		
	//(보내는 계좌와 받는 계좌 모두 맞아야됨.)
		if (findAccount(ano1) == null || findAccount(ano2) == null) {	//(검색 결과 미존재)
			System.out.println("오류: 계좌번호를 확인해주세요.");
		} else {	// 계좌번호가 모두 맞으면 이체 처리
			Account a1 = findAccount(ano1);
			Account a2 = findAccount(ano2);
			//보내는 쪽 : 잔고-이체액, 받는 쪽: 잔고+이체액
			if (a1.getBalance() - amount >= 0) {	//(보내는 쪽이 모자라면 안되니까)
				a1.setBalance(a1.getBalance() - amount);
				a2.setBalance(a2.getBalance() + amount);
				System.out.println("성공: 이체가 완료되었습니다.");
			}else{
				System.out.println("오류: 잔고가 부족합니다.");
			}
		}
	}

//[Account 배열에서 ano와 동일한 Account 객체 찾기]:
//참조타입 배열의 값 비교
	private static Account findAccount(String ano) {	//(확인을 위해서는 아래 두 블록 중 하나를 블록 째로 주석처리 할 것!)
		
	//(일반 for문 버전):
		for (int n = 0 ; n < accountList.size() ; n++) {
			Account account = accountList.get(n);	//(n번째 위치의 내용물 return - 여기서는 객체)
			if ( account.getAno().equals(ano) ) return account;		//(찾았다면 찾은 계좌 (객체) return + 탐색 바로 종료)
		}
	//
		
	//(향상된 for문 버전 -- 윗부분 (다른 메소드 내)의 설명 참고):
		for (Account search : accountList) {	//(이 경우는 알아서 다음 해당 객체를 찾아주므로 (ArrayList의) get() 메소드 써서 불러올 필요도 없음.) 
			if ( search.getAno().equals(ano) ) return search;		//(찾았다면 찾은 계좌 (객체) return + 탐색 바로 종료)
		}
	//
		return null;	//(accountList 전체를 찾아도 없는 경우, 아무것도 없다는 의미로)
	}
}
