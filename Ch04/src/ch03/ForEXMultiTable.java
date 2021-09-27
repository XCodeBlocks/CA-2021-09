package ch03;

import java.util.Scanner;

public class ForEXMultiTable {

	public static void main(String[] args) {

		int x;
		
		System.out.print("구구단 시작하기 원하는 단의 숫자 입력하세요: ");
		Scanner	sc = new Scanner(System.in);
		x = sc.nextInt();
		
		for (/*x = 1*/ ; x <= 9 ; x++) {
			for (int y = 1; y <= 9; y++) {
				System.out.print(x + "*" + y + "=" + x * y + "\t");
			}
			System.out.println();			// 한줄 밑으로 내리는 명령문;
		}
		System.out.println("x = " + x);		// -> 마지막 x의 값 유지: for문 밖에서 정의된 변수이므로

	}

}
