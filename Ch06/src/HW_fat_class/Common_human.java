package HW_fat_class;

public class Common_human {		//(상속 사용)
	
	//[공통 자료]:
//(메인 함수에서와 달리 클래스의 필드 값은 선언시 값 지정 안 해도 기본적인 값을 가지게 되므로 초기화 필요 X)
	int age, height, weight;	
//[생성자] - (이클립스 IDE의 기능으로 원하는 필드들만 선택해 자동으로 생성자 생성 가능)
	public Common_human(int age, int height, int weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}	
//(하위 클래스에서 값을 정할 것이므로 선언만 함.)~~(현재는 테스트 용으로 임의의 값을 미리 집어넣었음)	
	double ST1;		//(0.0)
	int ST2;		//(0)
	
	
//(계산 1단계):
	//(계산식을 노출시키면 런타임 에러(0으로 나눔) 발생):
	/* 책에 나오는지 모르겠지만, 일단 객체에 생성자에서 할 필드 값 할당 완료하기 전에 - 우선적으로 다른 필드의 값들 할당이 다 끝나야 - 그제서야 생성자도 작동하는 듯? 그래서 런타임 에러남.)
	* 이를 피하려면 (1): 변수 선언&계산 자체를 하위 메소드로 밀어버리거나 (상위클래스에서 할 거 다 하고 오므로 이미 상위클래스의 필드들이 채워져있음),
	* (2):계산식을 메소드 안으로 숨기는 식으로 해야할 듯? -- getter를 한번 호출해줘야 하는 번거로움이 있지만, getter부터 부르고 다른 걸 하는 순으로 정해서 동작을 한다면 문제 없을 듯.) 
	<-(ST1, ST2가 0이라서가 아니었음.)*/
	double leanMass /*= (계산식)*/;	//(주석 처리한 /**/ 부분 풀면 runtime error)
	
	public double getLeanMass() {
		leanMass = (ST1 * weight) - ( ST2 * ((weight * weight) / (height * height)) );	//(일단 할당하여 밖에서도 사용)
		return leanMass;
	}
	
//(자료에서 2번 계산방법):
	//double fat = weight - leanMass;
	double fatPercent;
	
	public double getFatPercent() {
		double fat = weight - leanMass;
		double fatPercent = fat * 100 / weight;
		return fatPercent;
	}
	
}
