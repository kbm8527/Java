package Test08;
/*
 * 날짜 : 2020/05/07
 * 이름 : 김보미
 * 내용 : 자바 팩토리얼 연습문제
 */
public class JavaTest8 {
	public static void main(String[] args) {
		
		int rs1 = factorial(3);
		int rs2 = factorial(4);
		int rs3 = factorial(5);
		
		System.out.println("3! = "+rs1);
		System.out.println("4! = "+rs2);
		System.out.println("5! = "+rs3);
	}
	public static int factorial(int n) {
		
		if( n <= 1) {
			return 1;
		}
		return n * factorial(n-1);
	}
}
