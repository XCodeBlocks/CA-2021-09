//[promotion/upcasting (자동 타입 변환)]:
package ch07;

//[클래스들 선언]:
class A {}
class B extends A{}
class D extends B{}

class C extends A{}
class E extends C{}

//[실행부]:
public class PromotionExample {
	public static void main(String[] args) {
		
		B b=new B();
		C c=new C();
		D d=new D();
		E e=new E();
		
		//대입 - promotion
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1=d;
		C c1=e;
		
		//불가능: 상속관계가 아님. (compile error - type mistmatch)
		//B b3=e;
		//C c2=d;
		
		//처음에 B타입으로 생성 후 부모타입으로 promotion후 다시 원래타입(B타입)으로 casting가능.
		B b4 =(B)a1;
		// 처음부터 부모타입 객체를 자식참조변수에 대입 불가
		//B b5 = new A();
		
		// Cat은 Dog이 될수 없음.
		B b6 = new B();
		C c6 = new C();
		
		//불가능: (runtime시 발생 error) java.lang.ClassCastException 발생 
		A a6 = b6;
		c6 = (C)a6;
	}
}
