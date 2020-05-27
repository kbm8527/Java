package test06;

public class Grape {
	private String country;
	private int price;
	
	public Grape(String country, int price) {
		this.country = country;
		this.price = price;
	}
	public void show() {
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
	}
}
