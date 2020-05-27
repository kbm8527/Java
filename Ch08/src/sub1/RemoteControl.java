package sub1;

//interface라는 구조체
public interface RemoteControl {

	public abstract void powerOn();
	public abstract void powerOff();
	
	//abstract 생략가능
	public  void chUp();
	public  void chDown();
	
	public void soundUp();
	public void soundDown();
	
	
}
