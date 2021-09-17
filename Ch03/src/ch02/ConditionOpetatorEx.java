package ch02;

public class ConditionOpetatorEx {

	public static void main(String[] args) {
		
//		[1]
		int x=5;
		int y=3;

		int s;
		//조건문을 이용한 처리
		if(x>y) s=1;
		else s=-1;
		System.out.println(s);

		//삼항식을 이용한 처리
		s= x>y ? 1:-1;
		System.out.println(s);
		
		
//		[2]
		int a=5;
		int b=3;
// 조건 ? 참 : 거짓
		System.out.println("두 수의 차는 "+( a>b ? a-b : b-a ));

		// a가 크다, b가 크다, 둘 다 같다. 
		// 조건 ? 참 : (조건? 참 : 거짓) 
		System.out.println("두 수의 차는 "+( a>b ? "a가 크다" : a<b ? "b가 크다" :"같다"   ));
	}
}
