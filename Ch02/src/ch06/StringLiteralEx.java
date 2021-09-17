package ch06;

public class StringLiteralEx {

	public static void main(String[] args) {
		
		//(text)
		String str1 = "Good";
		String str2 = "Morning";
		String str3 = "자바";
		
		//(number)
		String str4 = "3.19";
		String str5 = "26";
		//(숫자형 문자열 -> 숫자 타입으로 변경 가능)
		int n1= Integer.parseInt(str5);
		double d1 = Double.parseDouble(str4);
		
		System.out.println(n1);
		System.out.println(d1);
		double result = n1 + d1;
		System.out.println(result);		
		
		//(single char)
		String str6 = "a";
		
		System.out.println(str1 +" "+ str2 +" "+ str3 +" "+ str4 +" "+ str5 +" "+ str6 );
		
		String str7 = new String("OK");
		System.out.println(str7);		
	}

}
