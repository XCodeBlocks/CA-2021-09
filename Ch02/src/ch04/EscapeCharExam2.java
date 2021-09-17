package ch04;

public class EscapeCharExam2 {

	public static void main(String[] args) {
		// 다음대로 문장이 나오게 한 줄로:
		/*
		 *	"안녕하세요"
		 *	저는 '용인'에서온		"길동"입니다. 
		 * 	C:\temp\javaworkspave\hello.java
		 */
		//System.out.println("\"안녕하세요\"\n저는 \'용인\'에서온\t\t\"길동\"입니다.\nC:\\temp\\javaworkspace\\hello.java");
		
		//변수를 이용하여:
		String message = "";
		message = "\"안녕하세요\"\n저는 \'용인\'에서온\t\t\"길동\"입니다."
				+ "\nC\\temp\\javaworkspace\\hello.java";
		System.out.println(message);
		
	}
}
