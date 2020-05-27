package sub2;

public class Product<A,B> {
	
	private A item;
	private B info;
	
	public Product(A item, B info) {
		this.item = item;
		this.info = info;
	}
	
	public void show() {
		System.out.println("力前 辆幅 : "+item);
		System.out.println("力前 沥焊 : "+info);
	}
}
