//[-ch10과도 연관: static]
package ch07;

public class InitializationExample {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		p1.print();	p2.print();	p3.print();
	}
}

class Product {
// static필드
	static int cnt;	//(0으로 시작)
// 인스턴스 필드
	int serialNo;
// 인스턴스 초기화 블럭
	{
/*		cnt++;				// static 필드 증가
		serialNo = cnt;		//증가된 static 필드 값을 객체 생성시 각 인스턴스 변수에 저장
*/		serialNo = ++cnt;	//(같은 내용을 1줄로 줄이면:)-(단항연산자 순서!)
	}
// 인스턴스 메소드
	void print() {System.out.println("제품 번호: " + serialNo);}
}