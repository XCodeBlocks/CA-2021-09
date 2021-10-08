package ch03_1;

//생성자는 (하위 클래스로의) 상속에서 제외됨
public class GrandParent {
	public GrandParent() {
		System.out.println("<호출순: 3> 최상위 부모생성자는 가장 나중에 호출되지만, 실행은 가장 먼저됨.\t\t<실행순: 1>");
	}
}

//상속된 클래스의 컴파일시 자식생성자에 super() 메소드가 자동 추가됨.
class Parent extends GrandParent {
	public Parent() {
		// super();		//(생략해도 자동 호출)
		System.out.println("<호출순: 2> 자식클래스로 부터 호출된 후 부모클래스를 호출, 부모클래스 실행 후 실행됨.\t<실행순: 2>");
	}
}

class Child extends Parent {
	public Child() {
		// super();		//(생략해도 자동 호출)
		System.out.println("<호출순: 1> 가장 먼저 호출되지만, 실행은 부모생성자 완료후 가장 나중에 실행됨.\t<실행순: 3>");
	}
}
