package test08;

public class Television extends Product {
	
	public Television(String category, int price) {
		super(category,price);
	}
	public void info() {
		System.out.println("力前盒幅 : "+category);
		System.out.println("力前啊拜 : "+price);
	}
}
