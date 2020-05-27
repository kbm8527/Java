package test07;

public class JavaTest7 {
	public static void main(String[] args) {
		Customer kim = new Customer(1001,"김춘추");
		VipCustomer lee = new VipCustomer(1002,"이순신");
		
		System.out.println("김춘추님이 지불할 금액 : "+kim.calcPrice(10000));
		System.out.println("이순신님이 지불할 금액 : "+lee.calcPrice(10000));
		
		kim.showInfo();
		lee.showInfo();
		
	}
}
