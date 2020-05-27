package sub2;

public class CountThread extends Thread{
	
	private Count count;
	
	//»ı¼ºÀÚ
	public CountThread(Count count) {
		this.count = count;
	}
	
	@Override
	public void run() {

		for(int i = 1 ; i<=1000; i++) {
			
			count.setNum();
		}
		
		
	}
}
