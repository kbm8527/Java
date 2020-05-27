package test10;
/*  
*  날짜 : 2020/05/01
*  이름 : 김보미
*  내용 : 자바 피보나치 수열 연습문제
*/
public class JavaTest10 {
	public static void main(String[] args) {
		
		int n1 = 1;
		int n2 = 2;
		int n3;
		
		System.out.println(n1+", ");
		System.out.println(n2+", ");
		
		for(int i =1; i<=10; i++) {
			n3 = n1 + n2;
			System.out.println(n3+", ");

			n1=n2;
			n2=n3;
		}
	}
}
