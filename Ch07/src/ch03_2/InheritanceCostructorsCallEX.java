//[상위생성자 호출, super() - 매개변수에 따라, default 생성자 호출 유무]
package ch03_2;

class A {	
	//(default 생성자)
	public A() {
		System.out.println("생성자A");
	}
	//(매개변수 O 생성자)
	public A(int X) {
		System.out.println("생성자 " + X);
	}
}

//부모클래스의 생성자를 선택하여 호출 super();
class B extends A {
	//(default 생성자)
	public B() {
		super(5);	//부모클래스의 생성자 중에 int 타입의 매개변수 있는 생성자를 선택하여 호출.
		System.out.println("생성자B");
	}
	//super() 메소드로 부모클래스의 매개변수 있는 생성자 호출 가능. (호출할 때 매개변수를 넣어서)
	public B(int x) {
		super(x);	//(이렇게 생성자에서 매개변수 있는 상위 생성자를 명시적으로 호출하면 상위 생성자의 default 생성자 호출 X) 
		System.out.println("매개변수 생성자");
	}
	public B(String x) {
		//super();	//(아예 상위 생성자의 어느 형태도 호출하지 않으면:)
		System.out.println(x);		//(test용)
		System.out.println("default 생성자 호출");
	}
}


//(명령 실행용 블록)
public class InheritanceCostructorsCallEX {
	public static void main(String[] args) {
//(객체 생성하면 바로 출력)
		B b1 = new B();			//(매개변수 있는 생성자)
		System.out.println();
		B b2 = new B(7);		//(매개변수 있는 생성자)
		System.out.println();
		B b3 = new B(">test");	//(default 생성자)
		System.out.println();
	}
}
