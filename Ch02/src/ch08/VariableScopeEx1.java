package ch08;

public class VariableScopeEx1 {
	public static void main(String[] args) {
		// (일부러 에러 확인 용이하게 에러난 채로 놔뒀음)
		
		// main메소드 블럭내에서 선언된 로컬변수
		int var1 = 0;

		if (true) {
			System.out.println(var1);
			
			var1 = 1;				// main메소드 내의 if블럭내에서 사용가능.
			// main메소드내의 if블럭에서 선언된 로컬변수
			int var2 = 2;			// 자신이 선언된 블럭내에서 사용가능
			int result = var1 + var2;
			System.out.println(result);
		}
		
		while (true) {				//(무한반복)
			System.out.println(var1);// main에서 선언되고 if블럭에서 값이 바뀐 변수
			
			// main메소드내의 while블럭에서 선언된 로컬변수
			int var3 = 3;
			var1 = 4;				// while블럭에서 새로운 값 저장
			System.out.println(var1 + var3);
			
			var2 = 5;
			break;					// 반복문을 빠져나가게 하는 명령어
		}
		System.out.println(var1);
		System.out.println(var2);	// (if문 안에서만)
		System.out.println(var3);	// (for문 안에서만)
	}
}