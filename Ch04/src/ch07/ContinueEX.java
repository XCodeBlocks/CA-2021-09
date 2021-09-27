package ch07;

import java.util.Scanner;

public class ContinueEX {

	public static void main(String[] args) {
// 5개의 정수를 키보드로부터 입력 받고 그 중 양수들만 합한 결과 출력
// (continue 사용할 것)		
		int sum = 0;						//(아무 숫자도 안 더한 값으로 초기화)
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int cnt = 1; cnt <= 5; cnt++) {
			System.out.print("숫자를 입력하세요 (" + cnt + "번째): ");
			int input = sc.nextInt();
						
			if (input <= 0)	continue; 
			sum += input;			//(양수일 때는 이 줄이 넘겨지지 않으므로)
//			System.out.println("중간값: " + sum);
		}
		
		System.out.println("양수의 합은: " + sum);
	}
}
