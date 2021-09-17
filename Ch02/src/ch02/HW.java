package ch02;

public class HW {

	public static void main(String[] args) {
		// 체지방량 = 몸무게 - 제지방량
		// 남성 표준 제지방량 = (1.10 * 체중) - (128 * (체중^2 / 키^2))

		final double ST1 = 1.10;
		final int ST2 = 128;
		
		int weight = 75;
		int height = 175;
		
		//제지방량(lean mass)
		double leanMass = (ST1 * weight) - ST2 * ((weight * weight) / (height * height));
		System.out.println(leanMass);
		
		
		//(1.1 * wtKg) - 128 * (wtKg/htCm)^2
		System.out.println("DEBUG:");
		System.out.println(1.1 * weight - 128 * Math.pow( (weight / height), 2));

		
//		자료 2번 방법:
		// 체지방률% = (체지방량kg * 100 ) / 체중kg
		double fat = weight - leanMass;
		double fatPercent = fat * 100 / weight;
		System.out.println(fatPercent);
		
		
//		자료 1번 방법:
		// 제지방률% = (제지방량kg * 100 ) / 체중kg
		double leanMassPercentage = leanMass * 100 / weight ;
		System.out.println(leanMassPercentage);
		
		// 체지방률% = 100 - 제지방률%
		System.out.println(100 - leanMassPercentage);
				
	}

}
