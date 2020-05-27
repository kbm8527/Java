package sub1;
//Account:parent,super , stockaacount:child,
public class StockAccount extends Account{
	
	private String stock;
	private int amount;
	private int price;
	
	//초기화
	StockAccount(String bank, String id, String name, int money,String stock,int amount,int price) {
		super(bank, id, name, money);//super는 부모클래스 생성자 호출
		
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}
	
	public void sell(int amount) {
		this.amount -= amount;
	}
	public void buy(int amount) {
		this.amount += amount;
	}
	public void info() {
		System.out.println("=================");
		System.out.println("은 행 명  : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("입 금  주 : "+name);
		System.out.println("현재잔액 : "+money);
		System.out.println("주식종목 : "+stock);
		System.out.println("주식수량 : "+amount);
		System.out.println("주식가격 : "+price);
	}
}
