package sub3;


public class Calc {
	
	//싱글톤 객체
	private static Calc instance =  new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	//외부에서 객체생성 못하게 막음
	private Calc() {
		
	}
	
	
	public int plus(int x, int y) {
		int z = x + y;
		return z;
	}
	
	public int minus(int x, int y) {
		int z = x - y;
		return z;
	}
	
	
	public int multi(int x, int y) {
		int z = x * y;
		return z;
	
	}
	// div 메서드는 에러가 발생할 수 있다는 가능성을 throws 선언을 통해 호출하는 쪽에 알림
	public int div(int x, int y)throws Exception {
		
		if(y < 0) {
			//에러가 발생할 때 메서드를 호출하는 쪽으로 에러를 던진다.
			Exception e = new Exception("y가 양수 이어야 합니다.");
			throw e;
			//throw new Exception("y가 1이상 이어야 합니다.");
		}else if(y==1) {
			Exception e = new Exception("y는 1이 되면 안됩니다 .");
			throw e;
			
		}
		
		int z = x / y; 
		return z;
		
	}
	
}
