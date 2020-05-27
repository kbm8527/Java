package sub3;

public class Adder {

	// 멤버변수
	private int x;
	
	// 생성자
	Adder(int x){
		this.x = x;
	}
	
	//getter, setter 메서드  get x = x
	// - 외부에서 멤버변수에 대한 직접참조가 필요할 경우 사용하는 메서드
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void add(int x) {
		this.x = x + 50;
	}
	
	public void add(int[] arr) {
		arr[0]++;
		
	}
	public void add(Adder a1) {
		int x = a1.getX() + 40; // a1.x = a1.x + 40
		a1.setX(x);  // 출력 후 a1 메모리에서 소멸한다
	}
	public void addNew(Adder a2) {
		a2 = new Adder(1); // a값 복사 
		
	}
}
