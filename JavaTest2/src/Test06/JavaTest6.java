package Test06;
import java.util.Scanner;
/*
 * 날짜 : 2020/05/07
 * 이름 : 김보미
 * 내용 : 함수 연습문제
 */
public class JavaTest6 {
	public static void intro() {
		System.out.println("******* START *******");
		System.out.println("두개의 정수를 입력");
	}
	
	public static int input (String name) {
		System.out.print("변수 "+name+"값 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
	
	public static void result(int val) {
		System.out.println("덧셈 결과 : "+val);
		System.out.println("******* END *******");
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		intro();
		
		int a = input("a");
		int b = input("b");
		
		int output = add(a,b);
		result(output);
	}
}
