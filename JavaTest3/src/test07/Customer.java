package test07;

public class Customer {
	protected int id;
	protected String name;
	protected String grade;
	protected int point;
	protected double pointRatio;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "SILVER";
		this.point = 100;
		this.pointRatio = 0.01;
	}
	public int calcPrice(int price) {
		point +=price * pointRatio;
		return price;
	}
	public void showInfo() {
		System.out.println("====================");
		System.out.println("고객번호 : "+id);
		System.out.println("고객이름 : "+name);
		System.out.println("고객등급 : "+grade);
		System.out.println("현재 포인트 : "+point);
		System.out.println("포인트 적립율: "+pointRatio);
	}
}
