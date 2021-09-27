package exercise;

public class Exercise03 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int num = 1 ; num < 100 ; num++) {
			if (num % 3 == 0)	sum += num;
		}
		
		System.out.println("3의 배수의 합: " + sum);
	}

}
