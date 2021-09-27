package exercise;

public class Exercise06 {

	public static void main(String[] args) {

		for (int y = 1; y <= 5; y++) {		//(y축, 이 부분이 커지면 다음 줄이기 때문에)(최대 줄수 바꾸고 싶으면 '5' 변경)
			for (int x = 1; x <= y; x++) {	//(x축, 오른쪽으로 진행.)(그 행번째 해당하는 수까지 찍으므로)
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
