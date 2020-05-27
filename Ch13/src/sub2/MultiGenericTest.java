package sub2;
/*
 * 날짜 : 2020/05/20
 * 이름 : 김보미
 * 내용 : 제네릭 클래스 실습하기 교재 p654
 */
public class MultiGenericTest {
	public static void main(String[] args) {
		
		TV tv = new TV();
		SmartPhone phone = new SmartPhone();
		
		Product<TV,Integer> p1 = new Product<>(tv,100);
		Product<SmartPhone, String> p2 = new Product<>(phone,"Galaxy s20");
		
		p1.show();
		p2.show();
	}
}
