package sub1;
/*
 *  날짜:2020/05/06
 *  이름:김보미
 *  내용: 자바 Overload Method(함수) 실습하기
 */
public class MethodOverloadTest {
	
	public static void main(String[] args) {
		int r1 = add(1);
		System.out.println("r1 : "+r1);
		
		int r2 = add(1,2);
		System.out.println("r2 : "+r2);
		
		String r3 = add("홍길동");
		System.out.println("r3 : "+r3);
	}// main end
	 //오버로드 메서드
	 //- 함수명이 같지만 매개변수의 갯수와 타입으로 구분하는 메서드
	 	public static int add(int a) {
			return a++;
			
		}
		
		public static int add(int a, int b) {
			return a+b;
			
		}
		public static String add(String name) {
			return name+"님 반갑습니다.";
			
		}
}
