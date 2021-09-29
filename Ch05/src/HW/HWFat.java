package HW;

import java.util.Scanner;

public class HWFat {

	public static void main(String[] args) {
		/*	Ch02-ex03
			성별, 나이, 키, 몸무게 반복 입력 가능
			계속 여부 출력 후 yes/no 값을 받아서 종료 되게 수정
		*/
		// 체지방률 = 몸무게 - 체지방량
		// 남성 표준 체지방량 = (1.10 * 체중) - (128 * (체중^2 / 키^2))
		// 여성 " " =  (1.07 * 체중) - (128 * (체중^2 / 키^2))
		
		double ST1 = 0;	//(아래에서 else 없기 때문에 초기값 필요)
		int ST2 = 0;
		
		String sex;		//(문자열 입력값 그대로 쓸 것이므로)
		int age, height, weight;
		
		Scanner sc = new Scanner(System.in);
		
		//(처음은 무조건 실행, 이후엔 묻고 실행)
		do {
			System.out.println("신체정보 입력하세요>");
			System.out.print("성별 (M/F): ");
			sex = sc.nextLine();
			System.out.print("나이: ");
			age = sc.nextInt();
			System.out.print("키: ");
			height = sc.nextInt();
			System.out.print("몸무게: ");
			weight = sc.nextInt();
			
			System.out.println();
			if ( sex.equals("M") ) {
				ST1 = 1.10;
				ST2 = 128;
			} else if ( sex.equals("F") ) {
				ST1 = 1.07;
				ST2 = 128;
			}
			double leanMass = (ST1 * weight) - ( ST2 * ((weight * weight) / (height * height)) );
//			System.out.println("제지방량: " + leanMass);
			
			//(자료에서 2번 방법)
			double fat = weight - leanMass;
	        double fatPercent = fat * 100 / weight;
	        System.out.println("체지방률(%): " + fatPercent);
			
			System.out.print("다음 값들 계속 입력하겠습니까? (yes/no): ");
			sc.nextLine();	//(버퍼 비우기용: 이 줄이 빠지면 뭔가 다른 게 입력된 것으로 간주해서 바로 종료됨. 이걸 하고나면 입력값이 없으니 입력 대기 상태가 됨.)
		} while ( sc.nextLine().equals("yes") ) ;		//(no 등의 다른 내용을 입력하면 종료)
		
	}

}
