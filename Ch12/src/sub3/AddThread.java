package sub3;

public class AddThread extends Add implements Runnable {

	private int start;
	private int end;
	
	//»ı¼ºÀÚ
	public AddThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		
		for(int k=start; k<=end; k++) {
			setNum(k);
		}
		
	}

}
