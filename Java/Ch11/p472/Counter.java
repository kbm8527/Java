package p472;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	protected void finalize() throws Throwable {
		System.out.println(no + "¹ø °´Ã¼ÀÇ finalize()°¡ ½ÇÇàµÊ");
	}
}
