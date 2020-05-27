package test10;

public class Customer implements Buyer,Seller {

	public void sell() {
		System.out.println("판매하기");
	}
	public void buy() {
		System.out.println("구매하기");
	}
}
