package ch10_5;

public class SingletonMain {
	public static void main(String[] args) {
		
		// multiton방식 - new 생성자();
		// Singleton s1 = new Singleton();
		// Singleton s1 = Singleton.instance;
		
// 클래스명.static메소드호출()
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2 ? "같은 객체" : "다른 객체");		//(3항 연산자: 조건-if-else)
//(싱글톤 객체 선언 방법은 2가지가 있으며, 각각 장단점이 있음.)
		Singleton_alt s3 = Singleton_alt.getInstance();
		Singleton_alt s4 = Singleton_alt.getInstance();
		System.out.println(s3 == s4 ? "같은 객체" : "다른 객체");		//(3항 연산자: 조건-if-else)
	}
}
