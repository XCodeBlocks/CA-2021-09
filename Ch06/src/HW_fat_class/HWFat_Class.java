package HW_fat_class;

import java.util.Scanner;

public class HWFat_Class {

	public static void main(String[] args) {
		/*	Ch02-ex03 -> Ch05-HW ->
			클래스 여러개로 분할해서 객체 만들어 활용하는 코드로 변경
			(공식들은 정보 출처 참고하거나, 이거 전단계 코드 확인)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//(처음은 무조건 실행, 이후엔 묻고 실행)
		do {
			System.out.println("신체정보 입력하세요>");
			
		//(성별에 따른 분기 위치 변경: 성별에 따라 어떤 객체 생성할 지 정해야 하므로 + 추가 선언 변수 사용 줄이기 위해)
			Common_human info_set = null;	//(초기화 안 하면 밑의 메소드 호출 부분에서 컴파일 에러--아래 분기가 할당을 보장하지 않으므로!)
			//(ㄴ구체적으로 어떤 객체를 만들 것인지는 아래 분기에서 결정.)
			System.out.println("성별 (M/F), 나이, 키, 몸무게 값들을 차례로 입력하세요:");
			switch ( sc.nextLine() ) {	//(if-else -> switch, 입력값 1개는 분기에서, 3개는 객체 생성하면서 바로 수행.)
				case "M":
					info_set = new Male( sc.nextInt(), sc.nextInt(), sc.nextInt() );
					break;
				case "F":
					info_set = new Female( sc.nextInt(), sc.nextInt(), sc.nextInt() );
					break;
				default:
					System.out.println("입력값 오류: 처음으로 돌아갑니다!");
					System.out.print("다음 값들 계속 입력하겠습니까? (yes/no): ");	//(거의 마지막 명령과 동일)
					continue;		//(while문의 조건부로 -> 다시 입력)
			}
			System.out.println();
			
			System.out.println( "제지방량: " + info_set.getLeanMass() );		//(1단계 계산)
			System.out.println( "체지방률(%): " + info_set.getFatPercent() );	//(2단계 계산)
			System.out.println();
			
			System.out.print("다음 값들 계속 입력하겠습니까? (yes/no): ");
			sc.nextLine();	//(버퍼 비우기용: 이 줄이 빠지면 뭔가 다른 게 입력된 것으로 간주해서 바로 종료됨. 이걸 하고나면 입력값이 없으니 입력 대기 상태가 됨.)
		} while ( sc.nextLine().equals("yes") ) ;		//(no 등의 다른 내용을 입력하면 종료)
		
		/*(필드값 초기화와 생성자 동작 순서 확인용):
		Allocation_order_test test = new Allocation_order_test(8, 3);
		test.testPrint();
		*/
	}
}
