package sub1;

/*
 * 날짜 : 2020/05/14
 * 이름 : 김보미
 * 내용 : 중첩클래스 실습하기 교재 p390
 */

import sub1.Outer.Inner;

public class InnerTest {
	public static void main(String[] args) {
		
		Outer out = new Outer(10);
		out.info();
		
		Inner inner = out.new Inner(20);
		inner.info();
	}
}
