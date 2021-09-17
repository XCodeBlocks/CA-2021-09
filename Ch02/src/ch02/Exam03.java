package ch02;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 체지방률 = 몸무게 - 체지방량
		// 남성 표준 체지방량 = (1.10 * 체중) - (128 * (체중^2 / 키^2))
		
		final double ST1 = 1.10;
		final int ST2 = 128;
		
		int weight = 75;
		int height = 175;
		
		double result = (ST1 * weight) - ( ST2 * ((weight * weight) / (height * height)) );
		System.out.println(result);
		
		//(형변환 테스트)
		System.out.println( (double)(12 * 12) );
		
	}

}
