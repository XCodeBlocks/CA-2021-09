package HW_bank_generic__sample;

import java.text.DecimalFormat;

public class Account {
//필드
	static final String bankNo = "111";		//(아래에서 합칠때 필요)
	static int seq/* = 0*/;						//(현재까지 만들어진 계좌 개수 (counting))	//(기본적으로 0으로 초기화되므로, 따로 할당할 필요는 없을 듯?)
	private String ano;
	private String owner;
	private int balance;
//인스턴스 초기화 블럭: 생성자 호출시 무조건 실행 (cf: Ch06 -> ch07 code)
	{			//DecimalFormat : (ano(계좌번호) 자동으로 형식에 맞춰 값을 넣어줌.) 
	/*
		seq++;
		DecimalFormat df = new DecimalFormat("000");
		df.format(seq);
		ano = bankNo + "-" + df.format(seq);
	 */
		//[익명 객체(anonymous object)로 하는 방법] - (1줄로 가능: seq 증가도, 포맷팅하는 것도 한 줄로.):
		ano = bankNo + "-" + ( new DecimalFormat("000").format(++seq) );	//(구별을 위해 추가로 () 처리해둠. 없어도 됨.)
	}

//생성자
	public Account(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}//(이 생성자를 호출하면 자동으로 위의 '인스턴스 초기화' 블럭도 같이 실행.)
//(에전에는 이 생성자를 썼으나, 이제는 자동으로 ano를 할당하는 방식을 쓰므로 생성자 없이도 ano 저장되어 불필요해짐.)-(참고용으로 주석으로 놔둠.)
/*	public Account(String ano, String owner, int balance) {
		this(owner, balance);	//(코드 위치상 위의 생성자를 호출)-(생성자명 그대로 하면 error 발생: 정의되지 않았다고 함)
		this.ano = ano;
//		this.owner = owner;
//		this.balance = balance;
	}
*/
//getter/setter
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}

	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}

	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}

//Account 정보 출력 메소드
	@Override
	public String toString() {
		return "Account [계좌번호=" + ano
					+ ", 계좌주=" + owner
					+ ", 잔고=" + balance + "]";
	}
}
