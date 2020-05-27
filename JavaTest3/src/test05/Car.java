package test05;

public class Car {
	private String name;
	private int price;
	//생성자
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void info() {
		System.out.println("=================");
		System.out.println("차량명 : "+name);
		System.out.println("가  격  : "+price);
		
	}
}
