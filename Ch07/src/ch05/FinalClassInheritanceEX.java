package ch05;

class Parent {
	void method1() {}
	// final 메소드 - 자식클래스에서 재정의 불가
	final void method2() {System.out.println("hello");}
}
class Child extends Parent {
	//재정의 가능
	void method1() {System.out.println("재정의");}
	//재정의 불가
	//void method2() {}	//(컴파일 에러: Cannot override the final method from Parent)
}

//(실행용)
public class FinalClassInheritanceEX {
	public static void main(String[] args) {
		Child child = new Child();
		//(그냥 추가 확인용. 이 소스코드에서는 클래스들에서 재정의 가능한지 여부를 위주로 볼 것!)
		child.method1();
		child.method2();
	}
}