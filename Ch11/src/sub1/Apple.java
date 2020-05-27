package sub1;

public class Apple {

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void info() {
		System.out.println("원산지 : "+country);
		System.out.println("가   격 : "+price);
	}
	
	@Override
	public String toString() {
		
		System.out.println("원산지 : "+country);
		System.out.println("가   격 : "+price);
	
		return super.toString();
	}
}
