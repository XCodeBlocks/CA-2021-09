package exercise;

public class Exercise05 {
	
	public static void main(String[] args) {
//		int x, y;	//(변수 저장할 경우 여기서 초기화)
		
		//(출력만 할 거라 변수 저장 안 하면 for문 안에서 초기화해도 상관 없음.)
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4*x + 5*y == 60) System.out.printf("(%d, %d)\n", x, y);
			}
		}
		
	}
}
