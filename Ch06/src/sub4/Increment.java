package sub4;

public class Increment {
	
	private int num1;
	// 정적변수(클래스 변수)
	private static int num2;
	
	
	// 해당 클래스 표준 생성자(필수)
	public Increment(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	// 사용자 정의 생성자(옵션)
		public Increment() {
			num1++;
			num2++;
			
			System.out.println("num1 :"+num1);
			System.out.println("num2 :"+num2);
		}
		
	//정적 메서드(클래스 메서드)
	public static void add() {
		// static 메서드에서는 none static 변수를 참조 할 수 없다.
		//num1++;
		num2++;
	}
}
