package exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max=0;
		int[] array={1, 5, 3, 8, 2};
		
		//작성 위치
		for (int x = 0; x < array.length; x++) {
			if (max < array[x]) {
				max = array[x];
			}
		}	//(이클립스 IDE의 자동완성으로도 위와 꽤 비슷한 템플릿이 있음.)
//(향상된 for문 + 1줄로):        
//		for (int sample : array) if (max < sample) max = sample;
		//(작성 위치 끝)
        
        System.out.println("max: " + max);
	}
}
