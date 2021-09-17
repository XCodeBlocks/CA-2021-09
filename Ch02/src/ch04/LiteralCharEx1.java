package ch04;

public class LiteralCharEx1 {

	public static void main(String[] args) {
		// 각자의 이름을 유니코드로 출력해보세요:
		
		char first = '\uAE40';
		char middle = '\uC218';
		char last = '\uBBFC';
		
		System.out.println(first);
		System.out.println(middle);
		System.out.println(last);
		
		// char vs. String
		char c1 = ' ';
		//char c2 = '';		//(char는 아무것도 없으면 error)
		String s1 = "";		//(String은 아무것도 없어도 OK )
		
		// \ : 이스케이프 문자
		
	}
}
