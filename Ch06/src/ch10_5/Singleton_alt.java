/*싱글톤(Singleton)으로 클래스 선언하기 - 1번 방법*/
//(인스턴스를 실제로 호출하려 할 때 만듬.)-(실행 속도는 더 빠르지만 메모리가...)

package ch10_5;

public class Singleton_alt {
	
//1: 자신 타입의 static필드 선언
	private static Singleton_alt instance = new Singleton_alt();
	
//2: 생성자를 외부에서 접근 못하게 private로 처리
	private Singleton_alt(){}
	
//3: public 메소드로 접근하도록 메소드 선언
	public static Singleton_alt getInstance() {
		return instance;
	}
}