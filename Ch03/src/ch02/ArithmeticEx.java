package ch02;

import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {
		//(입력값을 쓸 것이므로 바로 초기화하진 않았음.)
		int input;
		
		System.out.print("정수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		if (input % 2 == 0) {
			System.out.print("짝수");
		} else {
			System.out.print("홀수");
		}
		System.out.println(" 입니다.");
		
	}

}
