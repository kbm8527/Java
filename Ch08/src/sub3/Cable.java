package sub3;

public class Cable implements Socket {
	
	private Bulb bulb;
	
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	
	public void switchOn() {
		bulb.lightOn();
		
	}

	public void switchOff() {
		bulb.lightOff();
		
	}

}
