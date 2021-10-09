//[promotion, downcasting(강제 형변환)]:
package ch07;

class Person_ {
	String name;
	String id;
	
	public Person_(String name) {
		this.name = name;
	}
}
class Student_ extends Person_ {
	String grade;
	String department;
	public Student_(String name) {super(name);}
}

//(실행부)
public class PersonEX {
	public static void main(String[] args) {
		Person_ p;
		Student_ s = new Student_("홍길동");
		p = s;	//promotion(upcasting)
		Person_ p_ = new Student_("이름");	//(promotion을 한 줄로)
		
		//원래 부모클래스에 존재하는 필드는 접근가능
		System.out.println(p.name);
		//자식클래스에서 추가된 메소드는 부모타입으로 형변환 후에는 접근 불가 ('~' cannot be resolved or is not a field)
		//p.grade="A";
		//p.department="Com";
		
		//강제 형변환(downcasting)
		s = (Student_) p;	//원래 자식타입으로 변환
		
		//가려졌던 자식영역의 필드와 메소드에 접근 가능
		System.out.println(s.name);
		s.grade = "A";
		s.department = "Com";
	}
}
