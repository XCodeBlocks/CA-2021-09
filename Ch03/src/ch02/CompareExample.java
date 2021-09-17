package ch02;

public class CompareExample {

	public static void main(String[] args) {
		
		System.out.println(3 < 5);	// T
		System.out.println(3 > 5);	// F
		System.out.println(1 <= 0);	// F
		System.out.println(10 >= 10);// T
		System.out.println(1 == 3);	// F
		System.out.println(1 != 3);	// T
		
		System.out.println();
		
		System.out.println(!(3 < 5));			// NOT: F
		System.out.println((3 < 5) ^ (1 == 1));	// XOR: T ^ T = F  (같으면 false)
		System.out.println((3 > 5) || (1 == 1));// OR : F or T = T
		System.out.println((3 < 5) && (1 == 1));// AND: T and T = T
		
		System.out.println();
		
		int age =25;
		//자바에서는 사용불가
		//if(20 <= age < 300){}		//(cf: Python 에서만)
		
		if ((age >= 20) && (age < 30)) {
			System.out.println("20대");
		}
		char c = 'x';						// 'x' => ASCII 코드값으로 비교
		if ((c >= 'A') && (c <= 'Z')) {
			System.out.println("영문대문자");
		}
		int x = 50;
		int y = 25;
		if ((x >= 0) && (y >= 0) && (x <= 50) && (y <= 50)) {
			System.out.println("영역내에 있는 좌표");
		}
		
		System.out.println();
		
		// 비교연산
		System.out.println('a' > 'b');	// ascii 값 비교 : 97 > 98
		System.out.println(3 >= 2);		// T
		System.out.println(-1 < 0);		// T
		System.out.println(3.45 <= 2);	// F
		System.out.println(3 == 2);		// F
		System.out.println(3 != 2);		// T
		System.out.println(!(3 != 2));	// F

		System.out.println((3 > 2) && (3 > 4));		// F
		System.out.println((3 != 2) || (-1 > 0));	// T
		System.out.println((3 != 2) ^ (-1 > 0));	// T
		
		
	}

}
