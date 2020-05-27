package p411;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.field.turnOn();
		anony.method1(); 
		anony.method2(
				new RemoteControl() {
					public void turnOn() {
						System.out.println("SmartTV¸¦ ÄÕ´Ï´Ù.");
					}
				
				public void turnOff() {
					System.out.println("SmartTV¸¦ ²ü´Ï´Ù.");
				}
				}
				
		);
		
		
	}
}
