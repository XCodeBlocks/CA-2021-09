package HW_fat_class;

public class Male extends Common_human {	//(설명 생략 버전)
	
	private String gender;
		
	public Male(int age, int height, int weight) {
		super(age, height, weight);
		ST1 = 1.10;
		ST2 = 128;
	}
}
