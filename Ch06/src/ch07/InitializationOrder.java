//[-ch10과도 연관: static 블록 선언(6.10.4)]	//(초기화 순서 확인)
package ch07;

public class InitializationOrder {

	public static void main(String[] args) {
		System.out.println("초기화 테스트 >");
		System.out.println();
		Block b1 = new Block();
		System.out.println();
		Block b2 = new Block();
		//Block b3 = new Block();
	}
}

//[실행 순서 : static초기화 -> 인스턴스 초기화 -> 생성자]
class Block {
	//생성자
	Block() {
		System.out.println("생성자");
	}
	//인스턴스 초기화 블럭: 머리 부분 등 없이 그냥 {}로 묶음. (사실 굳이 블록으로 안 묶더라도 메소드 아닌 부분들을 다 실행하는 듯.) 
	{
		System.out.println("인스턴스 초기화 블럭");
	}	
	//static의 특성: unique특성 - 최초 클래스 로드시 한번만 실행
	static {// static 초기화 블럭
		System.out.println("클래스: static 초기화 블럭");
	}
}
