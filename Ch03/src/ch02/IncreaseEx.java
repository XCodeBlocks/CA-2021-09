package ch02;

public class IncreaseEx {

	public static void main(String[] args) {

		int x = -1;
		
		//여기서는 현재의 x값을 연산에 사용하고 싶다.
		if (5 / x++ == 5) {				//(이미 분기 결정하고서 마지막으로 +1 연산)
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
//		x = 0;
		if (5 / x == 5) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		//증가된 x의 값 출력하고 싶다.
		System.out.println(x);
		
		
	}

}
