package exercise;

public class Exercise08 {

	public static void main(String[] args) {
		
		int[][] array ={
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
//작성 위치
		int count = 0;	//(평균을 위해 총 개수 추적하기 위한 변수)
		for (int[] firstRow : array) {		//2차원 배열이므로 일단 겉의 {} 부분부터
			for (int entry : firstRow) {	//일반 for문의 증감부에 넣으면 안 됨: (다음번 루프 때 조건 만족 여부 무관하게 일단 (증감부에서) 추가하고 보므로 +1 넘침. 관리 문제)
				sum += entry;		//처음에 선언할 때 이미 0으로 했으므로 바로 합산 시작해도 됨.
				count++;			//(총 항목 개수 추적)
			}
		}
		avg = (double) sum / count;		//원래 (int/int) 기 때문에 최소한 한 쪽은 강제로 double로 형변환 시켜야 함. 
/*		
		int count = 0;
		for (int y = 0; y < array.length; y++) {	//(위의 행렬같은 구조에 기반)
			for (int x = 0; x < array[y].length; x++) {
				sum += array[y][x];
				count++;
			}
		}
		avg = (double) sum / count;
*///작성 위치 끝
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
