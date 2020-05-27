package test08;

public class Computer extends Product{

	public Computer(String category,int price) {
		super(category,price);
	}
	
	public void info() {
		System.out.println("力前盒幅 : "+category);
		System.out.println("力前啊拜 : "+price);
	}
}
