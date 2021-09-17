package ch07;

public class VariableLoop {

	public static void main(String[] args) {
		// 1~10 합 출력
        System.out.println(1+2+3+4+5+6+7+8+9+10);
		
		// 1~1000 합 출력
		//변수: 계산 결과를 저장하거나 값을 자동증가 시키거나 변경된 값 저장하는 공간
		int sum = 0;
		for (int x = 1; x <= 1000; x++) {
			sum += x;
			// sum = sum + x;
		}
		System.out.println(sum);
	}

}
