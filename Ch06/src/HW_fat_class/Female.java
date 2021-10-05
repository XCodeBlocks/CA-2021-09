package HW_fat_class;

public class Female extends Common_human {
	
	//[이 클래스만의 데이터 - 필드]:
	private String gender;		//(문자열 입력값 그대로 쓸 것이므로 + 필드는 초기화 필요 X)
	
//	ST1 = 1;	//(여기서 이렇게 할당하면 에러? -> 컴파일 에러...인데 위에를 가리켜서 알기 어려움.)
	
//(역시 이클립스 IDE의 기능으로 자동 생성 가능 - 여기서는 '~ superclass'로 고름. 이렇게하면 대신 (추가) 필드 부분은 직접 쳐야함.)
	public Female(int age, int height, int weight) {
		super(age, height, weight);				//(생성자 맨 첫 줄에 안 쓰면 컴파일 에러)
		ST1 = 1.07;			//(상위 클래스에서 선언했으나 따로 할당하지 않았던 변수들 할당)
		ST2 = 128;
	}
/*(미리 성별 구분하고 오므로 성별 필드가 의미X)
	public Female(String gender, int age, int height, int weight) {
		super(age, height, weight);
		this.gender = gender;
		ST1 = 1.07;
		ST2 = 128;
	}*/
	//(상위 클래스에서 빠졌던 data만 보충하면 상위 클래스 계산을 그대로 쓰면 되니 여기서는 메소드 생략.)	
}
