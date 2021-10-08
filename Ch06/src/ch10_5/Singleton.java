/*싱글톤(Singleton)으로 클래스 선언하기 - 1번 방법*/
//(인스턴스를 실제로 호출하려 할 때 만듬.)

package ch10_5;

public class Singleton {
	
//1: 자신 타입의 static필드 선언
	private static Singleton instance;	// null
	
//2: 생성자를 외부에서 접근 못하게 private로 처리
	private Singleton(){}
	
//3: public 메소드로 접근하도록 메소드 선언   
	public static Singleton getInstance() {
		if (instance == null)			//(이미 만든 객체가 없었다면:)
			instance = new Singleton();
		return instance;
	}
}
