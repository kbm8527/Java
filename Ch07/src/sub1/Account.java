package sub1;

		//Account 클래스 정의
public class Account {
	
	
	// 특성(멤버변수)
	// -접근권한 private 선언으로 무조건 캡슐화 한다.
	// -자식클래스에서 참조의 대상이 될때는 protected 선언으로 수정
	protected String bank;
	protected String id;
	protected String name;
	protected int money;
	
	// 생성자 :객체를 생성할 떄 멤버변수를 초기화하는 메서드
	Account(String bank,String id,String name,int money){
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}

	// 기능(멤버메서드) 
	public void deposit(int money) {
		//this지시자는 Account int money 참조
		this.money += money;
		
	}
	public void withdraw(int money) {
		this.money -= money;
		
	}
	public void info() {
		System.out.println("=================");
		System.out.println("은 행 명  : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("입 금 주  : "+name);
		System.out.println("현재잔액 : "+money);
		
	}
	
}
