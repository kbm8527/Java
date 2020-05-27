package sub3;
/*
 * 날짜 :2020/05/07
 * 이름 :김보미
 * 내용 :객체 메모리 생성 실습하기
 */
public class AddTest {
	
	public static void main(String[] args) {
		
		int []arr = {10,20,30};
		Adder a = new Adder(100);
		
		a.add(100);
		System.out.println("객체 a의 멤버 x : "+a.getX());
		
		a.add(a);
		System.out.println("객체 a의 멤버 x : "+a.getX());
		
		a.add(arr);
		System.out.println("배열 arr의 1번째 원소 : "+arr[0]);
		
		a.addNew(a);
		System.out.println("객체 a의 멤버 x : "+a.getX());
		
		
		
	}
}
